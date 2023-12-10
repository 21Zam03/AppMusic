/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.logica;

public class Artista {
    
    private int idArtista;
    private String nombre;
    private String info;

    public Artista(int idArtista, String nombre, String info) {
        this.idArtista = idArtista;
        this.nombre = nombre;
        this.info = info;
    }

    public Artista(String nombre, String info) {
        this.nombre = nombre;
        this.info = info;
    }

    public Artista() {
    }
      
    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
     
}
