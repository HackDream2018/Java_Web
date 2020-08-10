package servletdemo.servletcontext;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/9
 */
public class DServletContext extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
       /* resp.sendRedirect("");
        req.getRequestDispatcher("").forward(req, resp);*/
        Class<? extends DServletContext> clazz = this.getClass();
        BufferedReader reader = null;
        InputStream inputStream = clazz.getResourceAsStream("/a.txt");
        reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            System.out.println(reader.readLine());
        } catch (IOException e) {}
    }
}
