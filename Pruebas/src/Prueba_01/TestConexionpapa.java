//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo 
//de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un 
//formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter 
//tiene que ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial 
//“&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, 
//que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
//e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().
package Prueba_01;

import java.util.Scanner;

public class TestConexionpapa {

    public static void main(String[] args) {

        
        Scanner leer = new Scanner(System.in);
        
       
        
        
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        int correctas = 0;
        int incorrectas = 0;

        do {

            if (frase.length() <= 5) {

                if (frase.substring(0, 1).equalsIgnoreCase("X") && frase.substring(frase.length() - 1, frase.length()).equalsIgnoreCase("O")) {

                    correctas++;
                } else {
                    incorrectas++;
                }

            } else {
                incorrectas++;
            }
            
            System.out.println("Ingrese una frase");
            frase = leer.nextLine();
            

        } while (!frase.equals("&&&&&"));

        System.out.println("las palabras correctas son " + correctas + " y las incorrectas son " + incorrectas);

    }
}
