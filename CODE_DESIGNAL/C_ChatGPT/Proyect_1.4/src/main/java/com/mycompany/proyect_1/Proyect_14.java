/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

/**
 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
 * @author Luciano Gatti with ChatGPT
 */
public class Proyect_14 {

    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println("resultado: " + solution(inputArray));
    }

    public static int solution(int[] inputArray) {
        int mayor = inputArray[0] * inputArray[1];
        for (int i = 1; i < inputArray.length - 1; i++) {
            int producto = inputArray[i] * inputArray[i + 1];
            if (producto > mayor) {
                mayor = producto;
            }
        }
        return mayor;
    }
}
