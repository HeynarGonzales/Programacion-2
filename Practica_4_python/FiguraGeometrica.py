import math


class Geometria:

    
    def calcular_area(self, *args):
        if len(args) == 1:  
            radio = args[0]
            return math.pi * radio * radio  
        elif len(args) == 2:  
            base, altura = args
            return base * altura  

        elif len(args) == 3:  
            base, altura, divisor = args
            return (base * altura) / divisor  



        elif len(args) == 4:  
            base_mayor, base_menor, altura, divisor = args
            return ((
                                base_mayor + base_menor) * altura) / 2  
        elif len(args) == 5:  
            apotema, perimetro, esPoligono, divisor, noPoligono = args
            return (5 * perimetro * apotema) / divisor 
        else:
            raise ValueError("Número de parámetros incorrecto para calcular el área")



geometria = Geometria()


print("Área del círculo: ", geometria.calcular_area(5))


print("Área del rectángulo: ", geometria.calcular_area(4, 6))


print("Área del triángulo rectángulo: ", geometria.calcular_area(4, 6, 2))


print("Área del trapecio: ", geometria.calcular_area(8, 4, 5, 2))


print("Área del pentágono: ", geometria.calcular_area(6, 4, "si", 2, "falso"))
