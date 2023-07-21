/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays_4;

import java.util.HashSet;
import java.util.Set;

/**
 * Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid 
 * with numbers in such a way that each column, each row, and each of the nine 
 * 3 × 3 sub-grids that compose the grid all contain all of the numbers from 1 to 
 * 9 one time.
 * Implement an algorithm that will check whether the given grid of numbers 
 * represents a valid Sudoku puzzle according to the layout rules described above. 
 * Note that the puzzle represented by grid does not have to be solvable.
 * @author Luciano Gatti
 */
public class Arrays_4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    //sudoku control 
    public static boolean solution1(char[][] grid) {
        Set<String> set = new HashSet<>();
        for (int row = 0; row < grid.length ; row++) {
            for (int col = 0; col < grid.length; col++) {
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in row " + row)){
                    return false;
                }                   
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in col " + col)){
                    return false;
                }                 
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in square " + row/3 + " " + col/3)){
                    return false;
                }    
            }
        } 
        return true;
    }
    
    //sudoku control 
    public static boolean solution2(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                char c = grid[i][j];
                if (c != '.') {
                    if (Duplicados(grid, i, j, c)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean Duplicados(char[][] grid, int row, int col, char c) {
        // Check row and column for duplicates
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][col] == c && i != row) {
                return true;
            }
            if (grid[row][i] == c && i != col) {
                return true;
            }
        }
        // Check sub-grid for duplicates
        int subRowStart = 3 * (row / 3);
        int subColStart = 3 * (col / 3);
        for (int i = subRowStart; i < subRowStart + 3; i++) {
            for (int j = subColStart; j < subColStart + 3; j++) {
                if (grid[i][j] == c && (i != row || j != col)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    
}
