/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

/**
 *
 * @author lucia
 */
public class Proyect_110 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "defxyz";
        int commonCount = solution(s1, s2);
        System.out.println("Number of common characters: " + commonCount);
    }
    public static int solution(String s1, String s2) {
        int commonCount = 0;
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            count2[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            commonCount += Math.min(count1[i], count2[i]);
        }

        return commonCount;
    }

}
