
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner index = new Scanner (System.in);
        ArrayList <Competidores> listCompetidores = new ArrayList();
        boolean menu = true;
        int opcion;
        
        while (menu)  //Ciclo Menu principal de sistema
        {
            //Menu
            System.out.println("Seleccione que desea hacer:");
            System.out.println("Escriba 0 si desea cargar un competidor");
            System.out.println("Escriba 1 si desea cargar el tiempo de un competidor");
            System.out.println("Escriba 2 si desea mostrar los tiempos almacenados");
            System.out.println("Escriba 3 si desea  Salir");
            opcion = index.nextInt();
            switch (opcion)
            {
                case 0-> //Algoritmo de carga de competidor
                {
                    int idCompetidor;
                    boolean control = false;
                    do
                    {
                        System.out.println("Ingrese el identificador del competidor (Entre 1 y 160)");
                        idCompetidor = index.nextInt();
                        if (idCompetidor < 1 || idCompetidor > 160)
                        {
                            System.out.println("Identificador invalido, Por favor reintente.");
                        }
                        else
                        {
                            for (Competidores arrgCompetidore : listCompetidores) //Se controla que no exista el Identificador 
                            {
                                if (arrgCompetidore.getIdentificador() == idCompetidor) 
                                {
                                    control = true;
                                    System.out.println("Ya existe un competidor con ese identificador. Intenete nuevamente.");
                                    break;
                                } 
                                else 
                                {
                                    control = false;
                                }
                            }
                        }
                    }while (idCompetidor < 1 || idCompetidor > 160 || control);
                    System.out.println("Cargando...");
                    Competidores competidor = new Competidores(idCompetidor);
                    listCompetidores.add(competidor);
                    System.out.println("Operacion completada\n");
                }
                
                case 1 -> //Algoritmo de carga de tiempo
                {
                    int idCompetidor;
                    int tiempo = 0;
                    boolean control = false;                    
                    Competidores competidor = null;
                    
                    do
                    {
                        System.out.println("Ingrese el identificador del competidor (Entre 1 y 160)");
                        idCompetidor = index.nextInt();
                        if (idCompetidor < 1 || idCompetidor > 160)
                        {
                            System.out.println("Identificador invalido, Por favor reintente.");
                        }  
                    }while (idCompetidor < 1 || idCompetidor > 160);
                    
                    do//Se controla que el tiempo no sea nulo         
                    {
                        System.out.println("Ingrese el tiempo que desea cargar (En Minutos)");
                        try{
                            tiempo = index.nextInt(); 
                        }catch(Exception e){
                            tiempo = 0;
                            System.out.println("Debe ingresar un valor entero.");
                        }
                        if (tiempo <= 0)
                        {
                            System.out.println("El tiempo debe ser mayor a 0, Por favor reintente.");
                        }
                    }while (tiempo <= 0);  
                    for (Competidores c : listCompetidores) 
                    {
                        if (c.getIdentificador() == idCompetidor) 
                        {
                            competidor = c;
                            control = true;
                            break;
                        }
                    }
                    if(control){
                        System.out.println("Cargando...");
                        competidor.setTiempo(tiempo);
                        System.out.println("Operacion completada\n");
                    }else{
                        System.out.println("No existe ningun jugador con ese identificador.");
                    }    
                }

                case 2 -> //Algortimo de ordenamiento e impresion
                {                    
                    int contCompetidores = 0;
                    boolean existenJugadores = false;
                    
                    System.out.println("Calculando...\n");
                    Collections.sort(listCompetidores);
                    
                    for (Competidores c: listCompetidores)
                    {
                        contCompetidores++;
                        if (c.getTiempo() != 0)
                        {   
                            existenJugadores = true;
                            switch(contCompetidores)
                            {
                                case 1:
                                    System.out.println("PODIO:");
                                    System.out.println("Ganador: Competidor: " + c.getIdentificador() + " Tiempo (minutos): " + c.getTiempo());
                                    break;
                                case 2:
                                    System.out.println("Segundo Lugar: Competidor: " + c.getIdentificador() + " Tiempo (minutos): " + c.getTiempo());
                                    break;
                                case 3:
                                    System.out.println("Tercer Lugar: Competidor: " + c.getIdentificador() + " Tiempo (minutos): " + c.getTiempo());
                                    System.out.println("Fin Podio");
                                    break;    
                                default:
                                    System.out.println("Posicion: " + contCompetidores + " Competidor: " + c.getIdentificador() + " Tiempo (minutos): " + c.getTiempo());
                                    break;
                            }      
                        }  
                    } 
                    if (existenJugadores == false)
                    {
                        System.out.println("No se cargo el tiempo de ningun jugador\n");   
                    }
                    else
                    {
                        System.out.print("\n");
                    } 
                }
                
                case 3 -> //Salida del sistema
                {
                    System.out.println("Saliendo...\n");
                    menu = false;    
                }
                default -> // En caso de opcion de menu invalida
                {
                    System.out.println("Opcion invalida, por favor reintente.\n");     
                }               
            }    
        }
    } 
}
