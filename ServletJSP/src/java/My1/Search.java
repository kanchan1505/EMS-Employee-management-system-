
package My1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Search extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String name=request.getParameter("name");
        String type=request.getParameter("type");
        String msg = null;
        String value=request.getParameter("name");
        RequestDispatcher rd=request.getRequestDispatcher("Search.jsp");
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kanchan","root","");
            Statement st=con.createStatement();
           
        if(type.equalsIgnoreCase("none"))
        {
            msg="<font color=red>Please select the type to be searched</font>";
        }
        else if(type.equalsIgnoreCase("byid"))
        {
        ResultSet rs=st.executeQuery("Select * from emp where empno='"+name+"'");
        if(rs.next())
        {
        msg="</font>"
                + "<font color=black size=\"4\">"
                + "ID:"+rs.getString("empno")+"<br>"
                + "NAME: "+rs.getString("name")+"<br>"
                +"AGE : "+rs.getString("age")+"<br>"
                
                +"DEPARTMENT : "+rs.getString("department")+"<br>"+"SALARY: "+rs.getString("salary")+"<br>"
                +"RANKING : "+rs.getString("ranking")+"<br>"+"</font>";
        }
        else
        {
        msg="<font color=blue> NO RECORD FOUND </font>";
        }
        }
        else if(type.equalsIgnoreCase("byname"))
        {
         ResultSet rs=st.executeQuery("Select * from emp where name='"+name+"'");
        if(rs.next())
        {
        msg="</font>"
                + "<font color=black size=\"4\">"
                + "ID:"+rs.getString("empno")+"<br>"
                + "NAME: "+rs.getString("name")+"<br>"
                +"AGE : "+rs.getString("age")+"<br>"
                
                +"DEPARTMENT : "+rs.getString("department")+"<br>"+"SALARY: "+rs.getString("salary")+"<br>"
                +"RANKING : "+rs.getString("ranking")+"<br>"+"</font>";
        }
        else
        {
        msg="<font color=blue> NO RECORD FOUND </font>";
        }
        }
        request.setAttribute("msg", msg);
        rd.forward(request,response);
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
