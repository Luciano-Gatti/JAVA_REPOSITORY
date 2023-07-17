/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;


/**
 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
 * @author Luciano Gatti
 */
public class Proyect_14 {

    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        int result;
        result = solution(inputArray);
        System.out.println("resultado: " + result);
    }

    public static int solution(int[] inputArray) {
        int mayor = -1000001;

        for(int i = 0; i < inputArray.length-1; i++){         
            if(inputArray[i]*inputArray[i+1] > mayor){
                mayor = inputArray[i]*inputArray[i+1];
            }
        }
        return mayor;
    }
}
