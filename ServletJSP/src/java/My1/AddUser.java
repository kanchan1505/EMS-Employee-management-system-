
package My1;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddUser extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
      response.setContentType("text/html;charset=UTF-8");
         
    try(PrintWriter out=response.getWriter())
    {
        String userid=request.getParameter("userid");
        String pass=request.getParameter("pword");
              Class.forName("com.mysql.jdbc.Driver");
              HttpSession hs;
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kanchan","root","");
              if(con!=null)
              {
                 out.println("<h1>Connected</h1>");
              }
              else
              {
                 out.println("<center>Not Connected! Try again.</center>");
              }
              PreparedStatement pst=con.prepareStatement("insert into login values(?,?,?);");
              pst.setString(1, userid);
              pst.setString(2, pass);
              pst.setString(3,"user");
             int i=pst.executeUpdate();
             if(i>0)
             {   hs=request.getSession();
               RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
               // out.println("<center><h1><font color=green>SIGNUP DONE</font></h1></center>");
              String msg="Registred";
              request.setAttribute("msg", msg);
              rd.forward(request, response);
              // response.sendRedirect("login.html");
             }
             else
             {
                 out.println("<center><h1><font color=red>TRY AGAIN</font></h1></center>");
             }
          
            
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
