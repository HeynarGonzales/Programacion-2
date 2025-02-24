
package Logica;

// Clase Linea
public class Linea {
    

    private Punto p1;
    private Punto p2;

    // Constructor
    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Método toString
    @Override
    public String toString() {
        return "Linea desde " + p1.toString() + " hasta " + p2.toString();
    }

    // Método para dibujar la línea
    public void dibujaLinea() {
        System.out.println("Dibujando una línea desde " + p1.toString() + " hasta " + p2.toString());
    }
}

