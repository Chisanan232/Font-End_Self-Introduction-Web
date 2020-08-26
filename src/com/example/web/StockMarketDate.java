//package com.example.web;
package ThunderDustMiteWeb.src.com.example.web;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.PrintWriter;
import java.io.IOException;


public class StockMarketDate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Taiwan Stock Market Date page");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//        String listedCompany = req.getParameter("listed-company");
//        out.println("Listed Company: " + listedCompany + " <br>");

        String listedComp = req.getParameter("listed_company");
        req.setAttribute("listedCompany", listedComp);
        RequestDispatcher viewListedComp = req.getRequestDispatcher("result.jsp");
        viewListedComp.forward(req, resp);
    }

}
