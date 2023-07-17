/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor_unidades;

/**
 *
 * @author lucia
 */
public class Presion {
    private double valor, resultado;   

    //Constructor
    public Presion(double valor) {
        this.valor = valor;
        this.resultado = 0;
    }

    //Getters y Setters
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
   
    //Metodo de la clase
    //Atmosfera 1, Bar 2, Libra_pulgada 3, Pascal 4, Torr 5
    public void ConvertirAtmosfera(int tipo){
        switch(tipo){
            case 2 -> {
                System.out.println("Formula: para obtener un resultado aproximado, multiplica el valor de presión por 1,013");
                resultado = valor * 1.013; 
                System.out.println(resultado);
            }
            
            case 3 -> {
                System.out.println("Formula: Multiplicar el valor de presión por 14,696");
                resultado = valor * 14.696;
                System.out.println(resultado);
            }
            
            case 4 -> {
                System.out.println("Formula: para obtener un resultado aproximado, multiplica el valor de presión por 101300");
                resultado = valor * 101300;
                System.out.println(resultado);
            }
            
            case 5 -> {
                System.out.println("Formula: Multiplicar el valor de presión por 760");
                resultado = valor * 760;
                System.out.println(resultado);
            }
        }
    }
    public void ConvertirBar(int tipo){
        switch(tipo){
            case 1 -> {
                System.out.println("Formula: para obtener un resultado aproximado, divide el valor de presión entre 1,013");
                resultado = valor / 1.013; 
                System.out.println(resultado);
            }
            
            case 3 -> {
                System.out.println("Formula: para obtener un resultado aproximado, multiplica el valor de presión por 14,504");
                resultado = valor * 14.504;
                System.out.println(resultado);
            }
            
            case 4 -> {
                System.out.println("Formula: Multiplicar el valor de presión por 100000");
                resultado = valor * 100000;
                System.out.println(resultado);
            }
            
            case 5 -> {
                System.out.println("Formula: para obtener un resultado aproximado, multiplica el valor de presión por 750,1");
                resultado = valor * 750.1;
                System.out.println(resultado);
            }
        }
    }
    public void ConvertirLibra_Pulgada(int tipo){
        switch(tipo){
            case 2 -> {
                System.out.println("Formula: para obtener un resultado aproximado, divide el valor de presión entre 14,504");
                resultado = valor / 14.504; 
                System.out.println(resultado);
            }
            
            case 1 -> {
                System.out.println("Formula: divide el valor de presión entre 14,696");
                resultado = valor / 14.696;
                System.out.println(resultado);
            }
            
            case 4 -> {
                System.out.println("Formula: para obtener un resultado aproximado, multiplica el valor de presión por 6895");
                resultado = valor * 6895;
                System.out.println(resultado);
            }
            
            case 5 -> {
                System.out.println("Formula: Multiplicar el valor de presión por 51,715");
                resultado = valor * 51.715;
                System.out.println(resultado);
            }
        }
    }
    public void ConvertirPascal(int tipo){
        switch(tipo){
            case 2 -> {
                System.out.println("Formula: divide el valor de presión entre 100000");
                resultado = valor / 100000; 
                System.out.println(resultado);
            }
            
            case 3 -> {
                System.out.println("Formula: para obtener un resultado aproximado, divide el valor de presión entre 6895");
                resultado = valor / 6895;
                System.out.println(resultado);
            }
            
            case 1 -> {
                System.out.println("Formula: para obtener un resultado aproximado, divide el valor de presión entre 101300");
                resultado = valor / 101300;
                System.out.println(resultado);
            }
            
            case 5 -> {
                System.out.println("Formula: para obtener un resultado aproximado, divide el valor de presión entre 133,3");
                resultado = valor / 133.3;
                System.out.println(resultado);
            }
        }
    }
     public void ConvertirTorr(int tipo){
        switch(tipo){
            case 2 -> {
                System.out.println("Formula: para obtener un resultado aproximado, divide el valor de presión entre 750,1");
                resultado = valor / 750.1; 
                System.out.println(resultado);
            }
            
            case 3 -> {
                System.out.println("Formula: divide el valor de presión entre 51,715");
                resultado = valor / 51.715;
                System.out.println(resultado);
            }
            
            case 4 -> {
                System.out.println("Formula: para obtener un resultado aproximado, multiplica el valor de presión por 133,3");
                resultado = valor * 133.3;
                System.out.println(resultado);
            }
            
            case 1 -> {
                System.out.println("Formula: divide el valor de presión entre 760");
                resultado = valor / 760;
                System.out.println(resultado);
            }
        }
    }
}
