/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marik
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        DataMapper dm = new DataMapper();
        ArrayList userList = dm.checkUsernames();
        ArrayList PasList = dm.getUsers();
        
        request.setAttribute("userlist", userList);
        request.setAttribute("Paslist", PasList);

        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        boolean userTest = testUser(userList, name);
        boolean PasTest = testPas(PasList,password);
        request.setAttribute("usertest", userTest);
        request.setAttribute("Pastest", PasTest);
                insert(name,password,request,response,userTest,PasTest);
    

    }
    public static boolean testPas(ArrayList plist,  String password) {
        for (int i = 0; i < plist.size(); i++) {
            if (plist.get(i).equals(password)) {
                return true;
            }
        }
        return false;
    }
    
 public static boolean testUser(ArrayList ulist, String name) {
        for (int i = 0; i < ulist.size(); i++) {
            if (ulist.get(i).equals(name)) {
                return true;
            }
        }
        return false;
    }

     public static void insert(String name, String password, HttpServletRequest request, HttpServletResponse response, boolean useertest,boolean passtest) {
        DataMapper dm = new DataMapper();
        try {
            if (name != null && password != null && !name.equals("") && !password.equals("")) {
                if(useertest == false||passtest==false){
                dm.getUser(name, password);
                request.getRequestDispatcher("Login.jsp").include(request, response);}else {
                    request.getRequestDispatcher("NewServlet").include(request, response);
                }
            } else  {
                request.getRequestDispatcher("Login.jsp").include(request, response);
            }
        } catch (SQLException | ServletException | IOException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
