import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/10
 */
public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        // 处理post乱码
        request.setCharacterEncoding("utf-8");

        // 处理get乱码, 调包HttpServletRequest类
        if(httpServletRequest.getMethod().equals("GET")) {
            chain.doFilter(new EncodingRequest(httpServletRequest), response);
        }else if(httpServletRequest.getMethod().equals("POST")) {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
