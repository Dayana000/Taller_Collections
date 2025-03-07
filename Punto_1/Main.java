package Punto_1;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.agregarProducto(new Productos("P001", "Laptop", 1500.0));
        empresa.agregarProducto(new Productos("P002", "Teléfono", 800.0));
        empresa.agregarProducto(new Productos("P003", "Tablet", 500.0));
       
        System.out.println("Lista de productos:");
        empresa.mostrarProductos();

        System.out.println("\nBuscando producto con código 'P001':");
        Productos encontrado = empresa.buscarProductoPorCodigo("P002");

        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}

