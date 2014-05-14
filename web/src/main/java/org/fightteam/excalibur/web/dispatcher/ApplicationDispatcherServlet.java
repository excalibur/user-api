package org.fightteam.excalibur.web.dispatcher;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * 主控制器
 *
 * @author faith
 * @since 0.0.1
 */
@WebServlet(name = "appDispatcherServlet", urlPatterns = "/",loadOnStartup = 1)
public class ApplicationDispatcherServlet extends HttpServlet {

    private static HashMap<String, Object> UrlMappings;

    static {
        UrlMappings = new HashMap<>();
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
        //   初始化工场

    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp){
        long startTime = System.currentTimeMillis();

    }
}
