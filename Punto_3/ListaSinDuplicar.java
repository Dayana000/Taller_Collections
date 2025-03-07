import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListaSinDuplicar {
    public static void main(String[] args) {
        // Crear un HashSet (no permite duplicados)
        Set<String> elementos = new HashSet<>();

        elementos.add("Manzana");
        elementos.add("Banana");
        elementos.add("Pera");
        elementos.add("Manzana");  

        // Usar iterador para recorrer la lista
        System.out.println("Contenido de la lista:");
        Iterator<String> iterador = elementos.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
 
