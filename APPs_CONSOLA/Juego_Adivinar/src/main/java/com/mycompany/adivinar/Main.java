/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adivinar;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = (int) ((Math.random() * 100)+1); 
        int index, cont = 0;
        int vidas = 5;
      
        System.out.println("El juego consiste en averiguar un número secreto de 100 posibles.\nTienes 5 intentos.");
        do {
            System.out.println("Ingrese un numero: ");
            index = sc.nextInt();
            if (index >= 0 && index <= 100 ) {
                cont ++;
                if (num == index) 
                {
                    System.out.println("Correcto!!");
                    System.out.println("Lo ha realizado en "+cont+" intentos.");
                }          
                else if (num > index)
                {
                    vidas--;
                    if(vidas == 0){
                        System.out.println("GAME OVER");
                        System.out.println("El numero ganador era: "+ num);
                    }else{
                        System.out.println("El número es MAYOR que "+ index);
                        System.out.println("Le quedan " + vidas + " vidas.");
                    }  
                }              
                else 
                {
                    vidas--;
                    if(vidas == 0){
                        System.out.println("GAME OVER");
                        System.out.println("El numero ganador era: "+ num);
                    }else{
                        System.out.println("El número es MENOR que "+index); 
                        System.out.println("Le quedan " + vidas + " vidas.");
                    }     
                }       
            }    
            else
            {
                System.out.println("Numero incorrecto vuelve a intentarlo.");
            }  
        } while (num != index && vidas != 0);   
    }
}