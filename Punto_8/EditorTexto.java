package Punto_8;
 import java.util.Vector;

public class EditorTexto {
    private Vector<String> historialCambios;

    public EditorTexto() {
        historialCambios = new Vector<>();
    }

    public void registrarCambio(String cambio) {
        historialCambios.add(cambio);  // Se añade al final
        System.out.println("Cambio registrado: " + cambio);
    }

    public void deshacerCambio() {
        if (historialCambios.isEmpty()) {
            System.out.println("No hay cambios para deshacer.");
        } else {
            String ultimoCambio = historialCambios.remove(historialCambios.size() - 1);  // Elimina el último
            System.out.println("Se ha deshecho el cambio: " + ultimoCambio);
        }
    }

    public void mostrarHistorial() {
        if (historialCambios.isEmpty()) {
            System.out.println("No hay cambios registrados.");
        } else {
            System.out.println("Historial de cambios:");
            for (String cambio : historialCambios) {
                System.out.println("- " + cambio);
            }
        }
    }

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        editor.registrarCambio("Se agregó la palabra 'Hola'.");
        editor.registrarCambio("Se corrigió 'Hols' por 'Hola'.");
        editor.registrarCambio("Se eliminó 'adiós'.");

        editor.mostrarHistorial();

    
        editor.deshacerCambio();
        editor.mostrarHistorial();

        editor.deshacerCambio();
        editor.mostrarHistorial();

        editor.deshacerCambio();
        editor.deshacerCambio();  
    
    }
}
 
