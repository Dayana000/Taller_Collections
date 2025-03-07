package Punto_7;

import java.util.LinkedList;
import java.util.Scanner;

public class SistemaTurnosBanco {
    private LinkedList<String> colaClientes;

    public SistemaTurnosBanco() {
        colaClientes = new LinkedList<>();
    }

    // 1️⃣ Agregar cliente a la cola
    public void agregarCliente(String nombre) {
        colaClientes.addLast(nombre);  // Se agrega al final (como una cola normal)
        System.out.println(nombre + " ha sido agregado a la cola.");
    }

    // 2️⃣ Atender al primer cliente
    public void atenderCliente() {
        if (colaClientes.isEmpty()) {
            System.out.println("No hay clientes en espera.");
        } else {
            String atendido = colaClientes.removeFirst();  // Se atiende al primero
            System.out.println("Atendiendo a: " + atendido);
        }
    }

    // 3️⃣ Funcionalidad especial: mostrar próximo cliente
    public void mostrarProximoCliente() {
        if (colaClientes.isEmpty()) {
            System.out.println("No hay clientes en espera.");
        } else {
            System.out.println("Próximo cliente: " + colaClientes.getFirst());
        }
    }

    // 4️⃣ Mostrar todos los clientes en espera
    public void mostrarCola() {
        if (colaClientes.isEmpty()) {
            System.out.println("No hay clientes en espera.");
        } else {
            System.out.println("Clientes en espera: " + colaClientes);
        }
    }

    // Main para probar el sistema
    public static void main(String[] args) {
        SistemaTurnosBanco sistema = new SistemaTurnosBanco();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Sistema de Turnos ---");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver próximo cliente");
            System.out.println("4. Mostrar todos los clientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    sistema.agregarCliente(nombre);
                    break;
                case 2:
                    sistema.atenderCliente();
                    break;
                case 3:
                    sistema.mostrarProximoCliente();
                    break;
                case 4:
                    sistema.mostrarCola();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        }

        scanner.close();
    }
}
