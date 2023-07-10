package com.mycompany.arrays2;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String palabra;
        char [] caracter;
        int izq, dere; 
      
        System.out.print("Ingrese un texto que no supere los 20 caracteres: \n");
        palabra = leer.nextLine();
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ", "");
        caracter = palabra.toCharArray();
        izq = 0;        
        dere = caracter.length-1;
        while (izq < dere)
        {
            if(caracter[izq] == caracter[dere])
            {                    
                dere--;  
                izq++;   
            }
            else
            {
                System.out.print("El texto no es palindromo."); 
                break;
            }       
        }
        if(caracter.length/2 == 0)
        {
            if (izq == dere)
            {
                System.out.print("El texto es palindromo."); 
            }   
        }else{
            if (izq-1 == dere)
            {
                System.out.print("El texto es palindromo."); 
            }
        } 
    } 
}
