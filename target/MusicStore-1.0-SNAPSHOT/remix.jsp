<%-- 
    Document   : remix
    Created on : 5 mar. 2023, 18:50:24
    Author     : DELL
--%>

<%@page import="com.zam.logica.Artista"%>
<%@page import="com.zam.logica.Disquera"%>
<%@page import="com.zam.logica.Genero"%>
<%@page import="com.zam.logica.Track"%>
<%@page import="java.util.List"%>
<%@page import="com.zam.controladora.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            Controladora control = new Controladora();
            List<Track> lista = control.listarTrack();
            List<Genero> lista2 = control.listarGenero();
            List<Disquera> lista3 = control.listarDisquera();
            List<Artista> lista4 = control.listarArtista();
        %>
    </head>
    <body>
        <h1>Registre el remix</h1>
        <form action="SVRemix" method="POST">
            <p>
                <label>
                    Track: 
                    <select id="track" name="track">
                        <%
                            for (int i=0; i<lista.size(); i++) {
                            %>
                                    <option value="<%=lista.get(i).getNombre_track()%>"><%=lista.get(i).getNombre_track()%></option>
                            <%    }
                                    %>                                   
                    </select>
                <label/> 
            <p/>
            <p><label for="nombre">Nombre: <input type="text" id="nombre" name="nombre"><label/><p/>
            <p>
                <label>
                    Artista Remixer_1: 
                    <select id="artista1" name="artista1">
                        <%
                            for (int i=0; i<lista4.size(); i++) {
                            %>
                                    <option value="<%=lista4.get(i).getNombre()%>"><%=lista4.get(i).getNombre()%></option>
                            <%    }
                                    %>                                   
                    </select>
                <label/> 
            <p/>
            <p>
                <label>
                    Artista Remixer_2: 
                    <select id="artista2" name="artista2">
                        <option value="Nulo">Nulo</option>
                        <%
                            for (int i=0; i<lista4.size(); i++) {
                            %>
                                    <option value="<%=lista4.get(i).getNombre()%>"><%=lista4.get(i).getNombre()%></option>
                            <%    }
                                    %>                                   
                    </select>
                <label/> 
            <p/>
            <p>
                <label>
                    Artista Remixer_3: 
                    <select id="artista3" name="artista3">
                        <option value="Nulo">Nulo</option>
                        <%
                            for (int i=0; i<lista4.size(); i++) {
                            %>
                                    <option value="<%=lista4.get(i).getNombre()%>"><%=lista4.get(i).getNombre()%></option>
                            <%    }
                                    %>                                   
                    </select>
                <label/> 
            <p/>
            <p>
                <label>
                    Genero: 
                    <select id="genero" name="genero">
                        <%
                            for (int i=0; i<lista2.size(); i++) {
                            %>
                                    <option value="<%=lista2.get(i).getNombre()%>"><%=lista2.get(i).getNombre()%></option>
                            <%    }
                                    %>                                   
                    </select>
                <label/> 
            <p/> 
            
            <p>
                <label>
                    Disquera: 
                    <select id="disquera" name="disquera">
                        <%
                            for (int i=0; i<lista3.size(); i++) {
                            %>
                                    <option value="<%=lista3.get(i).getNombre()%>"><%=lista3.get(i).getNombre()%></option>
                            <%    }
                                    %>                                   
                    </select>
                <label/> 
            <p/> 
            <p><label for="fecha">Fecha lanzamiento: <input type="date" id="fecha" name="fecha"><label/><p/>
            <p><label for="bpm">Bpm: <input type="text" id="bpm" name="bpm"><label/><p/>
            <p><label for="duracion">Duracion: <input type="text" id="duracion" name="duracion"><label/><p/>
            <p><label for="escala">Escala: <input type="text" id="escala" name="escala"><label/><p/>
                    <button type="submit">Enviar</button>
        </form>
        
    </body>
</html>
