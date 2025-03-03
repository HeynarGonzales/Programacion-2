import math

# Clase Punto
class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    # Método para obtener las coordenadas cartesianas
    def coord_cartesianas(self):
        print(f"Coordenadas Cartesianas: ({self.x}, {self.y})")

    # Método para obtener las coordenadas polares
    def coord_polares(self):
        radio = math.sqrt(self.x**2 + self.y**2)
        angulo = math.atan2(self.y, self.x)
        print(f"Coordenadas Polares: ({radio}, {math.degrees(angulo)} grados)")

    # Método toString
    def __str__(self):
        return f"Punto({self.x}, {self.y})"


# Clase Linea
class Linea:
    def __init__(self, p1: Punto, p2: Punto):
        self.p1 = p1
        self.p2 = p2

    # Método toString
    def __str__(self):
        return f"Linea desde {self.p1} hasta {self.p2}"

    # Método para dibujar la línea
    def dibujaLinea(self):
        print(f"Dibujando una línea desde {self.p1} hasta {self.p2}")


# Clase Circulo
class Circulo:
    def __init__(self, centro: Punto, radio: float):
        self.centro = centro
        self.radio = radio

    # Método toString
    def __str__(self):
        return f"Círculo con centro en {self.centro} y radio {self.radio}"

    # Método para dibujar el círculo
    def dibujaCirculo(self):
        print(f"Dibujando un círculo con centro en {self.centro} y radio {self.radio}")


# Clase principal para probar las clases
def main():
    # Crear objetos de la clase Punto
    p1 = Punto(3, 4)
    p2 = Punto(5, 6)

    # Probar la clase Punto
    p1.coord_cartesianas()
    p1.coord_polares()
    print(p1)

    # Crear objetos de la clase Linea
    linea = Linea(p1, p2)
    print(linea)
    linea.dibujaLinea()

    # Crear objetos de la clase Circulo
    circulo = Circulo(p1, 7)
    print(circulo)
    circulo.dibujaCirculo()


# Ejecutar la función principal
if __name__ == "__main__":
    main()
