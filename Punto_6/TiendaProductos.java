package Punto_6;

import java.util.Scanner;

public class TiendaProductos {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú de Inventario ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Buscar producto");
            System.out.println("4. Listar productos por nombre");
            System.out.println("5. Listar productos por precio");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();

                    Producto nuevoProducto = new Producto(codigo, nombre, precio);
                    inventario.agregarProducto(nuevoProducto);
                    System.out.println("Producto agregado.");
                    break;

                case 2:
                    System.out.print("Código del producto a eliminar: ");
                    int codigoEliminar = scanner.nextInt();
                    if (inventario.eliminarProducto(codigoEliminar)) {
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre del producto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    Producto productoEncontrado = inventario.buscarProducto(nombreBuscar);
                    if (productoEncontrado != null) {
                        System.out.println("Producto encontrado: " + productoEncontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Listado ordenado por nombre:");
                    inventario.listarOrdenadosPorNombre();
                    break;

                case 5:
                    System.out.println("Listado ordenado por precio:");
                    inventario.listarOrdenadosPorPrecio();
                    break;

                case 6:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
        scanner.close();
    }
}

