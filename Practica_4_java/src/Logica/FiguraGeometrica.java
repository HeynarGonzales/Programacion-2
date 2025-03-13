
package Logica;



public class FiguraGeometrica {

    
    public double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    
    public double calcularArea(double base, double altura, boolean esTriangulo) {
        if (esTriangulo) {
            return (base * altura) / 2;
        }
        return 0;
    }

    
    public double calcularArea(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    
    public double calcularArea(double lado, double apotema, String penta) {
        if (penta=="si") {
           return (5 * lado * apotema) / 2;
        }
           return 0;
       
    }

    public static void main(String[] args) {
        FiguraGeometrica fg = new FiguraGeometrica();

        
        double areaCirculo = fg.calcularArea(5);
        System.out.println("Área del círculo: " + areaCirculo);

        
        double areaRectangulo = fg.calcularArea(4, 6);
        System.out.println("Área del rectángulo: " + areaRectangulo);

        
        double areaTriangulo = fg.calcularArea(4, 6, true);
        System.out.println("Área del triángulo rectángulo: " + areaTriangulo);

        
        double areaTrapecio = fg.calcularArea(8, 4, 5);
        System.out.println("Área del trapecio: " + areaTrapecio);

        
        double areaPentagono = fg.calcularArea(6, 4,"si");
        System.out.println("Área del pentágono: " + areaPentagono);
    }
}
