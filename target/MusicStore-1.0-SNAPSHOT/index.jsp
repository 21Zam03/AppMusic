<%-- 
    Document   : index
    Created on : 28 feb. 2023, 16:16:57
    Author     : DELL
--%>
<%@page import="com.zam.logica.Artista"%>
<%@page import="com.zam.logica.Track"%>
<%@page import="java.util.List"%>
<%@page import="com.zam.logica.Genero"%>
<%@page import="com.zam.controladora.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Music Store</title>
        <link rel="stylesheet" href="Css/style.css"/>
        <% 
            Controladora control = new Controladora();
            List<Genero> lista = control.listarGenero();
            List<Track> lista2 = control.listarTrack();
        %>
    </head>
    <body>
        <div class="seccion-navegador">
            <nav class="navegador">
                <ul class="seccion-navegador-ul">
                    <li><a class="navegador-a" href="index.jsp">ZAM MUSIC</a></li>
                    <li><a class="navegador-a" href="#">Musica</a></li>
                    <li><a class="navegador-a" href="#">Generos</a></li>
                    <li><a class="navegador-a" href="#">Mezclas</a></li>
                    <li><a class="navegador-a" href="#">Artistas</a></li>
                    <li><a class="navegador-a" href="#">Acerca</a></li>
                    <li class="link"><a class="navegador-a" href="track.jsp">Mas</a></li>
                </ul>     
            </nav>
        </div>       
        <div class="Primera-seccion">
            <div class="primera-seccion-contenido">
                <h1>ZAM MUSIC</h1>
                <p>
                    Bienvenidos al sitio oficial de DJ ZAM donde encontraras sus ultimas mezclas, edits, mashups  por parte de el y del 
                    mundo de la musica electronica ademas de informacion acerca de los tracks, artistas y disqueras a nivel mundial.
                </p>
                <div class="seccion-boton">
                    <button class="boton">
                        <a class="boton-a" href="#">Empezar</a>
                    </button>
                </div>
            </div>
            <div class="seccion-figura">
                <img class="imagen" src="Img/foto.jpg">
            </div>
        </div>
        <div class="Segunda-seccion">
            <div class="seccion-lanzamientos">
                <h1>Ultimos Lanzamientos</h1>
                <table>
                    <tr>
                        <td><img src="Img/ImgTracks/<%=lista2.get(lista2.size()-1).getImagen()%>"></td>
                        <td>
                            <h2><%=lista2.get(lista2.size()-1).getNombre_track()%></h2>
                            <p>
                                <%
                                    int id = control.obtenerArtistaId(lista2.get(lista2.size()-1).getIdTrack());
                                    Artista artista = control.obtenerArtista(id);
                                %>
                                Artista: <%=artista.getNombre()%></p>
                            <p>Duracion: <%=lista2.get(lista2.size()-1).getDuracion()%></p>
                            <p>Bpm: <%=lista2.get(lista2.size()-1).getBpm()%></p>
                            <a class="segunda-link-escuchar" href="#">Ir a escuchar -></a>
                        </td>
                    </tr>
                    <tr>
                        <td><img src="Img/ImgTracks/<%=lista2.get(lista2.size()-2).getImagen()%>"></td>
                        <td>
                            <h2><%=lista2.get(lista2.size()-2).getNombre_track()%></h2>
                            <p>
                                <%
                                    id = control.obtenerArtistaId(lista2.get(lista2.size()-2).getIdTrack());
                                    artista = control.obtenerArtista(id);
                                %>
                                Artista: <%=artista.getNombre()%></p>
                            <p>Duracion: <%=lista2.get(lista2.size()-2).getDuracion()%></p>
                            <p>Bpm: <%=lista2.get(lista2.size()-2).getBpm()%></p>
                            <a class="segunda-link-escuchar" href="#">Ir a escuchar -></a>
                        </td>
                    </tr>
                    <tr>
                        <td><img src="Img/ImgTracks/<%=lista2.get(lista2.size()-3).getImagen()%>"></td>
                        <td>
                            <h2><%=lista2.get(lista2.size()-3).getNombre_track()%></h2>
                            <p>
                                <%
                                    id = control.obtenerArtistaId(lista2.get(lista2.size()-3).getIdTrack());
                                    artista = control.obtenerArtista(id);
                                %>
                                Artista: <%=artista.getNombre()%></p>
                            <p>Duracion: <%=lista2.get(lista2.size()-3).getDuracion()%></p>
                            <p>Bpm: <%=lista2.get(lista2.size()-3).getBpm()%></p>
                            <a class="segunda-link-escuchar" href="#">Ir a escuchar -></a>
                        </td>
                    </tr>
                    <tr>
                        <td><img src="Img/ImgTracks/<%=lista2.get(lista2.size()-4).getImagen()%>"></td>
                        <td>
                            <h2><%=lista2.get(lista2.size()-4).getNombre_track()%></h2>
                            <p>
                                <%
                                    id = control.obtenerArtistaId(lista2.get(lista2.size()-4).getIdTrack());
                                    artista = control.obtenerArtista(id);
                                %>
                                Artista: <%=artista.getNombre()%></p>
                            <p>Duracion: <%=lista2.get(lista2.size()-4).getDuracion()%></p>
                            <p>Bpm: <%=lista2.get(lista2.size()-4).getBpm()%></p>
                            <a class="segunda-link-escuchar" href="#">Ir a escuchar -></a>
                        </td>
                    </tr>
                </table>
                <a class="segunda-link-verMas" href="#">Ver mas -></a>
            </div>
            <div class="seccio-lanzamientos-imagen">
                    <img class="imagen-marsh" src="Img/marsh.jpg">
                </div>
        </div>
        <div class="tercera-seccion">
            <div class="tercera-seccion-generos">
                <h1>Generos</h1>
                <div class="Primer-contenedor">
                    <div>
                        <h2><%=lista.get(0).getNombre()%></h2>
                        <p><%=lista.get(0).getInfo()%></p>
                        <a href="#">Explorar -></a>
                    </div>
                    <div>
                        <h2><%=lista.get(1).getNombre()%></h2>
                        <p><%=lista.get(1).getInfo()%></p>
                        <a href="#">Explorar -></a>
                    </div>
                    <div>
                        <h2><%=lista.get(2).getNombre()%></h2>
                        <p><%=lista.get(2).getInfo()%></p>
                        <a href="#">Explorar -></a>
                    </div>
                </div>
                <div class="Segundo-contenedor">
                    <div>
                        <h2><%=lista.get(3).getNombre()%></h2>
                        <p><%=lista.get(3).getInfo()%></p>
                        <a href="#">Explorar -></a>
                    </div>
                    <div>
                        <h2><%=lista.get(4).getNombre()%></h2>
                        <p><%=lista.get(4).getInfo()%></p>
                        <a href="#">Explorar -></a>
                    </div>
                    <div>
                        <h2><%=lista.get(5).getNombre()%></h2>
                        <p><%=lista.get(5).getInfo()%></p>
                        <a href="#">Explorar -></a>
                    </div>
                </div>
            </div>
        </div>
        <div class="cuarta-seccion">
            <div class="cuarta-seccion-mezclas">
                <h1>Mezclas</h1>
                <div class="cuarta-seccion-contenedor">
                    <div>
                        <a href="https://www.youtube.com/watch?v=EnkBJ58a2lA" target="_blank"><img src="Img/ImgMixes/mezcla1.jpeg"></a>      
                        <h2>Bzrp Music Sessions #53 Mix (ALOCEN) - Night of Music #46</h2>
                    </div>
                    <div>
                        <a href="https://www.youtube.com/watch?v=m9NsZn6N-Jw" target="_blank"><img src="Img/ImgMixes/mezcla2.jpeg"></a>
                        <h2>Hymn for the Weekend Mix (ALOCEN) - Night of Music #55</h2>
                    </div>
                    <div>
                        <a href="https://www.youtube.com/watch?v=bRWqxA5YEj8" target="_blank"><img src="Img/ImgMixes/mezcla1.jpeg"></a>
                        <h2>Love Songs Mix (ALOCEN) - Night of Music #52</h2>
                    </div>
                    <a href="#" class="cuarta-seccion-verMas">Ver mas</a>
                </div>
            </div>                          
        </div>
        <div class="quinta-seccion">
            <div class="quinta-seccion-artistas">
                <h1>Artistas</h1>
                
            </div>                        
        </div>
    </body>
</html>
