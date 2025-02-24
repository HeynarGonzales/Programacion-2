
package Logica;

// Clase Circulo
public class Circulo {
    

    private Punto centro;
    private float radio;

    // Constructor
    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    // Método toString
    @Override
    public String toString() {
        return "Círculo con centro en " + centro.toString() + " y radio " + radio;
    }

    // Método para dibujar el círculo
    public void dibujaCirculo() {
        System.out.println("Dibujando un círculo con centro en " + centro.toString() + " y radio " + radio);
    }
}

