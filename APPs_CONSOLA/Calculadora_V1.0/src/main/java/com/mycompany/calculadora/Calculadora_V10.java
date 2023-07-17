/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Calculadora_V10 {

    public static Operaciones op = new Operaciones();
    public static double a, b;    
    public static Scanner index = new Scanner(System.in);
    
    public static void main(String[] args) {
        int selected;
        double resultado;
        boolean control = true;
        do
        {
            System.out.println("Que operacion desea realizar: \n1)suma \n2)resta \n3)multiplicacion \n4) division \n5)raiz \n6)potencia \n7)salir");
            selected = index.nextInt();
            switch(selected)
            {           
                case 1: 
                    MostrarConsola();
                    resultado = op.suma();
                    System.out.println("El resultado es: "+resultado+"\n");
                break;
                case 2: 
                    MostrarConsola();    
                    resultado = op.resta();
                    System.out.println("El resultado es: "+resultado+"\n");
                break;
                case 3: 
                    MostrarConsola();
                    resultado = op.multiplicacion();
                    System.out.println("El resultado es: "+resultado+"\n");
                break;
                case 4: 
                    MostrarConsola();
                    resultado = op.division();
                    System.out.println("El resultado es: "+resultado+"\n");
                break;
                case 5: 
                    System.out.println("Ingrese el numero: ");
                    a = index.nextDouble();
                    System.out.println("Ingrese la raiz: ");
                    b = index.nextDouble();
                    op.setA(a);
                    op.setB(b);
                    resultado = op.raiz();
                    System.out.println("El resultado es: "+resultado+"\n");
                break;
                case 6: 
                    System.out.println("Ingrese el numero: ");
                    a = index.nextDouble();
                    System.out.println("Ingrese la potencia: ");
                    b = index.nextDouble();
                    op.setA(a);
                    op.setB(b);
                    resultado = op.potencia();
                    System.out.println("El resultado es: "+resultado+"\n");
                break;
                case 7:  
                    control = false;
                break;
            }
        }while(control);       
    }
    public static void MostrarConsola(){
        System.out.println("Ingrese el primer numero: ");
        a = index.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        b = index.nextDouble();
        op.setA(a);
        op.setB(b);
    }
}
