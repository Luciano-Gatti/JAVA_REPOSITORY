/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays_2;

import java.util.HashMap;

/**
 *Given a string s consisting of small English letters, find and return the 
 * first instance of a non-repeating character in it. 
 * If there is no such character, return '_'.
 * @author Luciano Gatti
 */
public class Arrays_2 {

    public static void main(String[] args) {
        String s = "abacabad";
        System.out.println(s);
        System.out.println(solution1(s));
        System.out.println(solution2(s));
    }
    
    //solution1
    public static char solution1(String s) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (charFrequency.get(c) == 1) {
                return c;
            }
        }
        return '_';
    }
    
    //solution2
    public static char solution2(String s) {
        int cont = 0;
        for(int i = 0; i<s.length(); i++){
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    cont++;
                }
            }
            if(cont == 1){
                return s.charAt(i);
            }else{
                cont = 0;
            }
        }
        return '_';
    }
}
