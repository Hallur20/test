<%-- 
  by mo
Log in page where we call our login Servlet !
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <h1>Welcome To Fog Login Page!</h1>
        <div style="width:280px;">
            <div style="float: left; width:100px ;height: 56px;">
                <form action="LoginServlet" method="post" name="log" >
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
                        </tbody>
                    </table>
                    <input type="submit" name="do_this" value="Login"  />
                </form>
            </div>

            <div style="float: right; width: 225px "> 
                <form  action="index.jsp" method="post"> 
                  <input type="submit" name="index.jsp" value="Create User"  />
                </form>
            </div>
        </div>
        <div class="img" style="text-align: center;">          
            <img src="resources/rs.jpg" width="400" height="300" alt="f.p"/>
        </div>
    </div>

    <script>
            var a = "<%= request.getParameter("name")%>";
            var b = "<%= request.getParameter("password")%>";
            var c = <%= request.getAttribute("usertest")%>;
            function myFunction(p1, p2) {


                if (p1 === "" && p2 === "") {
                    return alert("please enter a username and password");
                }
                if (p1 === "") {
                    return alert("please enter a username");
                }
                if (p2 === "") {
                    return alert("please enter a password");
                }
            }
            document.getElementById("demo").innerHTML = myFunction(a, b);

    </script>
</body>

</html>
