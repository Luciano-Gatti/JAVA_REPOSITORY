/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect;

import java.util.Arrays;

/**
 *Two arrays are called similar if one can be obtained from another by 
 * swapping at most one pair of elements in one of the arrays.
 * Given two arrays a and b, check whether they are similar.
 * @author Luciano Gatti with ChatGPT
 */

public class Proyect {

    public static void main(String[] args) {
        int[] a = {1,2,2};
        int[] b = {2,1,1};
        if(solution(a, b)){
            System.out.println("Iguales");
        }else{
            System.out.println("Distintos");
        }
    }
    
    public static boolean solution(int[] a, int[] b) {
        int diffCount = 0;
        int[] mismatchedA = new int[2];
        int[] mismatchedB = new int[2];
        int mismatchIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                diffCount++;

                if (diffCount > 2) {
                    return false;
                }

                mismatchedA[mismatchIndex] = a[i];
                mismatchedB[mismatchIndex] = b[i];
                mismatchIndex++;
            }
        }

        Arrays.sort(mismatchedA);
        Arrays.sort(mismatchedB);

        return Arrays.equals(mismatchedA, mismatchedB);
    }

}
