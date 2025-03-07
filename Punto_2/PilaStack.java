import java.util.Stack;

public class PilaStack {
    private Stack<Object> pila;

    public PilaStack() {
        pila = new Stack<>();
    }

    // Método para agregar elemento solo si coincide el tipo con el de la cima
    public boolean push(Object elemento) {
        if (pila.isEmpty()) {
            pila.push(elemento);
            return true; // Acepta cualquier tipo si está vacía
        } else {
            Object cima = pila.peek();
            if (cima.getClass().equals(elemento.getClass())) {
                pila.push(elemento);
                return true; // Lo acepta porque es del mismo tipo
            } else {
                System.out.println("Error: No se puede insertar un " + elemento.getClass().getSimpleName() +
                        " porque la pila tiene un " + cima.getClass().getSimpleName());
                return false; // Rechaza si es diferente tipo
            }
        }
    }

    // Método para retirar elemento (normal, sin restricciones)
    public Object pop() {
        if (!pila.isEmpty()) {
            return pila.pop();
        } else {
            System.out.println("La pila está vacía");
            return null;
        }
    }

    // Ver el elemento en la cima
    public Object peek() {
        if (!pila.isEmpty()) {
            return pila.peek();
        } else {
            System.out.println("La pila está vacía");
            return null;
        }
    }

    // Mostrar la pila completa (para ver qué hay dentro)
    public void mostrarPila() {
        System.out.println("Contenido de la pila: " + pila);
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }
}
