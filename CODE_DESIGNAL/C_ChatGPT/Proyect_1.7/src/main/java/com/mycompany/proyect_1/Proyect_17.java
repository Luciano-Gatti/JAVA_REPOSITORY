/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

/**
 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing 
 * sequence by removing no more than one element from the array.
 * Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. 
 * Sequence containing only one element is also considered to be strictly increasing.
 * @author Luciano Gatti with ChatGPT
 */

public class Proyect_17 {

    public static void main(String[] args) {
        int[] sequence = {1, 3, 2, 1};
        System.out.println("resultado: " + solution(sequence));
    }
    
    public static boolean solution(int[] sequence) {
        int n = sequence.length;
        boolean foundDecreasing = false;
        if (n <= 2) {
            return true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                if (foundDecreasing) {
                    return false; // Hay más de una subsecuencia no creciente
                }
                foundDecreasing = true;

                if (i > 0 && sequence[i - 1] >= sequence[i + 1]) {
                    // Eliminar sequence[i] no es suficiente para hacer la subsecuencia creciente
                    if (i < n - 2 && sequence[i] >= sequence[i + 2]) {
                        // Eliminar sequence[i + 1] no es suficiente para hacer la subsecuencia creciente
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
