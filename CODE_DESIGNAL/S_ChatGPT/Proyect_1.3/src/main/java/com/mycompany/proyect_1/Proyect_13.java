/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Scanner;

/**
 * Given the string, check if it is a palindrome.
 * @author Luciano Gatti
 */
public class Proyect_13 {
    
    public static void main(String[] args) {
        String str;
        try(Scanner index = new Scanner(System.in)){
            System.out.println("Ingrese el texto: ");
            str = index.nextLine();
        }
        if(solution(str)){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }
    }
    
    public static boolean solution(String inputString) { 
        //Variables
        boolean control = false; 
        char [] caracter;
        int izq, dere;

        //Asignaciones
        caracter = inputString.toLowerCase().toCharArray();
        izq = 0;        
        dere = caracter.length-1;

        //Procedimiento 
        while (izq < dere) 
        {
            if(caracter[izq] == caracter[dere])
            {                    
                dere--;  
                izq++;   
            }
            else
            {
                break;
            }       
        }
        if(caracter.length%2 == 0)
        {
            if (izq-1 == dere)
            {
                control = true;
            }   
        }else{
            if (izq == dere)
            {
                control = true;
            }
        }   
        return control;
    }
}
