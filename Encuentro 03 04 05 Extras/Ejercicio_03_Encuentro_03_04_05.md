#### Ejercicio 03 EXTRAS - ENCUENTRO 03 - 04 y 05
==================================================
> Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

==================================================
```java
public static void metodo(String letra) {

        switch (letra.toLowerCase()) {
            case "a":System.out.println("La letra ingresada es una a");
                break;
            case "e":System.out.println("La letra ingresada es una e");
                break;
            case "i":System.out.println("La letra ingresada es una i");
                break;
            case "o":System.out.println("La letra ingresada es una o");
                break;
            case "u":System.out.println("La letra ingresada es una u");
                break;
            default:
                System.out.println("La letra ingresada no es una vocal");
        }
    }
}
```

