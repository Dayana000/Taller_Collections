package Punto_16;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class RegistroProductos {
 


    private LinkedHashMap<String, Double> productos = new LinkedHashMap<>();

    // Agregar producto al carrito
    public void agregarProducto(String nombre, double precio) {
        productos.put(nombre, precio);
        System.out.println("Producto agregado: " + nombre + " - $" + precio);
    }

    // Mostrar la factura final
    public void mostrarFactura() {
        System.out.println("\nFactura final:");
        double total = 0;

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.printf("- %-20s $%.2f\n", entry.getKey(), entry.getValue());
            total += entry.getValue();
        }

        System.out.printf("\nTotal a pagar: $%.2f\n", total);
    }

    public static void main(String[] args) {
        RegistroProductos registro = new RegistroProductos();
        Scanner sc = new Scanner(System.in);

        System.out.println("Registro de productos en el supermercado (escribe 'fin' para terminar)");

        while (true) {
            System.out.print("Nombre del producto: ");
            String nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Precio del producto: ");
            double precio = sc.nextDouble();
            sc.nextLine();  // Consumir el salto de línea

            registro.agregarProducto(nombre, precio);
        }

        registro.mostrarFactura();
        sc.close();
    }
}

