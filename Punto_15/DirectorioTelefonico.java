package Punto_15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DirectorioTelefonico {
    private Map<String, String> directorio = new HashMap<>();

    public void agregarContacto(String nombre, String telefono) {
        if (directorio.containsKey(nombre)) {
            System.out.println("El contacto '" + nombre + "' ya existe con el número: " + directorio.get(nombre));
        } else {
            directorio.put(nombre, telefono);
            System.out.println("Contacto agregado: " + nombre + " - " + telefono);
        }
    }

    public void buscarContacto(String nombre) {
        if (directorio.containsKey(nombre)) {
            System.out.println("Teléfono de " + nombre + ": " + directorio.get(nombre));
        } else {
            System.out.println("Contacto '" + nombre + "' no encontrado.");
        }
    }

    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Opciones: 1) Agregar 2) Buscar 3) Salir: ");
            int opcion = sc.nextInt();
            sc.nextLine();  // Consumir salto de línea

            if (opcion == 3) break;

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            if (opcion == 1) {
                System.out.print("Teléfono: ");
                String telefono = sc.nextLine();
                directorio.agregarContacto(nombre, telefono);
            } else if (opcion == 2) {
                directorio.buscarContacto(nombre);
            }
        }
        sc.close();
    }
}
