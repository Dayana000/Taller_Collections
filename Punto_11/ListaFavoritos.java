package Punto_11;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ListaFavoritos {


    private LinkedHashSet<String> cancionesFavoritas = new LinkedHashSet<>();

    public void agregarFavorito(String cancion) {
        if (cancionesFavoritas.contains(cancion)) {
            System.out.println("La canción '" + cancion + "' ya está en favoritos.");
        } else {
            cancionesFavoritas.add(cancion);
            System.out.println("Canción añadida a favoritos: " + cancion);
        }
    }

    public void mostrarFavoritos() {
        System.out.println("Tus canciones favoritas:");
        for (String cancion : cancionesFavoritas) {
            System.out.println("- " + cancion);
        }
    }

    public static void main(String[] args) {
        ListaFavoritos appMusica = new ListaFavoritos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Añadir canción a favoritos (o 'salir' para terminar): ");
            String cancion = scanner.nextLine();

            if (cancion.equalsIgnoreCase("salir")) {
                break;
            }

            appMusica.agregarFavorito(cancion);
        }

        appMusica.mostrarFavoritos();
        scanner.close();
    }
}

