/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.peso_personas;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciano
 */
public class Main {
    public static void main(String[] args) {
    int peso_ideal;    
    String[] option = {"Femenino", "Masculino"};
    
    String generos = (String) JOptionPane.showInputDialog(null, "Seleccione el genero", "OMS", JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
    int altura = Integer. parseInt(JOptionPane.showInputDialog("Ingrese su altura en centímetros"));
    
        if ("Masculino".equals(generos)) {
            peso_ideal = altura - 110;
            JOptionPane.showMessageDialog(null, "Su peso ideal es: "+ peso_ideal);           
        } else {
            peso_ideal = altura - 120; 
            JOptionPane.showMessageDialog(null, "Su peso ideal es: "+ peso_ideal);
        }
    }  
}

