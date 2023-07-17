/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Stack;

/**
 * Write a function that reverses characters in (possibly nested) parentheses in the 
 * input string.
 * Input strings will always be well-formed with matching ()s.
 * @author Luciano Gatti with ChatGPT
 */
public class Proyect_113 {

    public static void main(String[] args) {
        String a = "foo(bar(baz))blim";
        System.out.println("Resultado: " + solution(a));
    }
    public static String solution(String inputString) {
        Stack<Character> stack = new Stack<>();
        for (char ch : inputString.toCharArray()) {
            if (ch == ')') {
                StringBuilder temp = new StringBuilder();
                while (stack.peek() != '(') {
                    temp.append(stack.pop());
                }
                stack.pop(); // Descartar el paréntesis de apertura
                for (char reversedChar : temp.toString().toCharArray()) {
                    stack.push(reversedChar);
                }
            } else {
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }
}