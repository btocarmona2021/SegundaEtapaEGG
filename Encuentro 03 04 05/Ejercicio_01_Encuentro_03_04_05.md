#### Ejercicio 01 - ENCUENTRO 03 - 04 y 05
==================================================
> //Crear un programa que dado un numero determine si es par o impar.

==================================================
```java
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa el primer número");
    int num1 = leer.nextInt();

    if (num1 % 2 == 0) {
        System.out.println("El número es par");
    } else {
        System.out.println("El número es impar");
    }
}
```








