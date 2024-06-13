package ru.darek.web.math;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.darek.web.RandomGeneratorServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MulServlet", urlPatterns = "/calc/mul")
public class MultiplicationServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(MultiplicationServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
           int a = Integer.parseInt(req.getParameter("a"));
           int b = Integer.parseInt(req.getParameter("b"));
           String result = String.valueOf(a * b);
          out.println("<html><body><h1>" + String.format("%d / %d = %s",a,b,result) + "</h1></body></html>");
        out.close();
    }
}
