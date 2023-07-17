/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

/**
 * Ticket numbers usually consist of an even number of digits. 
 * A ticket number is considered lucky if the sum of the first half of the digits 
 * is equal to the sum of the second half.
 * Given a ticket number n, determine if it's lucky or not.
 * @author Luciano Gatti with ChatGPT
 */

public class Proyect_111 {

    public static void main(String[] args) {
        System.out.println("Resultado de n = 5115: " + solution(5115));
    }

    public static boolean solution(int n) {
        String str = Integer.toString(n);
        int length = str.length();
        int sum1 = 0, sum2 = 0;

        int halfLength = length / 2;
        for (int i = 0; i < length; i++) {
            int digit = str.charAt(i) - '0';
            if (i < halfLength) {
                sum1 += digit;
            } else {
                sum2 += digit;
            }
        }
        return sum1 == sum2;
    }
}