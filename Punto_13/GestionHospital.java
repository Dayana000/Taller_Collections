package Punto_13;

import java.util.PriorityQueue;
import java.util.Comparator;

class Paciente {
    String nombre;
    int nivelUrgencia;

    public Paciente(String nombre, int nivelUrgencia) {
        this.nombre = nombre;
        this.nivelUrgencia = nivelUrgencia;
    }

    @Override
    public String toString() {
        return nombre + " (Urgencia: " + nivelUrgencia + ")";
    }
}

class ComparadorPorUrgencia implements Comparator<Paciente> {
    @Override
    public int compare(Paciente p1, Paciente p2) {
        return Integer.compare(p1.nivelUrgencia, p2.nivelUrgencia); 
    }
}

public class GestionHospital {

    public static void main(String[] args) {
        PriorityQueue<Paciente> colaPacientes = new PriorityQueue<>(new ComparadorPorUrgencia());

        colaPacientes.add(new Paciente("Carlos", 3));  
        colaPacientes.add(new Paciente("Ana", 1));     
        colaPacientes.add(new Paciente("Beatriz", 4)); 
        colaPacientes.add(new Paciente("David", 2));   

        System.out.println("Atendiendo pacientes según prioridad:");
        while (!colaPacientes.isEmpty()) {
            Paciente siguiente = colaPacientes.poll();  
            System.out.println("Atendiendo a: " + siguiente);
        }
    }
}
