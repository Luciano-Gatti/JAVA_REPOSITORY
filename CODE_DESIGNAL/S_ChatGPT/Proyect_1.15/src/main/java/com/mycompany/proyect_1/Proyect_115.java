/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

/**
 *
 * @author lucia
 */
public class Proyect_115 {

    public static void main(String[] args) {
        String[] arrg = {"abvc", "ahbc", "sdcf", "hola"};
        String[] solu = solution(arrg);
        for(String s: solu){
           System.out.println(s);
        }
    }
    public static String[] solution(String[] picture) {
        String[] result = new String[picture.length+2];
        int cant = picture[0].length()+2, cont = 0;
        String str = "";

        for(int i=0; i<result.length; i++){
            if(i == 0 || i == result.length-1){
                for(int j=0; j < cant; j++){
                    str += "*";
                }
                result[i] = str;
                str = "";
            }else{
                result[i] = "*" + picture[cont++] + "*";     
            }
        }
        return result;
    }
}
