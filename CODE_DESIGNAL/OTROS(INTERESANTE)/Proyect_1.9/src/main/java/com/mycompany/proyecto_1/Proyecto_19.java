/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_1;

import java.util.Arrays;

/**
 *
 * @author lucia
 */
public class Proyecto_19 {
    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        System.out.println("resultado: " + Arrays.toString(solution(inputArray)));
    } 
    public static String[] solution(String[] inputArray) {
        String l = ""; //full string with "-" separator
        for( String s: inputArray )
        {
            //length is first index of substring
            //if list has same size strings, add this one
            if( l.indexOf("-") == s.length() ) l += s + "-";
            
            //reset if list has smaller strings
            else if ( l.indexOf("-") < s.length() ) l = s + "-"; 
        }
        return l.split( "-" );
    }
}
