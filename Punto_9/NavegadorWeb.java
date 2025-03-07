package Punto_9;

    import java.util.Stack;

public class NavegadorWeb {

    private Stack<String> historial = new Stack<>();

    public void visitarPagina(String url) {
        historial.push(url);
        System.out.println("Visitando: " + url);
    }


    public void retroceder() {
        if (historial.size() > 1) {
            historial.pop(); 
            String paginaAnterior = historial.peek();
            System.out.println("Retrocediendo a: " + paginaAnterior);
        } else {
            System.out.println("No hay páginas anteriores");
        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial actual: " + historial);
    }

    public static void main(String[] args) {
        NavegadorWeb navegador = new NavegadorWeb();

        navegador.visitarPagina("pagina1.com");
        navegador.visitarPagina("pagina2.com");
        navegador.visitarPagina("pagina3.com");

        navegador.mostrarHistorial();  

        navegador.retroceder();
        navegador.mostrarHistorial();

        navegador.retroceder();
        navegador.mostrarHistorial();

        navegador.retroceder();  
    }
}

