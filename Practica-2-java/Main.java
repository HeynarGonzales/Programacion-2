
package Logica;

 // Clase principal para probar las clases
public class Main {

    public static void main(String[] args) {
        // Crear objetos de la clase Punto
        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(5, 6);

        // Probar la clase Punto
        p1.coord_cartesianas();
        p1.coord_polares();
        System.out.println(p1);

        // Crear objetos de la clase Linea
        Linea linea = new Linea(p1, p2);
        System.out.println(linea);
        linea.dibujaLinea();

        // Crear objetos de la clase Circulo
        Circulo circulo = new Circulo(p1, 7);
        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}

