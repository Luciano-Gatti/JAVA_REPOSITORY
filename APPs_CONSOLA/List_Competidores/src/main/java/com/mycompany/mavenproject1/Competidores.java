/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lucia
 */
public class Competidores implements Comparable<Competidores> {
    //Atributos
    private int tiempo;
    private int identificador;
    
    //Constructor
    public Competidores(int identificador) {
        this.tiempo = 0;
        this.identificador = identificador;
    }

    //Getters y Setters
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public int compareTo(Competidores o) {
        if (this.tiempo != o.getTiempo()) {
            return this.tiempo - o.getTiempo();
        }else{
            return 0;
        }
    }
}
