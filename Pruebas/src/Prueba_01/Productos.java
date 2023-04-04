package Prueba_01;

public class Productos {

    private int id;
    private String nombreProducto;
    private double precio;
    private int cantidad;

    public Productos() {

    }

    public Productos(int id, String nombreProducto, double precio, int cantidad) {

        setId(id);
        setNombreProducto(nombreProducto);
        setPrecio(precio);
        setCantidad(cantidad);
    }

    public double venderProducto(int cantidad) {
        double precio=0;
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            precio = this.precio * cantidad;
            System.out.println("");
        }else{
            System.out.println("La cantidad ingresada supera el stock");
        }
        return precio;
    }

    public void IngresarProducto(int cantidad) {

        this.cantidad += cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
