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

@WebServlet(name = "DivServlet", urlPatterns = "/calc/div")
public class DivisionServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(DivisionServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        double a =  Double.parseDouble(req.getParameter("a"));
        double b = Double.parseDouble(req.getParameter("b"));
        double c = a / b;
        logger.debug("c = " + c);
        out.println("<html><body><h1>" + String.format("%.2f / %.2f = %.2f",a,b,c) + "</h1></body></html>");
        out.close();
    }
}
