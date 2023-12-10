/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.logica;

public class Disquera {
    
    private int idDisquera;
    private String nombre;
    private String info;

    public Disquera(int idDisquera, String nombre, String info) {
        this.idDisquera = idDisquera;
        this.nombre = nombre;
        this.info = info;
    }

    public Disquera(String nombre, String info) {
        this.nombre = nombre;
        this.info = info;
    }
        
    public Disquera() {
    }

    public int getIdDisquera() {
        return idDisquera;
    }

    public void setIdDisquera(int idDisquera) {
        this.idDisquera = idDisquera;
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
