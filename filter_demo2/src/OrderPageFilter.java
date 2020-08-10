import javax.servlet.*;
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
public class OrderPageFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;
        HttpSession session = httpServletRequest.getSession();
        Object obj = session.getAttribute("loginFlag");
        if(null == obj) {
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+ "/login.jsp");
            return;
        }
        boolean loginFlag = (boolean)session.getAttribute("loginFlag");
        if(loginFlag) {
            chain.doFilter(request, response);
        }else{
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }
    }

    @Override
    public void destroy() {

    }
}
