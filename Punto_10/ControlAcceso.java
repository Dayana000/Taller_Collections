package Punto_10;
import java.util.HashSet;
import java.util.Scanner;

public class ControlAcceso {

    private HashSet<String> idsEmpleados = new HashSet<>();

    public void registrarIngreso(String id) {
        if (idsEmpleados.contains(id)) {
            System.out.println("Acceso denegado: el ID " + id + " ya fue registrado previamente.");
        } else {
            idsEmpleados.add(id);
            System.out.println("Acceso permitido: Bienvenido empleado " + id);
        }
    }

    public void mostrarEmpleadosRegistrados() {
        System.out.println("Empleados que han ingresado: " + idsEmpleados);
    }

    public static void main(String[] args) {
        ControlAcceso control = new ControlAcceso();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el ID del empleado (o 'salir' para terminar): ");
            String id = scanner.nextLine();

            if (id.equalsIgnoreCase("salir")) {
                break;
            }

            control.registrarIngreso(id);
        }

        control.mostrarEmpleadosRegistrados();
        scanner.close();
    }
}
