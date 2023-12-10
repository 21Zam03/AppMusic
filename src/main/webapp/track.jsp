<%-- 
    Document   : artista
    Created on : 2 mar. 2023, 21:11:29
    Author     : DELL
--%>

<%@page import="com.zam.logica.Disquera"%>
<%@page import="com.zam.logica.Genero"%>
<%@page import="com.zam.logica.Artista"%>
<%@page import="java.util.List"%>
<%@page import="com.zam.controladora.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Css/estilo_track.css"/>
        <title>JSP Page</title>
        <%
            Controladora control = new Controladora();
            List<Artista> lista = control.listarArtista();
            List<Genero> lista2 = control.listarGenero();
            List<Disquera> lista3 = control.listarDisquera();
        %>
    </head>
    <body>
        <div class="seccion-navegador">
            <nav class="navegador">
                <ul class="seccion-navegador-ul">
                    <li><a class="navegador-a" href="index.jsp">ZAM EDM</a></li>
                    <li><a class="navegador-a" href="#">Ultimos Lanzamientos</a></li>
                    <li><a class="navegador-a" href="#">Generos</a></li>
                    <li><a class="navegador-a" href="#">Mezclas</a></li>
                    <li><a class="navegador-a" href="#">Artistas</a></li>
                    <li><a class="navegador-a" href="#">Acerca</a></li>
                    <li class="link"><a class="navegador-a" href="track.jsp">Mas</a></li>
                </ul>     
            </nav>
        </div>
        <div class="seccion-registro-track">
            <div class="contenido">
                <h1>Registre el track</h1>       
                <form action="SVTrack" method="POST">
                    <p>
                        <label>
                            Artista 1: 
                            <select id="artista1" name="artista1">
                                <%
                                    for (int i=0; i<lista.size(); i++) {
                                    %>
                                            <option value="<%=lista.get(i).getNombre()%>"><%=lista.get(i).getNombre()%></option>
                                    <%    }
                                            %>                                   
                            </select>
                        <label/> 
                    <p/>            

                    <p>
                        <label>
                            Artista 2: 
                            <select id="artista2" name="artista2">
                                <option value="Nulo">Nulo</option>
                                <%
                                    for (int i=0; i<lista.size(); i++) {
                                    %>
                                            <option value="<%=lista.get(i).getNombre()%>"><%=lista.get(i).getNombre()%></option>
                                    <%    }
                                            %>                                   
                            </select>
                        <label/> 
                    <p/>

                    <p>
                        <label>
                            Artista 3: 
                            <select id="artista3" name="artista3">
                                <option value="Nulo">Nulo</option>
                                <%
                                    for (int i=0; i<lista.size(); i++) {
                                    %>
                                            <option value="<%=lista.get(i).getNombre()%>"><%=lista.get(i).getNombre()%></option>
                                    <%    }
                                            %>                                   
                            </select>
                        <label/> 
                    <p/>

                    <p>
                        <label>
                            Artista 4: 
                            <select id="artista4" name="artista4">
                                <option value="Nulo">Nulo</option>
                                <%
                                    for (int i=0; i<lista.size(); i++) {
                                    %>
                                            <option value="<%=lista.get(i).getNombre()%>"><%=lista.get(i).getNombre()%></option>
                                    <%    }
                                            %>                                   
                            </select>
                        <label/> 
                    <p/>

                    <p><label for="nombre">Nombre: <input type="text" id="nombre" name="nombre"><label/><p/>
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
                    <p><label for="fecha">Fecha lanzamiento: <input type="date" id="fecha" name="fecha"><label/><p/>  
                    <p><label for="bpm">Bpm: <input type="text" id="bpm" name="bpm"><label/><p/>
                    <p><label for="duracion">Duracion: <input type="text" id="duracion" name="duracion"><label/><p/>
                    <p><label for="escala">Escala: <input type="text" id="escala" name="escala"><label/><p/>
                    <p>
                        <label>
                            Discografia: 
                            <select id="discografia" name="discografia">
                                <%
                                    for (int i=0; i<lista3.size(); i++) {
                                    %>
                                            <option value="<%=lista3.get(i).getNombre()%>"><%=lista3.get(i).getNombre()%></option>
                                    <%      }
                                            %>                      
                            </select>
                        <label/> 
                    <p/>
                    <button type="submit">Enviar</button>
                </form>
            </div>
        </div>
    </body>
</html>
