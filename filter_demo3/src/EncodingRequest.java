import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.UnsupportedEncodingException;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/10
 */
public class EncodingRequest extends HttpServletRequestWrapper {
    private HttpServletRequest req;

    public EncodingRequest(HttpServletRequest request) {
        super(request);
        this.req = request;
    }

    @Override
    public String getParameter(String name) {
        String value = req.getParameter(name);
        try {
            value = new String(value.getBytes("iso-8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {}
        return value;
    }
}
