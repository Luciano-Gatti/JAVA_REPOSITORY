/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.daily_challenge_isadmissibleoverpsyment;

/**
 *
 * @author lucia
 */
public class Daily_Challenge_isAdmissibleOverpsyment {

    public static void main(String[] args) {
        double [] prices = {40,40,40,40};
        String [] notes = {"0.001% higher than in-store", "0.0% lower than in-store", "0.0% higher than in-store", "0.0% lower than in-store"};
        double x = 0;
        System.out.println(solution(prices, notes, x)); //false
    }
    
    public static boolean solution(double[] prices, String[] notes, double x) {
        double sum = 0.0;
        double porc;
        for(int i = 0; i < prices.length; i++){
            if(!notes[i].toLowerCase().contains("same")){
                porc = Double.parseDouble(notes[i].replaceAll("[^\\d.]", "")) / 100;
                if(notes[i].toLowerCase().contains("higher")){
                    sum += prices[i] - (prices[i] / (1+porc));
                }
                else{
                    sum -= (prices[i] / (1-porc)) - prices[i];
                }
            }            
        }
        if(sum > 1){
            sum = Math.round(sum * Math.pow(10, 3)) / Math.pow(10, 3);
        }
        return sum <= x;
    }
}
