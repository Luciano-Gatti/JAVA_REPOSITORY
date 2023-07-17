/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Some people are standing in a row in a park. There are trees between them which cannot be moved. 
 * Your task is to rearrange the people by their heights in a non-descending order without moving the 
 * trees. People can be very tall!
 * @author Luciano Gatti
 */
public class Proyect_112 {

    public static void main(String[] args) {
        int[] arrg = {-1,1,5,3,10,-1,-1,9};
        System.out.println(Arrays.toString(solution(arrg)));
    }
    public static int[] solution(int[] a) {
        List<Integer> altList = new ArrayList();
        int[] result = a;
        int cont = 0;
        altList = Arrays.stream(a).sorted().boxed().collect(Collectors.toList());
        altList.removeIf(element -> element == -1);
        for(int i = 0; i < a.length; i++){
            if(result[i] != -1){
                result[i] = altList.get(cont);
                cont++;     
            }
        }
        return result;
    }

}
