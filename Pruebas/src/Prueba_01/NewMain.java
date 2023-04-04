
package Prueba_01;

import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        
        if (frase.length() ==8) {
            System.out.println("Corecto");
        }else{
            System.out.println("incorrecto");
        }
        
        
        
        
        // TODO code application logic here
    }

}
