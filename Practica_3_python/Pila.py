class Pila:
    def __init__(self, n):
        self.n = n  # Tamaño máximo de la pila
        self.arreglo = [0] * n  # Inicializa el arreglo con el tamaño dado
        self.top = -1  # La pila está vacía inicialmente

    # Método para agregar un elemento a la pila
    def push(self, e):
        if self.isFull():
            print("La pila está llena. No se puede agregar el elemento.")
        else:
            self.top += 1
            self.arreglo[self.top] = e

    # Método para eliminar el elemento superior de la pila y devolverlo
    def long_pop(self):
        if self.isEmpty():
            print("La pila está vacía. No se puede eliminar un elemento.")
            return -1  # Valor de error
        else:
            valor = self.arreglo[self.top]
            self.top -= 1
            return valor

    # Método para obtener el valor superior de la pila sin eliminarlo
    def long_peek(self):
        if self.isEmpty():
            print("La pila está vacía. No se puede ver el elemento superior.")
            return -1  # Valor de error
        else:
            return self.arreglo[self.top]

    # Método para verificar si la pila está vacía
    def isEmpty(self):
        return self.top == -1  # Si top es -1, la pila está vacía

    # Método para verificar si la pila está llena
    def isFull(self):
        return self.top == self.n - 1  # Si top es igual al tamaño máximo - 1, la pila está llena

# Crear una pila con un tamaño máximo de 5
mi_pila = Pila(5)

# Agregar elementos a la pila
mi_pila.push(10)
mi_pila.push(20)
mi_pila.push(30)
mi_pila.push(40)
mi_pila.push(50)

# Mostrar el elemento superior
print("Elemento superior:", mi_pila.long_peek())

# Eliminar el elemento superior y mostrarlo
print("Elemento eliminado:", mi_pila.long_pop())

mi_pila.push(50)

# Mostrar el nuevo elemento superior después de hacer pop
print("Nuevo elemento superior después de pop:", mi_pila.long_peek())

# Verificar si la pila está vacía o llena
print("¿Está vacía la pila?", mi_pila.isEmpty())
print("¿Está llena la pila?", mi_pila.isFull())
