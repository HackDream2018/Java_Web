package servletdemo.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/9
 */
public class AServletContext extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext application = super.getServletContext();
        application.setAttribute("name", "TX HI");
    }
}
