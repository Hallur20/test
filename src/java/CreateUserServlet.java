
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
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/CreateUserServlet"})
public class CreateUserServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        DataMapper dm = new DataMapper();
        ArrayList userList = dm.checkUsernames();
        request.setAttribute("userlist", userList);

        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");

        ArrayList mailList = dm.checkmails();
        request.setAttribute("userlist", userList);
        request.setAttribute("maillist", mailList);
        
        boolean userTest = testUser(userList, name);
        boolean mailTest = testUser(mailList, email);
        
        request.setAttribute("usertest", userTest);
        request.setAttribute("mailtest", mailTest);

        request.setAttribute("usertest", userTest);
        insertUser(name, password, email, phone, request, response, userTest);
    }

    public static boolean testmail(ArrayList ulist, String mail) {
        for (int i = 0; i < ulist.size(); i++) {
            if (ulist.get(i).equals(mail)) {
                return true;
            }
        } return false;
    }
    
    public static boolean testUser(ArrayList ulist, String name) {
        for (int i = 0; i < ulist.size(); i++) {
            if (ulist.get(i).equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void insertUser(String name, String password, String email, String phone, HttpServletRequest request, HttpServletResponse response, boolean test) {
        DataMapper dm = new DataMapper();
        try {
            if (name != null && password != null && email != null && phone != null && !name.equals("") && !password.equals("") && !email.equals("") && !phone.equals("")) {
                if (test == false) {
                    dm.createUser(name, email, phone, password);
                    request.getRequestDispatcher("index.jsp").include(request, response);
                } else {
                    request.getRequestDispatcher("index.jsp").include(request, response);
                }
            } else {
                request.getRequestDispatcher("index.jsp").include(request, response);
            }
        } catch (SQLException | ServletException | IOException ex) {
            Logger.getLogger(CreateUserServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CreateUserServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CreateUserServlet.class.getName()).log(Level.SEVERE, null, ex);
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
