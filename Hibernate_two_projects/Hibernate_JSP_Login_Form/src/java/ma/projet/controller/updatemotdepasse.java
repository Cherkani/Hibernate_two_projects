package ma.projet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ma.projet.entity.Client;
import ma.projet.service.ClientService;
import ma.projet.util.Util;

@WebServlet(name = "updatemotdepasse", urlPatterns = {"/updatemotdepasse"})
public class updatemotdepasse extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String password = request.getParameter("password");
        String passwordcnf = request.getParameter("passwordcnf");
        ClientService cl = new ClientService();
       
        String email = (String) request.getSession().getAttribute("email");
         Client c = cl.getByEmail(email);
        
         
        if (password != null && password.equals(passwordcnf)) {
           
            if (true) {
               
                c.setPassword(password);
                cl.update(c);
                response.sendRedirect("auth.jsp?email=" + c.getEmail());
            } else {
                response.sendRedirect("updatemotdepasse.jsp?msg=Session expired or invalid client");
            }
        } else {
            response.sendRedirect("updatemotdepasse.jsp?msg=Incorrect password");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
