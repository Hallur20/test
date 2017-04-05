<%-- 
    Document   : index
    Created on : Mar 30, 2017, 2:57:09 PM
    Author     : hvn15
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .fladTagKnapper
            {
                margin-top: -150px;
                color: red;
                border: solid 1px;
                height: 110px;
                width: 500px;
            }
            .trekantTagKnapper
            {
                color: blue;
                border: solid 1px;
                height: 110px;
                width: 500px;
            }
            .msg
            {
                border: solid 1px;
                width: 800px;
            }
            .logo
            {
                display:inline-block;
                height:150px;
                width: 150px;
                
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <title>JSP Page</title>
    </head>
    <body>
        <img src="fogLogo.png" class="logo"></img>
        <br><a href="Login.jsp">log ud</a>
    <center>
        
        <br>
        <div class="fladTagKnapper">
            <h1>Valgmuligheder for fladt tag</h1>
            <button onclick="myFunction('Tagplader')">Tagplader</button>
            <button onclick="myFunction('fladtTagBS')">Beslag og Skruer</button>
        </div>
        <br>
        <div class="trekantTagKnapper">
            <h1>Valgmuligheder for trekantet tag</h1>
            <button onclick="myFunction('fladtTagTræ')">Træ</button>
            <button onclick="myFunction('trekantetTagTagpakke')">Tagpakke</button>
            <button onclick="myFunction('trekantetTagBS')">Beslag og Skruer</button>
        </div>
        <br>
        <div class="msg">
            <h1 id="demo1">Tryk på en knap for at få vist den ønskede tabel</h1>
            <p id="demo2">Tabellen bliver vist her.</p>
        </div>
    </center>

    <script>
        var altt = "<%= request.getAttribute("alttTabel")%>";
        var albsf = "<%= request.getAttribute("albsfTabel")%>";
        var alt = "<%= request.getAttribute("altTabel")%>";
        var altp = "<%= request.getAttribute("altpTabel")%>";
        var albst = "<%= request.getAttribute("albstTabel")%>";
        function myFunction(whichTable) {
            if (whichTable === "Tagplader") {
                document.getElementById("demo1").innerHTML = "Fladt tag, Tagplader";
                document.getElementById("demo2").innerHTML = altt;
            }
            if (whichTable === "fladtTagBS") {
                document.getElementById("demo1").innerHTML = "Fladt tag, beslag og skruer";
                document.getElementById("demo2").innerHTML = albsf;
            }
            if (whichTable === "fladtTagTræ") {
                document.getElementById("demo1").innerHTML = "Trekantet tag, træ";
                document.getElementById("demo2").innerHTML = alt;
            }
            if (whichTable === "trekantetTagTagpakke") {
                document.getElementById("demo1").innerHTML = "Trekantet tag, tagpakke";
                document.getElementById("demo2").innerHTML = altp;
            }
            if (whichTable === "trekantetTagBS") {
                document.getElementById("demo1").innerHTML = "Trekantet tag, beslag og skruer";
                document.getElementById("demo2").innerHTML = albst;
            }
        }
    </script>
</body>
</html>
