/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import javax.servlet.*;

/**
 *
 * @author HP
 */
public class Old_Servlet implements Servlet
{
    ServletConfig con=null;
    public void init(ServletConfig con)
    {
        this.con=con;
        System.out.println("Initialization");
    }
    public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
    {/*ServletRequest*/
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("hey u are in old servlet");
        String s=req.getParameter("fname");
        out.println(s);
        s=req.getParameter("lname");
        out.println(s);
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void destroy()
    {
        System.out.println("Servlet Destroy");
    }
    public String getServletInfo()
    {
        return "copy right 2017-180";
    }
    public ServletConfig getServletConfig()
    {
        return con;
    }
}

   
   