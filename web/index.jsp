<%-- 
    Document   : index
    Created on : Apr 18, 2017, 11:48:12 PM
    Author     : Hallur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            div{
                border: solid 2px;
                padding-top:300px;
            }
            input, label {
                display:block;
            }
        </style>
    </head>
    <body><center>
        <div>
            <p>PÆLER :<br>
                11 pæler er nok til hvis carporten er 6,0 x 7,8 metrer.
                DET MAKSIMALE
                PÆLERNE KAN GRAVES NED ER 100 CM.<br>
            HVIS FORRESTE STOLPER GRAVES NED 90CM HAR DE LÆNGDEN: 208 CM.<br>
            HVIS BAGERSTE STOLPER GRAVES NED 100CM HAR DE LÆNGDEN: 202 CM.<br>
            Udskæring i stolpen til remmen (dette punkt er måske ikke vigtigt):<br>
            forreste stolper fra 208 cm. til 209 cm.
            bagerste stolper fra 202 cm. til 200 cm.
            
            </p>
            
            <form action="calcPage.jsp" method="post">
            <label>height (between 1 and 5)</label>
            <input type="number" name="height" min="1" max="5">
            <br>
            <label>width (between 1 and 5)</label>
            <input type="number" name="width" min="1" max="5">
            <br>
            <label>length (between 1 and 5)</label>
            <input type="number" name="length" min="1" max="5">
            <br>
            <input type="submit" value="calculate">
            <br>
            
        </form>
        </div>
    </center>
    </body>
</html>
