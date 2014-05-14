import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
@WebServlet(name = "app", urlPatterns = "/ccc")
public class ApplicationController extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("1111111");
        resp.getWriter().println("Hello World!");
    }
}
