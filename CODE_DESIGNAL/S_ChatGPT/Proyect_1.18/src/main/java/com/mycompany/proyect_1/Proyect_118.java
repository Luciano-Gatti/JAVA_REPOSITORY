/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find out if its characters can be rearranged to 
 * form a palindrome.
 * @author Luciano Gatti
 */
public class Proyect_118 {

    public static void main(String[] args) {
        String a = "hellohello";
        System.out.println(solution(a));
    }  
    
    static boolean solution(String inputString) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            System.out.println(charFrequency.getOrDefault(c, 0)); 
        }

        int oddCount = 0;        
        for (int count : charFrequency.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }
}
