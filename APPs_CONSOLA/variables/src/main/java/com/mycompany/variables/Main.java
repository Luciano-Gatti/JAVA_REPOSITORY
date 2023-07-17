/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.variables;

/**
 *
 * @author Luciano
 */
public class Main {   
    
    public static void main(String[] args) {
        
        String nombre = "Luciano Emmanuel Gatti Flekenstein";
        int edad = 20;
        double salario = 40000.50;
        boolean carnet = false;
   
        System.out.println ("nombre: "+nombre+ "\n" +"edad: "+edad+ "\n" + "salario: "+salario);
        if (carnet == false) 
        {
            System.out.println("No tiene carnet");
        }else{
            System.out.println("Tiene carnet");
        }
    }
}
