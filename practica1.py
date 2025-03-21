import math

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    
    def coord_cartesianas(self):
        return (self.x, self.y)
    
    def coord_polares(self):
        r = math.sqrt(self.x ** 2 + self.y ** 2)
        theta = math.atan2(self.y, self.x)  # Ángulo en radianes
        return (r, theta)
    
    def __str__(self):
        return f"Punto({self.x}, {self.y})"
    

punto = Punto(3, 4)
print(punto.coord_cartesianas())  
print(punto.coord_polares())      
print(punto)  
