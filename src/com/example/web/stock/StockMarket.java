package com.example.web.stock;
//package StockMarketWeb.src.com.example.web.stock;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class StockMarket extends HttpServlet {

    static String stockAPI = "https://www.twse.com.tw/exchangeReport/STOCK_DAY?response=json&date=%d%02d%02d&stockNo=%d";

    private String crawlData(String year, String month, String day, String symbol) throws IOException {
        System.setProperty("javax.net.ssl.trustStore", "/Users/bryantliu/IdeaProjects/KobeDataScience/src/main/java/ThunderDustMiteWeb/resources/trust_net_cacert/www.twse.com.tw.cer");
        Document doc = Jsoup.connect(
                String.format(stockAPI, Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day), Integer.parseInt(symbol)))
                .ignoreContentType(true).get();
        System.out.println(doc.body().toString());
        return doc.body().toString();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dataYear = req.getParameter("year");
        String dataMonth = req.getParameter("month");
        String dataSymbol = req.getParameter("stock_symbol");

//        ArrayList<String> dataTimeInfo = new ArrayList<String>();
//        dataTimeInfo.add(dataYear);
//        dataTimeInfo.add(dataMonth);
//        dataTimeInfo.add(dataSymbol);
        String stockMarketData = this.crawlData(dataYear, dataMonth, "1", dataSymbol);

        req.setAttribute("stock_market_data", stockMarketData);
        RequestDispatcher view = req.getRequestDispatcher("/stock/stock_result.jsp");
        view.forward(req, resp);
    }

}
