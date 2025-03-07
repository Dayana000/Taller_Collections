package Punto_6;

import java.util.*;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public boolean eliminarProducto(int codigo) {
        return productos.removeIf(p -> p.getCodigo() == codigo);
    }

    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public void listarOrdenadosPorNombre() {
        productos.sort(Comparator.comparing(Producto::getNombre));
        mostrarProductos();
    }

    public void listarOrdenadosPorPrecio() {
        productos.sort(Comparator.comparingDouble(Producto::getPrecio));
        mostrarProductos();
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
