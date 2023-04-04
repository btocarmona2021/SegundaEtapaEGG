### Primeros pasos en JavaScript
#### Tipos de datos:

> Tips para verificar que tipo de datos es, se escribe typeof(variable)  
* console.log(typeof(autos))

=======================================================
> //Tipo de datos String
```javascript
var nombre = "Carlos";
console.log(nombre);
```
> //Tipo de datos numéricos
```javascript
var numero = 1000;
console.log(numero);
```
> //Tipo de dato objeto
```javascript
var objeto = {
  nombre: "Alberto",
  apellido: "Carmona",
  edad: 48,
  telefono: 2920286288,
};
console.log(objeto);
```
> //Tipo de datos Booleanos
```javascript
var estado = true;
console.log(estado);
```
> //Tipo de datos function
```javascript
function mifuncion() {}
console.log(mifuncion);
```
> //Tipo de datos Symbol
```javascript
var simbolo = Symbol("mi simbolo");
console.log(simbolo);
```
> //Tipo Clases también es una función
```javascript
class Persona {
  constructor(nombre, apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
}
console.log(Persona);
```
> //Tipo de datos undefined
```javascript
var x;
console.log(x)
```
> //null ausencia de valor
```javascript
var y=null;
console.log(y);
```
> //Tipo de datos Arreglo / también es un tipo Object 
```javascript
var autos = ['Chevrolet', 'Audi','Volvo'];
console.log(autos);
```
> //Definir una cadena vacía
```javascript
var x="";
console.log(x)
```


