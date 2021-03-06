package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/10
 */
public class BFilter implements Filter {

    /**
     * 过滤器在服务器启动时就创建
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
         System.out.println("filter B init ...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         System.out.println("filter B execute ...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    /**
     * 过滤器销毁前执行, 用于释放内存
     */
    @Override
    public void destroy() {
        System.out.println("filter B dead");
    }
}
