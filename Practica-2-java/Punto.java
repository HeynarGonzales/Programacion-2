
package Logica;

// Clase Punto
public class Punto {

    private float x;
    private float y;

    // Constructor
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Método para obtener las coordenadas cartesianas
    public void coord_cartesianas() {
        System.out.println("Coordenadas Cartesianas: (" + this.x + ", " + this.y + ")");
    }

    // Método para convertir las coordenadas cartesianas a coordenadas polares
    public void coord_polares() {
        double radio = Math.sqrt(x * x + y * y);
        double angulo = Math.atan2(y, x);
        System.out.println("Coordenadas Polares: (" + radio + ", " + Math.toDegrees(angulo) + " grados)");
    }

    // Método toString
    @Override
    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }
}


