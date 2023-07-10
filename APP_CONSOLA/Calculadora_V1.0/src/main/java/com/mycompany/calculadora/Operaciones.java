/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author lucia
 */
public class Operaciones {
    private double a, b;

    //Constructores 
    public Operaciones() {
        this.a = 0;
        this.b = 0;
    }

    //Getters y Setters
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    
    //Metodos de la clase
    public double suma(){
        double resultado;
        resultado = a + b;
        return resultado;
    }
    public double resta(){
        double resultado;
        resultado = a - b;
        return resultado;
    }
    public double multiplicacion(){
        double resultado;
        resultado = a * b;
        return resultado;
    }
    public double division(){
        double resultado;
        resultado = a / b;
        return resultado;
    }
    public double raiz(){
        double resultado;
        resultado = Math.pow(a, 1/b);
        return resultado;
    }
    public double potencia(){
        double resultado;
        resultado = Math.pow(a, b);
        return resultado;
    }
}
