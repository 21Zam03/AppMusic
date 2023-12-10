/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.logica;

public class Genero {
    
    private int idGenero;
    private String nombre;
    private String info;

    public Genero(int idGenero, String nombre, String info) {
        this.idGenero = idGenero;
        this.nombre = nombre;
        this.info = info;
    }

    public Genero(String nombre, String info) {
        this.nombre = nombre;
        this.info = info;
    }
    
    public Genero() {
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
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
