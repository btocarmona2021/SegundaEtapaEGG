#### Ejercicio 01 - ENCUENTRO 02
==================================================
> //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
//por pantalla

==================================================
```java
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ahora ingresa el segundo número a sumar");
        int num2 = leer.nextInt();
        System.out.println("La suma de ambos numeros es " + suma(num1, num2));

    }

    public static int suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
}
```
