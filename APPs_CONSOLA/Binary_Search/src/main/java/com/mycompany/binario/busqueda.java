package com.mycompany.binario;

import java.util.Arrays;
import java.util.Scanner;

public class busqueda {

    public static void main(String[] args) {
       int a;
        Scanner sc = new Scanner(System.in);
       
       System.out.print("Ingrese la cantidad de personas: \n");
       a = sc.nextInt();
       
       /*Declaracion del arreglo*/
       int [] arg  = new int[a];
       
       /*Insercción de elementos en el arreglo*/
       for (int i = 0; i < arg.length; i++) {
           System.out.print("Ingrese el DNI: \n"); 
           arg[i]=sc.nextInt();
        }
       
       
       /*Ordenar elementos*/
        for (int j = 0; j < a; j++) {
            int aux = 0;
            for (int i = 0; i < a-1 ; i++) {
                if (arg[i] > arg[i+1]) {
                    aux = arg[i];
                    arg [i] = arg [i+1];
                    arg [i+1]=aux;
                }
            }
        }
      
        /*mostrar arreglo*/   
       System.out.print("DNI: \n");
        for (int y = 0; y < arg.length; y++) {
            System.out.print("Posicion["+y+"] = " + arg[y]+"\n");      
        }
        
        int posicion, dni_buscado;
        System.out.print("DNI a buscar: \n");
        dni_buscado = sc.nextInt();
        
        Arrays.sort(arg);
        posicion = Arrays.binarySearch(arg, dni_buscado);
        System.out.print("El DNI buscado se encuentra en la posicion: \n" + posicion);
    }
}

    

