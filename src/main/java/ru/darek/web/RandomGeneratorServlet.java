package ru.darek.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "CalcServlet", urlPatterns = "/calc")
public class RandomGeneratorServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(RandomGeneratorServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        int min = Integer.parseInt(req.getParameter("min"));
        int max = Integer.parseInt(req.getParameter("max"));
        String result = String.valueOf(min + (int)(Math.random() * (max - min)));
        String html = "<html><body><h1>" + String.format(" %s", result) + "</h1></body></html>";
        out.println(html);
        out.close();
    }
}
