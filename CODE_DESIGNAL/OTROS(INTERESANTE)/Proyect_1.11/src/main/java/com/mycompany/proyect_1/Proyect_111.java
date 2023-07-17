/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

/**
 *
 * @author lucia
 */
public class Proyect_111 {

    public static void main(String[] args) {
        System.out.println("Resultado de n = 5115: " + solution(5115));
    }
    public static boolean solution(int n) {
        String s = n+"";
        int sum = 0;
        for(int i=0; i<s.length()/2; i++){
            sum+=(s.charAt(i)-s.charAt(s.length()-1-i));
        }          
        return sum==0;
    }

}
