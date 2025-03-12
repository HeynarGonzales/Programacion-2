import math


class Geometria:

    # Función para calcular el área
    def calcular_area(self, *args):
        if len(args) == 1:  # Círculo
            radio = args[0]
            return math.pi * radio * radio  # Área del círculo: π * r^2
        elif len(args) == 2:  # Rectángulo, Triángulo Rectángulo
            base, altura = args
            return base * altura  # Para Rectángulo y Triángulo (base * altura) / 2

        elif len(args) == 3:  # Triángulo Rectángulo
            base, altura, divisor = args
            return (base * altura) / divisor  # Para Rectángulo y Triángulo (base * altura) / 2



        elif len(args) == 4:  # Trapecio
            base_mayor, base_menor, altura, divisor = args
            return ((
                                base_mayor + base_menor) * altura) / 2  # Área del trapecio: ((base mayor + base menor) * altura) / 2
        elif len(args) == 5:  # Pentágono (requiere apotema y perímetro)
            apotema, perimetro, esPoligono, divisor, noPoligono = args
            return (5 * perimetro * apotema) / divisor  # Área del pentágono: (perimetro * apotema) / 2
        else:
            raise ValueError("Número de parámetros incorrecto para calcular el área")


# Crear una instancia de la clase Geometria
geometria = Geometria()

# Calcular el área de un círculo (radio = 5)
print("Área del círculo: ", geometria.calcular_area(5))

# Calcular el área de un rectángulo (base = 4, altura = 6)
print("Área del rectángulo: ", geometria.calcular_area(4, 6))

# Calcular el área de un triángulo rectángulo (catetos = 3 y 4)
print("Área del triángulo rectángulo: ", geometria.calcular_area(4, 6, 2))

# Calcular el área de un trapecio (baseMayor = 6, baseMenor = 4, altura = 5)
print("Área del trapecio: ", geometria.calcular_area(8, 4, 5, 2))

# Calcular el área de un pentágono (apotema = 3, perímetro = 30)
print("Área del pentágono: ", geometria.calcular_area(6, 4, "si", 2, "falso"))
