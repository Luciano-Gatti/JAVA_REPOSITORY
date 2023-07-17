/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Scanner;

/**
 * Given two strings, find the number of common characters between them.
 * @author Luciano Gatti
 */
public class Proyect_110 {

    public static void main(String[] args) {
        String s1, s2;
        try(Scanner index = new Scanner(System.in)){
            System.out.println("Ingrese el primer texto: ");
            s1 = index.nextLine();
            System.out.println("Ingrese el segundo texto: ");
            s2 = index.nextLine();
        }
        System.out.println("Resultado: "+solution(s1,s2));
    }
    public static int solution(String s1, String s2) {
        StringBuilder str2 = new StringBuilder(s2);
        int result = 0;
        char c;
        for (int i = 0; i < s1.length(); i++) {
            c = s1.charAt(i);
            int index = str2.indexOf(String.valueOf(c));
            if (index != -1) {
                result++;
                str2.deleteCharAt(index);
            }
        }
        return result;
    }
}
