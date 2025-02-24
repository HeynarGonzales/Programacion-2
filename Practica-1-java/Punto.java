
package Logica;


  public class Punto {
     public float x;
     public float y;

    // Constructor
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Método para obtener las coordenadas cartesianas
    public String coordCartesianas() {
        return "(" + this.x + ", " + this.y + ")";
    }

    // Método para obtener las coordenadas polares
    public String coordPolares() {
        float r = (float) Math.sqrt(this.x * this.x + this.y * this.y);
        float theta = (float) Math.atan2(this.y, this.x);  // Ángulo en radianes
        return "(" + r + ", " + theta + ")";
    }

    // Método toString
    @Override
    public String toString() {
        return "Punto(" + this.x + ", " + this.y + ")";
    }

   
}