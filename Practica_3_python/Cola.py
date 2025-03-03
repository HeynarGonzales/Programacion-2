class Cola:
    def __init__(self, n):
        self.n = n  # Tamaño máximo de la cola
        self.arreglo = [0] * n  # Inicializa el arreglo con el tamaño dado
        self.inicio = -1  # El primer índice de la cola
        self.fin = -1  # El último índice de la cola

    # Método para insertar un elemento en la cola
    def insert(self, e):
        if self.isFull():
            print("La cola está llena. No se puede insertar el elemento.")
        else:
            if self.inicio == -1:  # Si la cola está vacía
                self.inicio = 0
            self.fin = (self.fin + 1) % self.n  # Comportamiento circular
            self.arreglo[self.fin] = e

    # Método para eliminar y devolver el primer elemento de la cola
    def long_remove(self):
        if self.isEmpty():
            print("La cola está vacía. No se puede eliminar un elemento.")
            return -1  # Valor de error
        else:
            valor = self.arreglo[self.inicio]
            if self.inicio == self.fin:  # Si hay un solo elemento
                self.inicio = self.fin = -1  # La cola queda vacía
            else:
                self.inicio = (self.inicio + 1) % self.n  # Comportamiento circular
            return valor

    # Método para obtener el primer elemento de la cola sin eliminarlo
    def long_peek(self):
        if self.isEmpty():
            print("La cola está vacía. No se puede ver el primer elemento.")
            return -1  # Valor de error
        else:
            return self.arreglo[self.inicio]

    # Método para verificar si la cola está vacía
    def isEmpty(self):
        return self.inicio == -1  # Si inicio es -1, la cola está vacía

    # Método para verificar si la cola está llena
    def isFull(self):
        return (self.fin + 1) % self.n == self.inicio  # Si la siguiente posición de fin es igual a inicio, la cola está llena

    # Método para obtener el tamaño de la cola
    def size(self):
        if self.isEmpty():
            return 0  # Si la cola está vacía, el tamaño es 0
        elif self.fin >= self.inicio:
            return self.fin - self.inicio + 1  # Si no hay envolvimiento circular
        else:
            return self.n - self.inicio + self.fin + 1  # Si la cola está circular


# Crear una cola con un tamaño máximo de 5
mi_cola = Cola(5)

# Insertar elementos en la cola
mi_cola.insert(1)
mi_cola.insert(2)
mi_cola.insert(3)
mi_cola.insert(4)
mi_cola.insert(5)
# Mostrar el primer elemento
print("Elemento al frente:", mi_cola.long_peek())

# Eliminar y mostrar el primer elemento
print("Elemento eliminado:", mi_cola.long_remove())

# Llenar la cola
mi_cola.insert(1)

# Mostrar el nuevo primer elemento después de hacer pop
print("Nuevo elemento al frente después de remove:", mi_cola.long_peek())

# Verificar si la cola está vacía o llena
print("¿Está vacía la cola?", mi_cola.isEmpty())
print("¿Está llena la cola?", mi_cola.isFull())

# Mostrar el tamaño de la cola
print("Tamaño de la cola:", mi_cola.size())
