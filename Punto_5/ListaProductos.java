package Punto_5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ListaProductos {

    public static void main(String[] args) {
      
        HashMap<Integer, String> productosHashMap = new HashMap<>();
        productosHashMap.put(1, "Laptop");
        productosHashMap.put(3, "Mouse");
        productosHashMap.put(2, "Teclado");
        productosHashMap.put(5, "Monitor");
        productosHashMap.put(4, "Impresora");

        LinkedHashMap<Integer, String> productosLinkedHashMap = new LinkedHashMap<>();
        productosLinkedHashMap.put(1, "Laptop");
        productosLinkedHashMap.put(3, "Mouse");
        productosLinkedHashMap.put(2, "Teclado");
        productosLinkedHashMap.put(5, "Monitor");
        productosLinkedHashMap.put(4, "Impresora");

        TreeMap<Integer, String> productosTreeMap = new TreeMap<>();
        productosTreeMap.put(1, "Laptop");
        productosTreeMap.put(3, "Mouse");
        productosTreeMap.put(2, "Teclado");
        productosTreeMap.put(5, "Monitor");
        productosTreeMap.put(4, "Impresora");

        System.out.println("HashMap: " + productosHashMap);
        System.out.println("LinkedHashMap: " + productosLinkedHashMap);
        System.out.println("TreeMap: " + productosTreeMap);
    }
}


