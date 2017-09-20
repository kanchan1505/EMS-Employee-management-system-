package My1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowTable extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<hr color=green><center><h2><font color=\"green\">WELCOME ADMIN</font></h2></center>");
            out.println("<a href=Home.jsp><button type=button>HOME</button></a>");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanchan", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from emp;");
            out.println("<center><table border=2>"
                    + "<tr bgcolor=blue>"
                    + "<th> EMP ID </th>"
                    + "<th> NAME</th>"
                    + "<th> AGE </th>"
                    + "<th> DEPARTMENT </th>"
                    + "<th> SALARY </th>"
                    + "<th> RANKING </th>"
                    + "<th> DELETE </th>");
            while (rs.next()) {
                out.println("<tr >" + "<td>" + rs.getString("empno") + "</td>"
                        + "<td>" + rs.getString("Name") + "</td>"
                        + "<td>" + rs.getString("age") + "</td>"
                        + "<td>" + rs.getString("department") + "</td>"
                        + "<td>" + rs.getString("Salary") + "</td>"
                        + "<td>" + rs.getString("ranking") + "</td>"
                        + "<td>" + "<a href=delete?empno=" + rs.getString("empno") + ">"
                        + "<input type=button value=Delete>"
                        + "</a></td>");
            }
            out.println("</table>");
            if (request.getAttribute("msg") != null) {
                out.println(request.getAttribute("msg"));
                out.println("</center>");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
