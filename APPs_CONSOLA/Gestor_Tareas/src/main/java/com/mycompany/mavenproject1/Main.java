/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Main {
    //variables globales
    public static Scanner index = new Scanner (System.in);
    
    public static void main(String[] args) throws ParseException {       
        boolean control = true;
        Portafolio portafolio = new Portafolio();
        Tareas tarea;
        int seleccion;
        
        do{
            System.out.println("Que desea realizar: \n1) Agregar Tarea \n2 Mostrar Tareas \n3) Eliminar Tareas \n4) Salir");
            seleccion = index.nextInt();
            switch(seleccion){
                case 1: 
                    tarea = CrearTarea();
                    portafolio.AgregarTarea(tarea);
                    break;
                case 2: 
                    portafolio.MostrarTareas();
                    break;
                case 3: 
                    portafolio.EliminarTarea();
                    break;
                case 4: 
                    control = false;
                    break;
                default: 
                    System.out.println("VALOR INCORRECTO. INTENTE NUEVAMENTE.");
                    break;
            }
        }while(control);       
    }
    public static Tareas CrearTarea() throws ParseException{
        int seleccion;
        String importancia = null, tarea, fechaInicial, fechaFinal;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
        System.out.println("Que tarea debe realizar: ");
        index.nextLine();
        tarea = index.nextLine();

        System.out.println("Seleccione la importancia de la tarea: \n1) Muy importante \n2) Importante \n3) Poco Importante");
        seleccion = index.nextInt();
        index.nextLine();
            switch(seleccion){
                case 1 -> importancia = "Muy Importante";
                case 2 -> importancia = "Importante";
                case 3 -> importancia = "Poco Importante";
                default -> System.out.println("Valor incorrecto");
            }
        Date date = Date.from(Instant.now());
        fechaInicial = df.format(date);                     
        System.out.println("Ingrese la fecha limite de la tarea, con el siguiente formato: yyyy-MM-dd HH:mm");
        fechaFinal = index.nextLine();
        Tareas tareaCreada = new Tareas(tarea, importancia, fechaInicial, fechaFinal);
        tareaCreada.CalcularTiempo();
       return tareaCreada;         
    }
}
