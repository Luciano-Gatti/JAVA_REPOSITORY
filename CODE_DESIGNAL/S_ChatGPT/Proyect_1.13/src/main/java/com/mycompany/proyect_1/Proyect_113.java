/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Stack;



/**
 * Write a function that reverses characters in (possibly nested) parentheses in the 
 * input string.
 * Input strings will always be well-formed with matching ()s.
 * @author Luciano Gatti
 */
public class Proyect_113 {

    public static void main(String[] args) {
        String input = "Hola (este es un (ejemplo) de prueba)!";
        String resultado = invertirParentesis(input);
        System.out.println(resultado);
    }

    public static String invertirParentesis(String cadena) {
        StringBuilder sb = new StringBuilder(cadena);
        Stack<Integer> pila = new Stack<>();

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (c == '(') {
                pila.push(i);
            } else if (c == ')') {
                int inicio = pila.pop();
                int fin = i;

                // Invertir los caracteres entre paréntesis
                invertirSubstring(sb, inicio + 1, fin - 1);
            }
        }
        
        // Eliminar los paréntesis del resultado final
        eliminarParentesis(sb);
        
        return sb.toString();
    }

    private static void invertirSubstring(StringBuilder sb, int inicio, int fin) {
        while (inicio < fin) {
            char temp = sb.charAt(inicio);
            sb.setCharAt(inicio, sb.charAt(fin));
            sb.setCharAt(fin, temp);
            inicio++;
            fin--;
        }
    }

    private static void eliminarParentesis(StringBuilder sb) {
        while(sb.indexOf(")") != -1){
            sb.deleteCharAt(sb.indexOf("("));
            sb.deleteCharAt(sb.indexOf(")"));
        } 
    }
}
