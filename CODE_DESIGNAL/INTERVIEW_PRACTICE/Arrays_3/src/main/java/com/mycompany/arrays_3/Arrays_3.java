/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays_3;

import java.util.Arrays;

/**
 *
 * @author lucia
 */
public class Arrays_3 {

    public static void main(String[] args) {
        int[][] a = {{10,9,6,3,7},{6,10,2,9,7},{7,6,3,8,2},{8,9,7,9,9},{6,8,6,8,2}};
        System.out.println("*********************");
        for(int[] imp: solution1(a)){
            System.out.println(Arrays.toString(imp));           
        }
        System.out.println("*********************");
        for(int[] imp: solution2(a)){
            System.out.println(Arrays.toString(imp));
        }
        System.out.println("*********************");
        for(int[] imp: solution3(a)){
            System.out.println(Arrays.toString(imp)); 
        }
        System.out.println("*********************");
    }
    
    //solution 1 with 1 additional memory
    public static int[][] solution1(int[][] a) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[j][a.length - 1 - i] = a[i][j]; // Intercambiar filas y columnas
            }
        }
        return result;
    }
    //solution 2 without additional memory
    public static int[][] solution2(int[][] a) {
        int n = a.length;
        // Step 1: Transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // Step 2: Invert each row of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][n - 1 - j];
                a[i][n - 1 - j] = temp;
            }
        }
        return a;
    }
    //shortest solution 3 without additional memory
    public static int[][] solution3(int[][] a) {
        int n = a.length;
        for(int i = 0; i < n; i++){
            for(int j = n-1; j >= 0; j--){
                int temp = a[j][i];
                a[j][i] = a[n-i-1][j];
                a[n-i-1][j] = a[n-1-j][n-1-i];
                a[n-1-j][n-1-i] = a[i][n-1-j];
                a[i][n-1-j] = temp;
            }
        }
        return a;
    }
}
