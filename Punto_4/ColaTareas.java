import java.util.PriorityQueue;
import java.util.Queue;

public class ColaTareas {
    public static void main(String[] args) {
        // Crear la cola de prioridades
        Queue<Tarea> colaTareas = new PriorityQueue<>();

        // Agregar tareas con distintas prioridades
        colaTareas.add(new Tarea("Lavar platos", 3));     // Prioridad 3
        colaTareas.add(new Tarea("Entregar informe", 1)); // Prioridad 1 (más urgente)
        colaTareas.add(new Tarea("Pasear al perro", 2));  // Prioridad 2

        // Imprimir y procesar las tareas en orden de prioridad
        System.out.println("Procesando tareas en orden de prioridad:");
        while (!colaTareas.isEmpty()) {
            Tarea tarea = colaTareas.poll();  // Extrae la tarea con mayor prioridad (menor número)
            System.out.println(tarea);
        }
    }
}
