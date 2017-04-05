<%-- 
    Document   : index
    Created on : Mar 26, 2017, 1:20:52 PM
    Author     : Hallur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="width:280px;">
            <div style="float: left; width:100px ;height: 109px;">
                <form action="CreateUserServlet" method="post" >
                    <table border="1">
                        <tbody>
                            <tr>
                                <th>Username</th>
                                <th><input oninput="style.background = '#eeeeee'" type="text" name="name" id="name" value="" placeholder="Username" /></th>
                            </tr>
                            <tr>
                                <th>Password</th>
                                <td> <input oninput="style.background = '#eeeeee'" type="password" name="password" id="password" value="" placeholder="Password" /></td>
                            </tr>
                            <tr>
                                <th>E-mail</th>
                                <th><input oninput="style.background = '#eeeeee'" type="text" name="email" id="mail" value="" placeholder="E-mail" /></th>
                            </tr>
                            <tr>
                                <th>Telephone</th>
                                <th><input oninput="style.background = '#eeeeee'" type="text" name="phone" id="tlf" value="" placeholder="Telephone" /></th>
                            </tr>
                        </tbody>
                    </table>
                    <div style="float: left; width: 190px;">
                    <input type="submit" name="do_this" value="Create User"  />
                    </div>
                </form>
            </div>
            <div style="float: right; width: 190px;"> 
                <input type="submit" value="Back" onclick="window.location = 'Login.jsp'" />
            </div>
        </div>
        <div class="img" style="text-align: center;">
        
        <% try {
                String a = (String) request.getParameter("name");
                String b = (String) request.getParameter("password");
                


                if (a != null && b != null) {%>

        <h1 id="demo"></h1><%} else {
        %> <div style="width: 650px; height: 100px; margin-left: 500px;"><h1>Welcome! To create a user please enter username, email, phone-number and password</h1></div> <%}
            } catch (Exception ex) {
            }%>

        <script>
            var name = "<%= request.getParameter("name")%>";
            var password = "<%= request.getParameter("password")%>";
            var email = "<%= request.getParameter("email") %>";
            var phone = "<%= request.getParameter("phone") %>";
            
            var test = <%= request.getAttribute("usertest") %>;
            
            function myFunction(name, password, email, phone) {
                if (test === true && name !== "" && password !== "" && email !== "" && phone !== ""){
                    return "username " + name + " already exists";
                }
                if (name !== "" && password !== "" &&  email !== "" && phone !== ""
                    && name !== null && password !== null && email !== null && phone !== null) {
                    return "user created: " + name;
                } else {
                    return "you did not fill out all the information needed";
                }
            }
            document.getElementById("demo").innerHTML = myFunction(name, password, email, phone);

        </script>
        <img src="resources/rs.jpg" width="400" height="300" alt="f.p"/>

        </div>
    </body>
</html>
