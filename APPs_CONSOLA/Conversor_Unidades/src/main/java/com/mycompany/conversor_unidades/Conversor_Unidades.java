/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversor_unidades;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Conversor_Unidades {

    static Scanner index = new Scanner(System.in);
    static int seleccion;
    static int seleccion1, seleccion2;
    static double valor;
    
    public static void main(String[] args) {
        boolean control = true;
        do
        {
            System.out.println("Que desea convertir: \n1) Presión \n2) Masa \n3) Longitud \n4) Salir");
            seleccion = index.nextInt();
            switch(seleccion){
                case 1 -> {
                    ConvertirPresion();
                }
                case 2 -> {
                    ConvertirMasa();
                }
                case 3 -> {
                    ConvertirLongitud();
                }
                case 4 -> {
                    control = false;
                    break;
                }
                default -> {
                    System.out.println("Valor incorrecto.");
                }         
        }   
        }
        while(control);
               
    }
    public static void ConvertirPresion(){             
        System.out.println("SELECCIONE: \n1) Atmósfera \n2) Bar \n3) Libra por pulgada cuadrada \n4) Pascal \n5) Torr");
        seleccion1 = index.nextInt();
        System.out.println("VALOR: ");
        valor = index.nextDouble();
        Presion p = new Presion(valor);
        System.out.println("SELECCIONE: \n1) Atmósfera \n2) Bar \n3) Libra por pulgada cuadrada \n4) Pascal \n5) Torr");
        seleccion2 = index.nextInt();       
        switch(seleccion1){
            case 1 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 5){
                    p.ConvertirAtmosfera(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }       
            }
            case 2 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 5){
                    p.ConvertirBar(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }  
            }
            case 3 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 5){
                    p.ConvertirLibra_Pulgada(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }                
            }
            case 4 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 5){
                    p.ConvertirPascal(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }               
            }
            case 5 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 5){
                    p.ConvertirTorr(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }       
            }
            default -> {
                System.out.println("Valor incorrecto");
            }
        }
    }
    public static void ConvertirMasa(){
        //Tonelada 1, Kilogramo 2, Gramo 3, Libra 4, Onza 5
        System.out.println("SELECCIONE: \n1) Tonelada \n2) Kilogramo \n3) Gramo \n4) Libra \n5) Onza ");
        seleccion1 = index.nextInt();
        System.out.println("VALOR: ");
        valor = index.nextDouble();
        Masa m = new Masa(valor);
        System.out.println("SELECCIONE: \n1) Tonelada \n2) Kilogramo \n3) Gramo \n4) Libra \n5) Onza ");
        seleccion2 = index.nextInt();
        
        switch(seleccion1){
            case 1 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 5){
                    m.ConvertirTonelada(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }       
            }
            case 2 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 5){
                    m.ConvertirKilogramo(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                } 
            }
            case 3 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 5){
                    m.ConvertirGramo(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }              
            }
            case 4 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 5){
                    m.ConvertirLibra(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }              
            }
            case 5 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 5){
                    m.ConvertirOnza(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }     
            }       
            default -> {
                System.out.println("Valor incorrecto");
            }
        }
    }
    public static void ConvertirLongitud(){ 
        System.out.println("SELECCIONE: \n1) Kilometro \n2) Metro \n3) Centimetro \n4) Milimetro \n5) Micrometro \n6) Nanometro");
        seleccion1 = index.nextInt();
        System.out.println("VALOR: ");
        valor = index.nextDouble();
        Longitud l = new Longitud(valor);
        System.out.println("SELECCIONE: \n1) Kilometro \n2) Metro \n3) Centimetro \n4) Milimetro \n5) Micrometro \n6) Nanometro");
        seleccion2 = index.nextInt();
        
        switch(seleccion1){
            case 1 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 6){
                    l.ConvertirKilometro(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }       
            }
            case 2 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 6){
                    l.ConvertirMetro(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                } 
            }
            case 3 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 6){
                    l.ConvertirCentimetro(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }              
            }
            case 4 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 6){
                    l.ConvertirMilimetro(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }              
            }
            case 5 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 6){
                    l.ConvertirMicrometro(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }     
            }
            case 6 -> {
                if(seleccion1 != seleccion2 && seleccion2 >= 1 && seleccion2 <= 6){
                    l.ConvertirNanometro(seleccion2);
                }else{
                    System.out.println("El tipo seleccionado es incorrecto o la unidades seleccionadas son iguales.");
                }     
            }
            default -> {
                System.out.println("Valor incorrecto");
            }
        }       
    }
}
