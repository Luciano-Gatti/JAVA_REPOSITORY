/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

/**
 * You are given an array of integers. On each move you are 
 * allowed to increase exactly one of its element by one. Find the 
 * minimal number of moves required to obtain a strictly increasing 
 * sequence from the input.
 * @author Luciano Gatti
 */
public class Proyect_117 {

    public static void main(String[] args) {
        int[] inputArray = {1, 1, 1}; //Resultado esperado = 3
        int resultado = solution(inputArray);
        System.out.println(resultado);
    } 
    
    static int solution(int[] inputArray) {
        int result = 0;
        int ant, sgte;
        for(int i = 0; i< inputArray.length-1; i++){
            if(inputArray[i] >= inputArray[i+1]){
                ant = inputArray[i] + 1;
                sgte = inputArray[i +1];
                result += ant - sgte;
                inputArray[i+1] = ant;
            }
        }
        return result;
    }
}
