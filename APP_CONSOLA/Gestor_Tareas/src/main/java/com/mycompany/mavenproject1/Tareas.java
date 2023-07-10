/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lucia
 */
public class Tareas {
    //Variables
    private String tarea;
    private String importancia;
    private String estado;
    private DateFormat df;
    private Date fechaInicial;
    private Date fechaRealizacion;    

    //Getters y Setters
    public String getTarea() {
        return tarea;
    }
    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    public Date getFechaInicial() {
        return fechaInicial;
    }
    public void setFechaInicial(String fechaInicial) throws ParseException {
        this.fechaInicial = df.parse(fechaInicial);
    }
    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }
    public void setFechaRealizacion(String fechaRealizacion) throws ParseException {
        this.fechaRealizacion = df.parse(fechaRealizacion);
    }
    public DateFormat getDf() {
        return df;
    }
    public void setDf(DateFormat df) {
        this.df = df;
    }
    public String getImportancia() {
        return importancia;
    }
    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Constructor de la clase
    public Tareas(){}
    public Tareas(String tarea, String importancia, String fechaInicial, String fechaRealizacion) throws ParseException {
        this.tarea = tarea;
        this.importancia = importancia;
        this.estado = "Pendiente";
        this.df = new SimpleDateFormat("yyyy-MM-dd HH:mm");    
        this.fechaInicial = df.parse(fechaInicial);
        this.fechaRealizacion = df.parse(fechaRealizacion);
    } 
 
    //Metodos de la clase
    public void CalcularTiempo(){
        long dif, difDias, difHoras, difMinutos;
        dif = fechaRealizacion.getTime() - fechaInicial.getTime();
        difDias = dif/(24*60*60*1000);
        difHoras = dif/(60*60*1000)%24;
        difMinutos = dif /(60*1000)%60;
        if(difDias >= 1){
            System.out.println("Le quedan: "+difDias+" dias, "+difHoras+ " horas, "+difMinutos+" minutos.");
        }
        else{
            System.out.println("Le quedan: "+difHoras+ " horas, "+difMinutos+" minutos.");
        }
    } 
}
