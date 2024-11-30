package net.yassine.tp3;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author $ {USER}
 **/
public class Identification extends HttpServlet {

    //private String message;

    /*public void init() {
        message = "Hello World!";
    }*/


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException ,IOException{
        //response.setContentType("text/html");
        //String identification_url = "file:///Y:/TpJee/TP3/src/main/webapp/identification.html";
        RequestDispatcher rd = request.getRequestDispatcher("identification.html");
    }
}
