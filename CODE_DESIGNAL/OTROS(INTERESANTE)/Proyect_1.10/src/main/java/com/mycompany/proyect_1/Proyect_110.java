/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Scanner;

/**
 *
 * @author lucia
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
        int counter = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s2.contains(String.valueOf(s1.charAt(i)))){
                counter++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
            }
        }
        return counter;
    }
}
