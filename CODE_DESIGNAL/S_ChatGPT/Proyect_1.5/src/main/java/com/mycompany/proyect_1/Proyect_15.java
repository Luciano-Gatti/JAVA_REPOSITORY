/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Scanner;

/**
 * Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
 * A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by 
 * taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. 
 * You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
 * @author Luciano Gatti
 */

public class Proyect_15 {

    public static void main(String[] args) {
        int poligon, result;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Ingrese el numero del poligono: ");
            poligon = scanner.nextInt();
        }
        result = solution(poligon);
        System.out.println("resultado: " + result);
    }

    public static int solution(int n) {
        int solucion = 1;
        for(int i = 0; i < n; i++){
            solucion = solucion + (4 * i);
        }
        return solucion;
    }
}
