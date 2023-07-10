/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Portafolio {
    List<Tareas> listaTareas; 
    Scanner index = new Scanner(System.in);

    public Portafolio() {
        listaTareas = new ArrayList<>();
    }
    
    //Metodos de la clase
    public void AgregarTarea(Tareas tarea){
        listaTareas.add(tarea);
    }   
    public void MostrarTareas(){
        int i = 0;
        if(!listaTareas.isEmpty()){
           for(Tareas t: listaTareas)
            {
                i++;    
                System.out.println("***********************************");
                System.out.println("Tarea n°"+i+": "+t.getTarea());
                System.out.println("Importancia: "+t.getImportancia());
                System.out.println("Estado: "+t.getEstado());
                System.out.println("***********************************\n");
            } 
        }else{
            System.out.println("La lista se encuentra vacia.");
        }           
    }   
    public void EliminarTarea(){
        int tarea, op;       
        if(!listaTareas.isEmpty()){
            System.out.println("Que tarea desea eliminar: ");
            MostrarTareas();
            System.out.println("Numero de tarea: ");
            tarea = index.nextInt();
            tarea -= 1;
            if(tarea >= 0){
                System.out.println("¿Esta seguro que desea eliminar la tarea?");
                System.out.println("Tarea: "+listaTareas.get(tarea).getTarea());
                System.out.println("1) SI\n2) NO");
                op = index.nextInt();
                switch (op) {
                    case 1 -> listaTareas.remove(tarea);
                    case 2 -> {}
                    default -> System.out.println("Valor Incorrecto");
                }   
            }
        }else{
            System.out.println("La lista se encuentra vacia.");
        }
    }
}
