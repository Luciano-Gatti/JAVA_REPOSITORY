/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

/**
 * After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost, 
 * and some of them are free, but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious, 
 * they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.
 * Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the 
 * total sum of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).
 * @author Luciano Gatti with ChatGPT
 */

public class Proyect_18 {

    
    public static void main(String[] args) {
        int[][] matriz = {{1,9,0,10}, {3,1,5,1}, {2,0,8,9}};
        System.out.println("resultado: " + solution(matriz));
    }
    
    public static int solution(int[][] matrix) {
        int rooms = matrix[0].length;
        int floors = matrix.length;
        int sum = 0;
        for(int i = 0; i < rooms; i++) {
            for(int j = 0; j < floors && matrix[j][i] > 0; j++) {
                sum += matrix[j][i];
            }
        }
        return sum;
    }
}
