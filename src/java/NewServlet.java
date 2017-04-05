
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Lager l = new Lager();

        /*request.setAttribute("map", l.makeMap());*/
        String alttTabel = toTabelaltt();
        String albsfTabel = toTabelalbsf();
        String altTabel = toTabelalt();
        String altpTabel = toTabelaltp();
        String albstTabel = toTabelalbst();
        request.setAttribute("alttTabel", alttTabel);
        request.setAttribute("albsfTabel", albsfTabel);
        request.setAttribute("altTabel", altTabel);
        request.setAttribute("altpTabel", altpTabel);
        request.setAttribute("albstTabel", albstTabel);

        request.getRequestDispatcher("access.jsp").include(request, response);

    }

    public static String toTabelaltt() {
        String fill = "<table><tr><th>name</th><th>length</th><th>amount</th><th>unit</th><th>description</th>";
        Lager l = new Lager();
        l.alttData();
        ArrayList<FTræogTagplader> arr = l.altt;
        fill += "<tr>";
        for (int i = 0; i < arr.size(); i++) {
            fill += "<td>" + arr.get(i).getName() + "</td>";
            fill += "<td>" + arr.get(i).getLength() + "</td>";
            fill += "<td>" + arr.get(i).getAmount() + "</td>";
            fill += "<td>" + arr.get(i).getUnit() + "</td>";
            fill += "<td>" + arr.get(i).getDescription() + "</td></tr>";
        }
        fill += "</table>";
        return fill;
    }

    public static String toTabelalbsf() {
        String fill = "<table><tr><th>name</th><th>amount</th><th>unit</th><th>description</th>";
        Lager l = new Lager();
        l.alttData();
        ArrayList<FBeslagogSkruer> arr = l.albsf;
        fill += "<tr>";
        for (int i = 0; i < arr.size(); i++) {
            fill += "<td>" + arr.get(i).getName() + "</td>";
            fill += "<td>" + arr.get(i).getAmount() + "</td>";
            fill += "<td>" + arr.get(i).getUnit() + "</td>";
            fill += "<td>" + arr.get(i).getDescription() + "</td></tr>";
        }
        fill += "</table>";
        return fill;
    }

    public static String toTabelalt() {
        String fill = "<table><tr><th>name</th><th>length</th><th>amount</th><th>unit</th><th>description</th>";
        Lager l = new Lager();
        l.alttData();
        ArrayList<TTræ> arr = l.alt;
        fill += "<tr>";
        for (int i = 0; i < arr.size(); i++) {
            fill += "<td>" + arr.get(i).getName() + "</td>";
            fill += "<td>" + arr.get(i).getLength() + "</td>";
            fill += "<td>" + arr.get(i).getAmount() + "</td>";
            fill += "<td>" + arr.get(i).getUnit() + "</td>";
            fill += "<td>" + arr.get(i).getDescription() + "</td></tr>";
        }
        fill += "</table>";
        return fill;
    }

    public static String toTabelaltp() {
        String fill = "<table><tr><th>name</th><th>amount</th><th>unit</th><th>description</th>";
        Lager l = new Lager();
        l.alttData();
        ArrayList<TTagpakken> arr = l.altp;
        fill += "<tr>";
        for (int i = 0; i < arr.size(); i++) {
            fill += "<td>" + arr.get(i).getName() + "</td>";
            fill += "<td>" + arr.get(i).getAmount() + "</td>";
            fill += "<td>" + arr.get(i).getUnit() + "</td>";
            fill += "<td>" + arr.get(i).getDescription() + "</td></tr>";
        }
        fill += "</table>";
        return fill;
    }
    public static String toTabelalbst(){
        String fill = "<table><tr><th>name</th><th>amount</th><th>unit</th><th>description</th>";
        Lager l = new Lager();
        l.alttData();
        ArrayList<TBeslagogSkruer> arr = l.albst;
        fill += "<tr>";
        for (int i = 0; i < arr.size(); i++) {
            fill += "<td>" + arr.get(i).getName() + "</td>";
            fill += "<td>" + arr.get(i).getAmount() + "</td>";
            fill += "<td>" + arr.get(i).getUnit() + "</td>";
            fill += "<td>" + arr.get(i).getDescription() + "</td></tr>";
        }
        fill += "</table>";
        return fill;
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
