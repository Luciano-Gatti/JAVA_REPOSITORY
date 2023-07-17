/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

/**
 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing 
 * sequence by removing no more than one element from the array.
 * Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. 
 * Sequence containing only one element is also considered to be strictly increasing.
 * @author Luciano Gatti
 */

public class Proyect_17 {

    public static void main(String[] args) {
        int[] sequence = {1, 3, 2, 1};
        System.out.println("resultado: " + solution(sequence));
    }
    
    public static boolean solution(int[] sequence) {
        boolean control = false;
        int[] subSecuence;
        int cont = 0;
        if(sequence.length <= 2){
            control = true;
        }else{
            for(int i = 0; i < sequence.length; i++){
                subSecuence = CrearSubSecuence(sequence, i);
                if(!subControl(subSecuence)){
                    cont ++;
                }
            }
            if(cont < sequence.length){
                control = true;
            }
        }
        return control;
    }

    public static int[] CrearSubSecuence(int[] arr, int index){
        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 0, result, 0, index);
        if (arr.length != index) {
            System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);
        }
        return result;
    }

    public static boolean subControl(int[] sequence){
        boolean control = false;

        for(int i = 0; i < sequence.length-1; i++){
            if(sequence[i] < sequence[i+1]){
                control = true;
            }else{
                control = false;
                break;
            }
        }
        return control;
    }

}
