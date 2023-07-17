/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Arrays;

/**
 *
 * @author lucia
 */
public class Proyect_117 {

    public static void main(String[] args) {
        double [] prices = {40,40,40,40};
        String [] notes = {"0.001% higher than in-store", "0.0% lower than in-store", "0.0% higher than in-store", "0.0% lower than in-store"};
        double x = 0;
        System.out.println(solution(prices, notes, x));
    }
    
    public static boolean solution(double[] prices, String[] notes, double x) {
        double sum = 0.0;
        double porc;
        for(int i = 0; i < prices.length; i++){
            if(notes[i].toLowerCase().contains("higher")){
                porc = ConvertPorcentaje(notes[i]);
                System.out.println(porc);
                sum += prices[i] - (prices[i] / (1+porc));
                System.out.println(sum);
            }else if(notes[i].toLowerCase().contains("lower")){
                porc = ConvertPorcentaje(notes[i]);
                System.out.println(porc);
                sum -= (prices[i] / (1-porc)) - prices[i];
                System.out.println(sum);
            }else{
                sum += 0;
                System.out.println(sum);
            }
        }
        sum = Math.round(sum * Math.pow(10, 3)) / Math.pow(10, 3);        
        System.out.println(sum + " " + x);
        return sum <= x;
    }

    public static double ConvertPorcentaje(String note) {   
        String doubleString = note.replaceAll("[^\\d.]", ""); // Remover caracteres que no sean dígitos o puntos
        double porc = Double.parseDouble(doubleString) / 100;
        return porc;
    }
}
