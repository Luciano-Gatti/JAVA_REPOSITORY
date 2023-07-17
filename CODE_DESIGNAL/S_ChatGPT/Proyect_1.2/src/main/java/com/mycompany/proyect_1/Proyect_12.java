/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Scanner;

/**
 * Given a year, return the century it is in. The first century spans from 
 * the year 1 up to and including the year 100, the second
 * - from the year 101 up to and including the year 200, etc.
 * @author Luciano Gatti
 */
public class Proyect_12 {

    public static void main(String[] args) {
        int year, century;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("INGRESE EL AÑO: ");
            year = scanner.nextInt();     
        }
        century = solution(year);
        System.out.println(century);
    }

    public static int solution(int year) {
        int century;
        if(year % 10 == 0 && year % 100 == 0){
            century = year / 100;
        }else{
            century = (year / 100) + 1;
        }
        return century;
    }
}
