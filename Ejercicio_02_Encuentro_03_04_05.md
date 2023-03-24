#### Ejercicio 02 - ENCUENTRO 03 - 04 y 05
==================================================
> Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
//investigar la función equals() en Java.

==================================================

```java
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
}
```









