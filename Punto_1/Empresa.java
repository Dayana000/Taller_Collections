package Punto_1;

import java.util.TreeSet;

public class Empresa {
    // Aquí está la lista de productos (un TreeSet)
    private TreeSet<Productos> productos;

    public Empresa() {
        this.productos = new TreeSet<>();
    }

    // Método para agregar producto
    public void agregarProducto(Productos producto) {
        productos.add(producto);
    }

    // Método para buscar producto por código
    public Productos buscarProductoPorCodigo(String codigo) {
        for (Productos producto : productos) {
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                return producto;
            }
        }
        return null; // No encontrado
    }

    // Mostrar todos los productos
    public void mostrarProductos() {
        for (Productos producto : productos) {
            System.out.println(producto);
        }
    }
}
