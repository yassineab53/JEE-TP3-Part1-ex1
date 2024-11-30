package net.yassine.tp3;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Identification")
public class Identification extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupérer les paramètres du formulaire
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        // Vérifier les identifiants
        if ("admin".equals(login) && "admin".equals(password)) {
            // Redirection vers la page succès
            RequestDispatcher rd = request.getRequestDispatcher("succes.html");
            rd.forward(request, response);
        } else {
            // Redirection vers la page échec
            RequestDispatcher rd = request.getRequestDispatcher("echec.html");
            rd.forward(request, response);
        }
    }
}
