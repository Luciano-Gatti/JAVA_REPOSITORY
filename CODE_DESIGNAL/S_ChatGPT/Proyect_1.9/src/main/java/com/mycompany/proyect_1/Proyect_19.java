/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Arrays;

/**
 * Given an array of strings, return another array containing all of its longest strings.
 * @author Luciano Gatti
 */

public class Proyect_19 {

    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        System.out.println("resultado: " + Arrays.toString(solution(inputArray)));
    }
    
    public static String[] solution(String[] inputArray) {
        int mayor = 0, cont=0, cont2 = 0;
        for (String inputArray1 : inputArray) {
            if (mayor < inputArray1.length()) {
                mayor = inputArray1.length();
                cont = 1;
            } else if (mayor == inputArray1.length()) {
                cont++;
            }
        }
        String[] result = new String[cont];
        for (String inputArray1 : inputArray) {
            if (inputArray1.length() == mayor) {
                result[cont2] = inputArray1;
                cont2++;
            }
        }
        return result;
    }
}
