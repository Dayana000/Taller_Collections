package Punto_14;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Historial {
   


    private static final int MAX_MENSAJES = 10;
    private Deque<String> mensajes = new ArrayDeque<>();

    // Método para añadir un mensaje al historial
    public void agregarMensaje(String mensaje) {
        if (mensajes.size() == MAX_MENSAJES) {
            mensajes.removeFirst(); // Elimina el mensaje más antiguo
        }
        mensajes.addLast(mensaje); // Añade el nuevo mensaje al final
    }

    // Mostrar los mensajes actuales (historial)
    public void mostrarHistorial() {
        System.out.println("\nHistorial de los últimos " + mensajes.size() + " mensajes:");
        for (String mensaje : mensajes) {
            System.out.println("- " + mensaje);
        }
    }

    public static void main(String[] args) {
        Historial historial = new Historial();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Escribe un mensaje (o 'salir' para terminar): ");
            String mensaje = scanner.nextLine();

            if (mensaje.equalsIgnoreCase("salir")) {
                break;
            }

            historial.agregarMensaje(mensaje);
            historial.mostrarHistorial();
        }

        scanner.close();
    }
}

