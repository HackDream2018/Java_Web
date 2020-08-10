import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/10
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String username = req.getParameter("username");
        HttpSession session = req.getSession();
        if(username.indexOf("tianxiang") != -1) {
            session.setAttribute("loginFlag" , true);
            req.getRequestDispatcher("/loginsuccess.jsp").forward(req, resp);
        }else {
            session.setAttribute("loginFlag" , false);
        }
    }
}
