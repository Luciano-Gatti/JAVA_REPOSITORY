/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uber_1;

import java.util.Arrays;

/**
 *
 * @author lucia
 */
public class UBER_1 {

    public static void main(String[] args) {
        int ride_time = 30;
        int ride_distance = 7;
        double[] cost_per_minute = {0.2, 0.35, 0.4, 0.45}; 
        double[] cost_per_mile = {1.1, 1.8, 2.3, 3.5};
        for(Double d: solution(ride_time, ride_distance, cost_per_minute, cost_per_mile)){
            System.out.println("$ "+ d); 
        }     
    }
    public static double[] solution(int ride_time, int ride_distance, double[] cost_per_minute, double[] cost_per_mile) {
        double[] result = new double[cost_per_minute.length];
        for(int i = 0; i < cost_per_minute.length; i++){
            result[i] = cost_per_minute[i]*ride_time + cost_per_mile[i]*ride_distance;
            result[i] = Math.round(result[i] * Math.pow(10, 4)) / Math.pow(10, 4);
        }
        return result;
    }

}
