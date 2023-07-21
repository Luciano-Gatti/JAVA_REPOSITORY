/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays_1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *Given an array a that contains only numbers in the range from 1 to a.length, 
 * find the first duplicate number for which the second occurrence has the minimal 
 * index. In other words, if there are more than 1 duplicated numbers, return the 
 * number for which the second occurrence has a smaller index than the second 
 * occurrence of the other number does. If there are no such elements, return -1.
 * @author Luciano Gatti
 */
public class Arrays_1 {

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 5, 3, 2};
        int result = solution(a);
        System.out.println(result); // Output: 3
    }
    public static int solution(int[] a) {
        int[] indices= new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            if (indices[num] != 0) {
                return num;
            }
            indices[num] = i + 1;
        }
        return -1; 
    }
}
