<%-- 
    Document   : artista
    Created on : 2 mar. 2023, 21:21:24
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Artista</title>
    </head>
    <body>
        <h1>Registrar artista</h1>
        <form action="SVArtista" method="POST">
            <p><label for="nombre">Nombre: <input type="text" id="nombre" name="nombre"><label/><p/>
            <p><label for="info">Info:<label/><p/>         
            <textarea id="info" name="info" rows="5" cols="50"></textarea>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
