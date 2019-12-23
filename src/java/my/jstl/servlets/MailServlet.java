/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.jstl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import my.java.beans.SendMail;

/**
 *
 * @author girish
 */
public class MailServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session=request.getSession();
            String user=session.getAttribute("user").toString();
            String to=request.getParameter("to").trim();
            String sub=request.getParameter("sub").trim();
            String msg=request.getParameter("msg").trim();
            String sentMessage="Your message has been sent!!";
            //response.getWriter().write(user+","+to+","+sub+","+msg+"");
           
            if(to.isEmpty() || to==null 
                    || sub.isEmpty() || sub==null
                    || msg.isEmpty() || sub==null)
            {
                sentMessage="Something is missing!!";
                response.getWriter().write(sentMessage);
            }else{    
                try{
                Db_Connection dbconn=new Db_Connection();
                Connection conn=dbconn.Connection();
                String query="select email,password from registration "
                        + "where username=?";
                PreparedStatement statement=conn.prepareStatement(query);
                statement.setString(1, user);
                ResultSet rs=statement.executeQuery();
                if(rs.next()){
                    SendMail sm=new SendMail();
                    sm.setUsername(rs.getString("email"));
                    sm.setPassword(rs.getString("password"));
                    sm.setTo(to);
                    sm.setSubject(sub);
                    sm.setMsg(msg);
                    try {
                        sm.send_mail();
                        response.getWriter().write(sentMessage);
                    } catch (MessagingException ex) {
                        response.getWriter().write(sentMessage);
                    }                    
                }
                conn.close();
                }catch(Exception e){
                sentMessage="Something is missing!!";
                response.getWriter().write(sentMessage);                    
                }
                
            }
            
            
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
