#### Ejercicio 03 - ENCUENTRO 03 - 04 y 05
==================================================
> Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

==================================================
```java
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        do {
            System.out.println("Ingresa una frase");
            frase=leer.nextLine();
            
            if (frase.length() == 8) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }

        } while (frase.length() != 8);
    }
}
```










