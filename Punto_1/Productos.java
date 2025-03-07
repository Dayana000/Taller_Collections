/*Crear la lista de productos en una clase empresa utilizando treeset, se debe realizar
un método que busque un producto por su código. */

package Punto_1;

public class Productos implements Comparable<Productos> {
    private String codigo;
    private String nombre;
    private double precio;

    public Productos(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Productos otro) {
        return this.codigo.compareTo(otro.codigo); // Ordena por código
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

