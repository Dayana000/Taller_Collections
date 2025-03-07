package Punto_12;
import java.util.Scanner;
import java.util.TreeSet;
public class OrdenNombres {


    private TreeSet<String> nombresEstudiantes = new TreeSet<>();

    public void agregarEstudiante(String nombre) {
        if (nombresEstudiantes.add(nombre)) {
            System.out.println("Estudiante añadido: " + nombre);
        } else {
            System.out.println("El estudiante '" + nombre + "' ya está registrado.");
        }
    }


    public void mostrarEstudiantes() {
        System.out.println("\nLista de estudiantes (orden alfabético):");
        for (String nombre : nombresEstudiantes) {
            System.out.println("- " + nombre);
        }
    }

    public void mostrarPrimerYUltimo() {
        if (nombresEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\nPrimer estudiante (alfabéticamente): " + nombresEstudiantes.first());
            System.out.println("Último estudiante (alfabéticamente): " + nombresEstudiantes.last());
        }
    }

    public static void main(String[] args) {
        OrdenNombres registro = new OrdenNombres();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el nombre del estudiante (o 'salir' para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            registro.agregarEstudiante(nombre);
        }

        registro.mostrarEstudiantes();
        registro.mostrarPrimerYUltimo();
        scanner.close();
    }
}
