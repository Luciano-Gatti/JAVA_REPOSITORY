/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuanta_banco;

/**
 *
 * @author Luciano
 */
public class CuentaCorriente {
    //Atributos
    double saldo = 5000.0;
    String nombreTitular = "Cuenta de PEPE";
    long numeroCuenta;
    
    //Constructor
    public CuentaCorriente(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = Math.round(Math.random()*100000);
    }

    //Getters y Setters
    public double getSaldo() {
        return saldo;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    
    //Metodo de la clase
    public void Transferencia (CuentaCorriente cuenta2, double transferencia){
        if (transferencia > this.saldo) {
            System.out.println("Fondos insuficientes");
        }else{
            this.saldo -= transferencia;
            cuenta2.setSaldo(transferencia + cuenta2.saldo);
        }
    }
}
