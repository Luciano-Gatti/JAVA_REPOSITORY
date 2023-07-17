/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor_unidades;

/**
 *
 * @author lucia
 */
public class Masa {
    private double valor, resultado;   

    //Constructor
    public Masa(double valor) {
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
    //Tonelada 1, Kilogramo 2, Gramo 3, Libra 4, Onza 5
    public void ConvertirTonelada(int tipo){
        switch(tipo){
            case 2 -> {
                System.out.println("Formula: Multiplicar el valor de masa por 1,000");
                resultado = valor * 1000; 
                System.out.println(resultado);
            }
            case 3 -> {
                System.out.println("Formula: Multiplicar el valor de longitud por 1,000,000");
                resultado = valor * 1000000;
                System.out.println(resultado);
            }
            case 4 -> {
                System.out.println("Formula: para obtener un resultado aproximado, multiplica el valor de masa por 2205");
                resultado = valor * 2205;
                System.out.println(resultado);
            }
            case 5 -> {
                System.out.println("Formula: para obtener un resultado aproximado, multiplica el valor de masa por 35270");
                resultado = valor * 35270;
                System.out.println(resultado);
            }                  
        }
    }
    public void ConvertirKilogramo(int tipo){
        switch(tipo){
            case 1 -> {
                System.out.println("Formula: Divide el valor de masa entre 1000");
                resultado = valor / 1000; 
                System.out.println(resultado);
            }      
            case 3 -> {
                System.out.println("Formula: Multiplicar el valor de masa por 1000");
                resultado = valor * 1000;
                System.out.println(resultado);
            }            
            case 4 -> {
                System.out.println("Formula: para obtener un resultado aproximado, multiplica el valor de masa por 2.205");
                resultado = valor * 2.205;
                System.out.println(resultado);
            }            
            case 5 -> {
                System.out.println("Formula: Multiplicar el valor de masa por 35.274");
                resultado = valor * 35.274;
                System.out.println(resultado);
            }
        }
    }
    public void ConvertirGramo(int tipo){
        switch(tipo){
            case 1 -> {
                System.out.println("Formula: Divide el valor de longitud por 1,000,000");
                resultado = valor / 1000000; 
                System.out.println(resultado);
            }
            case 2 -> {
                System.out.println("Formula: Divide el valor de masa entre 1000");
                resultado = valor / 1000;
                System.out.println(resultado);
            }
            case 4 -> {
                System.out.println("Formula: para obtener un resultado aproximado, divide el valor de masa entre 453.6");
                resultado = valor * 453.6;
                System.out.println(resultado);
            }
            case 5 -> {
                System.out.println("Formula: para obtener un resultado aproximado, divide el valor de masa entre 28.35");
                resultado = valor * 28.35;
                System.out.println(resultado);
            }
        }
    }
    public void ConvertirLibra(int tipo){
        switch(tipo){
            case 1 -> {
                System.out.println("Formula: para obtener un resultado aproximado, divide el valor de masa entre 2205");
                resultado = valor / 2205; 
                System.out.println(resultado);
            }    
            case 2 -> {
                System.out.println("Formula: para obtener un resultado aproximado, divide el valor de masa entre 2.205");
                resultado = valor / 2.205;
                System.out.println(resultado);
            }
            case 3 -> {
                System.out.println("Formula: para obtener un resultado aproximado, multiplica el valor de masa por 453.6");
                resultado = valor * 453.6;
                System.out.println(resultado);
            }
            case 5 -> {
                System.out.println("Formula: Multiplicar el valor de masa por 16");
                resultado = valor * 16;
                System.out.println(resultado);
            }    
        }
    }
    public void ConvertirOnza(int tipo){
        switch(tipo){
            case 1 -> {
                System.out.println("Formula: para obtener un resultado aproximado, divide el valor de masa entre 35270");
                resultado = valor / 35270; 
                System.out.println(resultado);
            }      
            case 2 -> {
                System.out.println("Formula: divide el valor de masa entre 35.274");
                resultado = valor / 35.274;
                System.out.println(resultado);
            }   
            case 3 -> {
                System.out.println("Formula: para obtener un resultado aproximado, multiplica el valor de masa por 28.35");
                resultado = valor / 28.35;
                System.out.println(resultado);
            }            
            case 4 -> {
                System.out.println("Formula: divide el valor de masa entre 16");
                resultado = valor / 16;
                System.out.println(resultado);
            }
        }
    }  
}
