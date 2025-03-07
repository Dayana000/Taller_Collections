package Punto_17;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AgendaEventos {

    private TreeMap<LocalDate, String> eventos = new TreeMap<>();

    public void agregarEvento(LocalDate fecha, String descripcion) {
        eventos.put(fecha, descripcion);
        System.out.println("Evento agregado para el " + fecha + ": " + descripcion);
    }

    public void mostrarAgenda() {
        System.out.println("\nAgenda de Eventos:");
        for (Map.Entry<LocalDate, String> entry : eventos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void mostrarProximoEvento() {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos programados.");
        } else {
            Map.Entry<LocalDate, String> proximo = eventos.firstEntry();
            System.out.println("\nPróximo evento:");
            System.out.println(proximo.getKey() + " - " + proximo.getValue());
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        Scanner sc = new Scanner(System.in);

        System.out.println("Registro de eventos (escribe 'fin' como fecha para terminar)");

        while (true) {
            System.out.print("Fecha del evento (AAAA-MM-DD o 'fin'): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("fin")) {
                break;
            }

            LocalDate fecha = LocalDate.parse(input);

            System.out.print("Descripción del evento: ");
            String descripcion = sc.nextLine();

            agenda.agregarEvento(fecha, descripcion);
        }

        agenda.mostrarAgenda();
        agenda.mostrarProximoEvento();
        sc.close();
    }
}

