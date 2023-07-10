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
public class UsoCuenta {
    public static void main(String[] args) {
        CuentaCorriente Cuenta1 = new CuentaCorriente (5000.0, "PEPE");
        CuentaCorriente Cuenta2 = new CuentaCorriente (5000.0, "Luciano Gatti");
        System.out.println("Saldo de "+Cuenta1.getNombreTitular() + ":"+Cuenta1.getSaldo());
        Cuenta1.Transferencia(Cuenta2, 2500.0);  
        System.out.println("Realizando transferencia a la cuenta n°"+Cuenta2.numeroCuenta);       
        System.out.println("\nTitular: "+Cuenta1.getNombreTitular()+"\nSaldo restante: "+Cuenta1.getSaldo());
        System.out.println("\nTitular: "+Cuenta2.getNombreTitular()+"\nSaldo actual: "+Cuenta2.getSaldo());
        System.out.println("\nTransferencia realizada.");
    }
}
