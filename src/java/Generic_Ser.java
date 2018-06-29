

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Generic_Ser extends GenericServlet {

    public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out =res.getWriter();
        out.println("hello in generic servlet");
        String s1=req.getParameter("fname");
        out.println("first name"+s1);
        s1=req.getParameter("lname");
        out.println("last name:"+s1);
    }
}
