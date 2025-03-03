
package Logica;


public class Pila {
    private long[] arreglo;  // Arreglo que almacenará los elementos de la pila
    private int top;         // Índice que indica la posición del último elemento en la pila
    private int n;           // Tamaño máximo de la pila

    // Constructor de la clase Pila
    public Pila(int n) {
        this.n = n;
        this.arreglo = new long[n]; // Inicializa el arreglo con el tamaño dado
        this.top = -1; // La pila está vacía inicialmente, por lo que el índice es -1
    }

    // Método para agregar un elemento a la pila
    public void push(long e) {
        if (isFull()) {
            System.out.println("La pila está llena. No se puede agregar el elemento.");
        } else {
            arreglo[++top] = e;  // Incrementa el índice top y agrega el elemento al arreglo
        }
    }

    // Método para eliminar el elemento superior de la pila y devolverlo
    public long long_pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede eliminar un elemento.");
            return -1;  // Valor de error, puedes cambiarlo si lo deseas
        } else {
            return arreglo[top--];  // Devuelve el valor y decrementa el índice top
        }
    }

    // Método para obtener el valor superior de la pila sin eliminarlo
    public long long_peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede ver el elemento superior.");
            return -1;  // Valor de error, puedes cambiarlo si lo deseas
        } else {
            return arreglo[top];  // Retorna el valor superior sin modificar el índice top
        }
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == -1;  // Si el índice top es -1, la pila está vacía
    }

    // Método para verificar si la pila está llena
    public boolean isFull() {
        return top == n - 1;  // Si el índice top es igual al tamaño máximo - 1, la pila está llena
    }
}
