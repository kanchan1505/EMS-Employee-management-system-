
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

public class LoginAuth extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
      response.setContentType("text/html;charset=UTF-8");
         
    try(PrintWriter out=response.getWriter())
    {  
        String userid=request.getParameter("userid");
        String pass=request.getParameter("pass");
              Class.forName("com.mysql.jdbc.Driver");
              HttpSession hs;
               
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kanchan","root","");
              if(con!=null)
              {
                 out.println("<h1>Connected to Login Page</h1>");
              }
              else
              {
                 out.println("<center>Not Connected! Try again.</center>");
              }
              PreparedStatement pst=con.prepareStatement("select * from login where userid=? and pass=?;");
              pst.setString(1, userid);
              pst.setString(2, pass);
              ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
              hs=request.getSession();
                if(rs.getString("type").equalsIgnoreCase("admin"))
                {
                    hs.setAttribute("userid",userid);
                    hs.setAttribute("type","admin");
                     //RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
                    //rd.forward(request,response);
                    response.sendRedirect("Home.jsp");
                }
                    else
                    {  
                       hs.setAttribute("userid",userid);
                       hs.setAttribute("type","admin");
                       RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
                       rd.forward(request,response);
                       // response.sendRedirect("user.html");
                    }
            }
            else
            {
                RequestDispatcher rd=request.getRequestDispatcher("login.html");
                rd.include(request,response); 
                // response.sendRedirect("login.html");
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
