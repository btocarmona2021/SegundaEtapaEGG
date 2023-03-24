#### Ejercicio 08 - ENCUENTRO 03 - 04 y 05
==================================================
> Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente: 
![][image_ref_oi1ic79f]


==================================================
```java
public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamaño en numeros");
        int tamanio=leer.nextInt();
        
        for (int i = 0; i < tamanio; i++) {
            
            for (int j = 0; j < tamanio; j++) {
                
                if (i>0 && i<tamanio-1 && j>0 && j<tamanio-1) {
                    System.out.print(" "+" ");
                    
                }else{
                    System.out.print("*"+" ");
                }
               
            }
             System.out.println("");
        }
    }
}
```














[image_ref_oi1ic79f]: data:image/png;base64,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
