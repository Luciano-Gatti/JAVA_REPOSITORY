/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of strings, return another array containing all of its longest strings.
 * @author Luciano Gatti with ChatGPT
 */
public class Proyect_19 {
    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        System.out.println("resultado: " + Arrays.toString(solution(inputArray)));
    }
    
    public static String[] solution(String[] inputArray) {
        int mayor = 0;
        List<String> result = new ArrayList<>();
        for (String inputArray1 : inputArray) {
            if (inputArray1.length() > mayor) {
                mayor = inputArray1.length();
                result.clear(); // Se reinicia la lista si se encuentra una longitud mayor
            }
            if (inputArray1.length() == mayor) {
                result.add(inputArray1); // Se agrega la cadena a la lista
            }
        }
        // Convertir la lista en un array
        String[] resultArray = result.toArray(String[]::new);
        return resultArray;
    }
}
