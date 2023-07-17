/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Arrays;

/**
 *Two arrays are called similar if one can be obtained from another by 
 * swapping at most one pair of elements in one of the arrays.
 * Given two arrays a and b, check whether they are similar.
 * @author Luciano Gatti
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
        String[] str1 = Arrays.stream(a).mapToObj(String::valueOf).toArray(String[]::new);
        String[] str2 = Arrays.stream(b).mapToObj(String::valueOf).toArray(String[]::new);
        int cont = 0;
        for(int i = 0; i < a.length; i++){
            if(!Arrays.toString(a).contains(str2[i])){
                return false;
            }else{
                if(!str1[i].equals(str2[i])){
                    cont++;
                }
            }
        }
        return cont <= 2;
    }
}
