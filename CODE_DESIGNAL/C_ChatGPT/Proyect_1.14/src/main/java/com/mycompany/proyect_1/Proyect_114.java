/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Arrays;

/**
 *Several people are standing in a row and need to be divided into two teams. 
 * The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, 
 * the fourth into team 2, and so on.
 * You are given an array of positive integers - the weights of the people. 
 * Return an array of two integers, where the first element is the total weight of team 1, 
 * and the second element is the total weight of team 2 after the division is complete.
 * @author Luciano Gatti with ChatGPT
 */

public class Proyect_114 {

    public static void main(String[] args) {
        int[] arrg = {1, 5, 6, 10, 10, 6};
        System.out.println("Resultado: " + Arrays.toString(solution(arrg)));
    }
    public static int[] solution(int[] a) {
        int acum1 = 0, acum2 = 0;
        for (int i = 0; i < a.length; i += 2) {
            acum1 += a[i];
            if (i + 1 < a.length) {
                acum2 += a[i + 1];
            }
        }
        return new int[]{acum1, acum2};
    }

}