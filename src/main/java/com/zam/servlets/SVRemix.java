/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.zam.servlets;

import com.zam.controladora.Controladora;
import com.zam.logica.Artista;
import com.zam.logica.Disquera;
import com.zam.logica.Genero;
import com.zam.logica.Remix;
import com.zam.logica.Track;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SVRemix", urlPatterns = {"/SVRemix"})
public class SVRemix extends HttpServlet {
    
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Date fecha_lanzamiento = null;
        
        String nombre_track = request.getParameter("track");
        String nombre = request.getParameter("nombre");
        String genero_n = request.getParameter("genero");
        String fecha = request.getParameter("fecha");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecha_lanzamiento = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        String bpm_t = request.getParameter("bpm");
        String duracion_t = request.getParameter("duracion");
        String escala_t = request.getParameter("escala");
        String discografia_n = request.getParameter("disquera");
        
        Track track_o = control.obtenerTrack(nombre_track);
        Genero genero_o = control.obtenerGenero(genero_n);
        Disquera disquera = control.obtenerDisquera(discografia_n);
        
        Remix remix = new Remix(track_o, genero_o, disquera, nombre, fecha_lanzamiento, bpm_t, duracion_t, escala_t);
        boolean registro = control.registrarRemix(remix);
        ////////////////////////////////////////////////////////////////////////
        
        Remix remix_f = control.obtenerRemix(nombre);
        String artista1_n = request.getParameter("artista1");
        String artista2_n = request.getParameter("artista2");
        String artista3_n = request.getParameter("artista3");
        
        String[] artistas = {artista1_n, artista2_n, artista3_n};
        
        for (int i=0; i<artistas.length; i++) {
            if (!artistas[i].equals("Nulo")) {
                Artista artista = control.obtenerArtista(artistas[i]);
                control.registrarArt_Remix(artista, remix_f);
            }
        } 

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
