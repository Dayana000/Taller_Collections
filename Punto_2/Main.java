public class Main {
    public static void main(String[] args) {
        PilaStack pila = new PilaStack();
        pila.push("Dayana");  // Se permite (la pila está vacía)

        pila.push("Buitrago");  // Se permite (mismo tipo)
        pila.push(100.000);  // Error (tipo diferente)

        pila.pop();  

        System.out.println("Insertando un nuevo String:");
        pila.push("Java"); 

        pila.mostrarPila();
    }
}