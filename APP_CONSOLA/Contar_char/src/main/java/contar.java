
import java.util.Scanner;

public class contar {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        String a;
        int totalchar = 0;
        char temp;
       
        System.out.println("Ingrese la cadena de texto: \n"); 
        a = leer.nextLine();
      
        for (int i = 0; i < a.length(); i++) 
        {
            temp = a.charAt(i);
            if (temp == 'a')
            {
                totalchar++;
            }
        }
        System.out.println("Hay " + totalchar + " 'a' en el texto ingresado.");
    }
}
    