/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.logica;

import java.util.Date;

public class Track {
    
    private int idTrack;
    private Disquera disquera;
    private Genero genero;
    private String nombre_track;
    private Date fecha_lanzamiento;
    private String bpm;
    private String duracion;
    private String escala;
    private String imagen;

    public Track(int idTrack, Disquera disquera, Genero genero, String nombre_track, Date fecha_lanzamiento, String bpm, String duracion, String escala,
            String imagen) {
        this.idTrack = idTrack;
        this.disquera = disquera;
        this.genero = genero;
        this.nombre_track = nombre_track;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.bpm = bpm;
        this.duracion = duracion;
        this.escala = escala;
        this.imagen = imagen;
    }

    public Track(Disquera disquera, Genero genero, String nombre_track, Date fecha_lanzamiento, String bpm, String duracion, String escala, String imagen) {
        this.disquera = disquera;
        this.genero = genero;
        this.nombre_track = nombre_track;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.bpm = bpm;
        this.duracion = duracion;
        this.escala = escala;
        this.imagen = imagen;
    }

    public int getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(int idTrack) {
        this.idTrack = idTrack;
    }

    public Disquera getDisquera() {
        return disquera;
    }

    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombre_track() {
        return nombre_track;
    }

    public void setNombre_track(String nombre_track) {
        this.nombre_track = nombre_track;
    }

    public Date getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(Date fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
   
}
