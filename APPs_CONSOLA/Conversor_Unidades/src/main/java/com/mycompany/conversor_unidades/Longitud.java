/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor_unidades;

/**
 *
 * @author lucia
 */
public class Longitud {
    private double valor, resultado;   

    //Constructor
    public Longitud(double valor) {
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
    //Kilometro 1, Metro 2, Centimetro 3, Milimetro 4, Micrometro 5, Nanometro 6
    public void ConvertirKilometro(int tipo){
        switch(tipo){
            case 2 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 1,000");
                resultado = valor * 1000; 
                System.out.println(resultado);
            }
            case 3 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 100,000");
                resultado = valor * 100000;
                System.out.println(resultado);
            }
            case 4 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 1,000,000");
                resultado = valor * 1000000;
                System.out.println(resultado);
            }
            case 5 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 1,000,000,000");
                resultado = valor * 1000000000;
                System.out.println(resultado);
            }
            case 6 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 1,000,000,000,000");
                resultado = valor * 1000000000 * 1000;
                System.out.println(resultado);
            }            
        }
    }
    public void ConvertirMetro(int tipo){
        switch(tipo){
            case 1 -> {
                System.out.println("Formula: Divide el valor de longitud por 1000");
                resultado = valor / 1000; 
                System.out.println(resultado);
            }      
            case 3 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 100");
                resultado = valor * 100;
                System.out.println(resultado);
            }            
            case 4 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 1,000");
                resultado = valor * 1000;
                System.out.println(resultado);
            }            
            case 5 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 1,000,000");
                resultado = valor * 1000000;
                System.out.println(resultado);
            }
            case 6 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 1,000,000,000");
                resultado = valor * 1000000000;
                System.out.println(resultado);
            }           
        }
    }
    public void ConvertirCentimetro(int tipo){
        switch(tipo){
            case 1 -> {
                System.out.println("Formula: Divide el valor de longitud por 100,000");
                resultado = valor / 100000; 
                System.out.println(resultado);
            }
            case 2 -> {
                System.out.println("Formula: Divide el valor de longitud por 100");
                resultado = valor / 100;
                System.out.println(resultado);
            }
            case 4 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 10");
                resultado = valor * 10;
                System.out.println(resultado);
            }
            case 5 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 10,000");
                resultado = valor * 10000;
                System.out.println(resultado);
            }
            case 6 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 10,000,000");
                resultado = valor * 10000000;
                System.out.println(resultado);
            }
        }
    }
    public void ConvertirMilimetro(int tipo){
        switch(tipo){
            case 1 -> {
                System.out.println("Formula: Divide el valor de longitud por 1,000,000");
                resultado = valor / 1000000; 
                System.out.println(resultado);
            }    
            case 2 -> {
                System.out.println("Formula: Divide el valor de longitud por 1,000");
                resultado = valor / 1000;
                System.out.println(resultado);
            }
            case 3 -> {
                System.out.println("Formula: Divide el valor de longitud por 10");
                resultado = valor / 10;
                System.out.println(resultado);
            }
            case 5 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 1000");
                resultado = valor * 1000;
                System.out.println(resultado);
            }
            case 6 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 1,000,000");
                resultado = valor * 1000000;
                System.out.println(resultado);
            }           
        }
    }
    public void ConvertirMicrometro(int tipo){
        switch(tipo){
            case 1 -> {
                System.out.println("Formula: Divide el valor de longitud por 1,000,000,000");
                resultado = valor / 1000000000; 
                System.out.println(resultado);
            }      
            case 2 -> {
                System.out.println("Formula: Divide el valor de longitud por 1,000,000");
                resultado = valor / 1000000;
                System.out.println(resultado);
            }   
            case 3 -> {
                System.out.println("Formula: Divide el valor de longitud por 10000");
                resultado = valor / 10000;
                System.out.println(resultado);
            }            
            case 4 -> {
                System.out.println("Formula: Divide el valor de longitud por 1,000");
                resultado = valor / 1000;
                System.out.println(resultado);
            }
            case 6 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 1000");
                resultado = valor * 1000;
                System.out.println(resultado);
            }
        }
    }
    public void ConvertirNanometro(int tipo){
        switch(tipo){
            case 1 -> {
                System.out.println("Formula: Divide el valor de longitud por 1,000,000,000,000");
                resultado = valor / 1000000000 * 1000; 
                System.out.println(resultado);
            }
            case 2 -> {
                System.out.println("Formula: Divide el valor de longitud por 1,000,000,000");
                resultado = valor / 1000000000;
                System.out.println(resultado);
            }         
            case 3 -> {
                System.out.println("Formula: Divide  el valor de longitud por 10,000,000");
                resultado = valor / 10000000;
                System.out.println(resultado);
            }           
            case 4 -> {
                System.out.println("Formula: Divide el valor de longitud por 1,000,000");
                resultado = valor / 1000000;
                System.out.println(resultado);
            }
            case 5 -> {
                System.out.println("Formula: Divide el valor de longitud por 1000");
                resultado = valor / 1000;
                System.out.println(resultado);
            }
        }
    }
}
