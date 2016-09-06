/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juang.servlet.project.controller;

import com.juang.servlet.project.entity.Person;
import com.juang.servlet.project.service.PersonService;
import com.juang.servlet.project.service.impl.PersonServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juang
 */
@WebServlet(name = "AdminServlet", urlPatterns = {"/admin"})
public class AdminServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PersonService personService = new PersonServiceImpl();
        List<Person> persons = personService.getAll();

        PrintWriter out = response.getWriter();
        try {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminServlet</title>");
            out.println("</head>");

            out.println("<body>");
            out.println("<form method='POST' action='" + request.getContextPath() + "/admin'>");
            out.println("ID:<br>");
            out.println("<input type='text' id='idx' name='idx' style='width:20px' value=''><br>");
            out.println("Nama:<br>");
            out.println("<input type='text' id='nama' name='nama' value=''><br>");
            out.println("Alamat:<br>");
            out.println("<input type='text' id='alamat'name='alamat' value=''><br>");
            out.println("Pekerjaan:<br>");
            out.println("<input type='text' id='pekerjaan' name='pekerjaan' value=''><br>");
            out.println("<input type='submit'><br>");
            out.println("</form>");
            out.println("<h1>Servlet AdminServlet at " + request.getContextPath() + "</h1>");
            out.println("<table border='1px'>");
            out.println("<tr>");
            out.println("<td>ID</td>");
            out.println("<td>Nama</td>");
            out.println("<td>Alamat</td>");
            out.println("<td>Perkerjaan</td>");
            out.println("</tr>");

            for (Person p : persons) {
                out.println("<tr>");
                System.out.println("nama person : " + p.getNama());
                out.println("<td>" + p.getId() + "</td>");
                out.println("<td>" + p.getNama() + "</td>");
                out.println("<td>" + p.getAlamat() + "</td>");
                out.println("<td>" + p.getPekerjaan() + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
