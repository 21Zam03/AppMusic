/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.logica;

import java.util.Date;

public class Remix {
    
    private int idRemix;
    private Track track;
    private Genero genero;
    private Disquera disquera;
    private String nombre_remix;
    private Date fecha_lanzamiento;
    private String bpm;
    private String duracion;
    private String escala;

    public Remix(int idRemix, Track track, Genero genero, Disquera disquera, String nombre_remix, Date fecha_lanzamiento, String bpm, String duracion, String escala) {
        this.idRemix = idRemix;
        this.track = track;
        this.genero = genero;
        this.disquera = disquera;
        this.nombre_remix = nombre_remix;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.bpm = bpm;
        this.duracion = duracion;
        this.escala = escala;
    }

    public Remix(Track track, Genero genero, Disquera disquera, String nombre_remix, Date fecha_lanzamiento, String bpm, String duracion, String escala) {
        this.track = track;
        this.genero = genero;
        this.disquera = disquera;
        this.nombre_remix = nombre_remix;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.bpm = bpm;
        this.duracion = duracion;
        this.escala = escala;
    }

    public Remix() {
    }

    public int getIdRemix() {
        return idRemix;
    }

    public void setIdRemix(int idRemix) {
        this.idRemix = idRemix;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Disquera getDisquera() {
        return disquera;
    }

    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }

    public String getNombre_remix() {
        return nombre_remix;
    }

    public void setNombre_remix(String nombre_remix) {
        this.nombre_remix = nombre_remix;
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
    
    
}
