### Primeros pasos en JavaScript
#### Concatenación de cadenas:

> Concatenar cadenas.
```javascript
var nombre = "Alberto";
var apellido = "Carmona";
var nombreCompleto = nombre +' '+ apellido;
console.log(nombreCompleto)
```
> Concatenar números con cadenas, da como resultado un String.
```javascript
var numero_01 = 15;
var texto = "edad";
console.log(texto + numero_01)
```
> concatenar numeros con cadenas y suma de numeros
```javascript
var numero_01 = 15;
var numero_02=5;
var texto = "edad";
console.log(texto +' '+ (numero_01 + numero_02))
```
* Prestar atención que la lectura se hace de izquierda a derecha si los números escritos estuviesen primero que el string no haría falta que los mismo estén entre paréntesis para que realizar la suma.
```javascript
var numero_01 = 15;
var numero_02=5;
var texto = "edad";
console.log(numero_01 + numero_02 + texto)
```


