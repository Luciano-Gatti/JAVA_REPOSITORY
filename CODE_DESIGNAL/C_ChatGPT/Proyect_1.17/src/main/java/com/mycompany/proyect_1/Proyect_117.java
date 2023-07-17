/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Arrays;

/**
 *
 * @author lucia
 */
public class Proyect_117 {

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
