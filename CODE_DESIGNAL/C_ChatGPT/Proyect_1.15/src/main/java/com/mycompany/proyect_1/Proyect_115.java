/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;


import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author lucia
 */
public class Proyect_115 {

    public static void main(String[] args) {
        String[] arrg = {"abvc", "ahbc", "sdcf", "hola"};
        String[] solu = solution(arrg);
        for(String s: solu){
           System.out.println(s);
        }
    }
    public static String[] solution(String[] picture) {
        int cant = picture[0].length() + 2;
        String topAndBottomRow = "*".repeat(cant);
        String[] result = Stream.concat(Stream.of(topAndBottomRow), Arrays.stream(picture).map(str -> "*" + str + "*")).toArray(String[]::new);
        result = Stream.concat(Arrays.stream(result), Stream.of(topAndBottomRow)).toArray(String[]::new);       
        return result;
    }
}
