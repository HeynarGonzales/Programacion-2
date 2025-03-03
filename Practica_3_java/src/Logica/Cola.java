
package Logica;


public class Cola {
    private long[] arreglo;  // Arreglo que almacenará los elementos de la cola
    private int inicio;      // Índice que indica el primer elemento de la cola
    private int fin;         // Índice que indica el último elemento de la cola
    private int n;           // Tamaño máximo de la cola

    // Constructor de la clase Cola
    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n]; // Inicializa el arreglo con el tamaño dado
        this.inicio = -1;  // La cola está vacía inicialmente, no hay elementos
        this.fin = -1;     // La cola está vacía inicialmente
    }

    // Método para insertar un elemento en la cola
    public void insert(long e) {
        if (isFull()) {
            System.out.println("La cola está llena. No se puede insertar el elemento.");
        } else {
            if (inicio == -1) {
                inicio = 0; // Si la cola está vacía, el primer elemento se coloca en el índice 0
            }
            fin = (fin + 1) % n;  // Calcula la siguiente posición de fin (uso de módulo para el comportamiento circular)
            arreglo[fin] = e;  // Inserta el elemento en la posición de fin
        }
    }

    // Método para eliminar y devolver el primer elemento de la cola
    public long remove() {
        if (isEmpty()) {
            System.out.println("La cola está vacía. No se puede eliminar un elemento.");
            return -1;  // Valor de error, puedes cambiarlo si lo deseas
        } else {
            long elemento = arreglo[inicio];  // Guarda el primer elemento
            if (inicio == fin) {
                inicio = fin = -1;  // La cola queda vacía
            } else {
                inicio = (inicio + 1) % n;  // Calcula la siguiente posición de inicio
            }
            return elemento;  // Retorna el primer elemento
        }
    }

    // Método para obtener el primer elemento sin eliminarlo
    public long peek() {
        if (isEmpty()) {
            System.out.println("La cola está vacía. No se puede ver el primer elemento.");
            return -1;  // Valor de error, puedes cambiarlo si lo deseas
        } else {
            return arreglo[inicio];  // Retorna el primer elemento sin modificar la cola
        }
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return inicio == -1;  // Si el índice de inicio es -1, la cola está vacía
    }

    // Método para verificar si la cola está llena
    public boolean isFull() {
        return (fin + 1) % n == inicio;  // Si la siguiente posición de fin es igual a inicio, la cola está llena
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        if (isEmpty()) {
            return 0;  // Si la cola está vacía, el tamaño es 0
        } else {
            if (fin >= inicio) {
                return fin - inicio + 1;  // La cola no está circular
            } else {
                return n - inicio + fin + 1;  // La cola es circular
            }
        }
    }
}

