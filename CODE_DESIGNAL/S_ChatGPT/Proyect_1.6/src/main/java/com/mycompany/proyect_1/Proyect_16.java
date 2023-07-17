/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

/**
 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. 
 * Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the 
 * previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number 
 * of additional statues needed.
 * @author Luciano Gatti
 */

public class Proyect_16 {

    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        int result;
        
        result = solution(statues);
        System.out.println("resultado: " + result);
    }

    public static int solution(int[] statues) {
        int cantidad, mayor = 0, menor = 20;
        for(int i = 0; i < statues.length; i++){
            if(statues[i] > mayor){
                mayor = statues[i];
            }
            if(statues[i] < menor){
                menor = statues[i];
            }
        }
        cantidad = mayor - menor - 1 - (statues.length-2);
        return cantidad;
    }
}
