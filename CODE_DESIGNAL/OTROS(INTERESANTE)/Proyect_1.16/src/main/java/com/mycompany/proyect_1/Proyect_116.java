/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Arrays;

/**
 *Two arrays are called similar if one can be obtained from another by 
 * swapping at most one pair of elements in one of the arrays.
 * Given two arrays a and b, check whether they are similar.
 */
public class Proyect_116 {

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
        int rs = 0, s1 = 1, s2 = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                rs++;
                s1 *= a[i];
                s2 *= b[i];
            } 
        }
        return rs <= 2 && s1 == s2;
    }

}
