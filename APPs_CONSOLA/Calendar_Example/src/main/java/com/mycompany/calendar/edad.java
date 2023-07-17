package com.mycompany.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;



public class edad {

    public static void main(String[] args) {
        Scanner sca = new Scanner (System.in);
        Calendar cal = new GregorianCalendar();
        int diaActual, mesActual, anoActual, dia, mes, ano, dia_r, mes_r, ano_r;

        diaActual=cal.get(Calendar.DAY_OF_MONTH);
        mesActual=cal.get(Calendar.MONTH); 
        anoActual=cal.get(Calendar.YEAR);
        System.out.print("Ingrese el dia de su nacimiento");
        dia = sca.nextInt();
        System.out.print("Ingrese el mes de su nacimiento");
        mes = sca.nextInt();
        System.out.print("Ingrese el año de su nacimiento");
        ano = sca.nextInt();
      
        dia_r= Math.abs (diaActual - dia);
        mes_r= Math.abs (mesActual - mes);
        ano_r= Math.abs (anoActual - ano);
    
        if (ano == anoActual) {
            if (mes < mesActual) {
             System.out.print("Tiene: "+mes_r+" y "+dia_r+" dias");   
            }
            else
            {
            System.out.print("Tiene: "+dia_r+" dias");
            }
        }
        else
        {
         System.out.print("Tiene: "+ano_r+" años");
        }
    }
}
    
