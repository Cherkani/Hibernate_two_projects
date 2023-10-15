package ma.projet.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ma.projet.entity.Client;
import ma.projet.service.ClientService;

@WebServlet(name = "checkpassword", urlPatterns = {"/checkpassword"})
public class CheckMotDePasseController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        int code = Integer.parseInt(request.getParameter("code"));
        System.out.println(code);
        HttpSession session = request.getSession();

        String code2 = (String) session.getAttribute("verificationCode");
        int code22 = Integer.parseInt(code2);
        System.out.println(code2);

        Client c = (Client) session.getAttribute("client");
 
            if (request.getParameter("code") != "") {
                if (code22 == code) {
                    response.sendRedirect("updatemotdepasse.jsp");
                } else {
                    response.sendRedirect("verifier.jsp?msg=Le code est incorrect!!");
                }
            } else {
                response.sendRedirect("verifier.jsp?msg=Session vide!!");
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
