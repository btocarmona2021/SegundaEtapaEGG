#### Ejercicio 02 - ENCUENTRO 02
==================================================
> Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla,

==================================================
```java
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre=leer.nextLine();
        System.out.println("Tú nombre es = " + nombre);
    }
}
```