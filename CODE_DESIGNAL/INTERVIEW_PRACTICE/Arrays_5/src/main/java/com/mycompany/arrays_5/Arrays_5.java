/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays_5;


/**
 * A cryptarithm is a mathematical puzzle for which the goal is to find the correspondence between letters and digits, 
 * such that the given arithmetic equation consisting of letters holds true when the letters are converted to digits.
 * You have an array of strings crypt, the cryptarithm, and an an array containing the mapping of letters and digits, 
 * solution. The array crypt will contain three non-empty strings that follow the structure: [word1, word2, word3], 
 * which should be interpreted as the word1 + word2 = word3 cryptarithm.
 * If crypt, when it is decoded by replacing all of the letters in the cryptarithm with digits using the mapping in 
 * solution, becomes a valid arithmetic equation containing no numbers with leading zeroes, the answer is true. 
 * If it does not become a valid arithmetic solution, the answer is false.
 * Note that number 0 doesn't contain leading zeroes (while for example 00 or 0123 do).
 * @author Luciano Gatti
 */

public class Arrays_5 {

    public static void main(String[] args) {
        char[][] s = {{'O', '0'}, {'M', '1'}, {'Y', '2'}, {'E', '5'}, {'N', '6'},{'D', '7'},{'R', '8'}, {'S', '9'},};
        String[] crypt = {"SEND", "MORE", "MONEY"};   
        System.out.println(solution(crypt, s));
    }

    public static boolean solution(String[] crypt, char[][] matriz) {
        long[] resultados = new long[3];
        for (int i = 0; i < crypt.length; i++) {
            StringBuilder sum = new StringBuilder();
            for (int j = 0; j < crypt[i].length(); j++) {
                sum.append(GetNumber(crypt[i].charAt(j), matriz));
            }
            if (ControlarNumero(sum.toString())) {
                return false;
            } else {
                resultados[i] = Long.parseLong(sum.toString());
            }
        }
        return resultados[0] + resultados[1] == resultados[2];
    }

    public static String GetNumber(char c, char[][] matriz) {
        for (char[] entry : matriz) {
            if (entry[0] == c) {
                return String.valueOf(entry[1]);
            }
        }
        return "";
    }

    public static boolean ControlarNumero(String sum) {
        return sum.length() > 1 && sum.charAt(0) == '0';
    }
}
