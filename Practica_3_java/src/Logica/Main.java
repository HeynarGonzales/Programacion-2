
package Logica;


public class Main {
   public static void main(String[] args) {
    Pila miPila = new Pila(5);  // Crea una pila con tamaño máximo 5
        miPila.push(1);
        miPila.push(2);
        miPila.push(3);
        miPila.push(4);
        miPila.push(5);

        System.out.println("Elemento superior: " + miPila.long_peek()); // Muestra el elemento superior
        System.out.println("Elemento eliminado: " + miPila.long_pop()); // Elimina y muestra el elemento superior
        
        //Agregar elemento a la pila
        miPila.push(5);
        //Mostar la pila 
        System.out.println("Elemento superior después de pop: " + miPila.long_peek());
        System.out.println("¿Está vacía la pila? " + miPila.isEmpty());
        System.out.println("¿Está llena la pila? " + miPila.isFull());
        
        
        //Cola
        System.out.println("---------------------------------------------------------");
        
   
        Cola miCola = new Cola(5);  // Crea una cola con tamaño máximo 5

        miCola.insert(10);
        miCola.insert(20);
        miCola.insert(30);

        System.out.println("Elemento al frente: " + miCola.peek()); // Muestra el primer elemento
        System.out.println("Elemento eliminado: " + miCola.remove()); // Elimina y muestra el primer elemento

        System.out.println("Elemento al frente después de remove: " + miCola.peek());
        System.out.println("¿Está vacía la cola? " + miCola.isEmpty());
        System.out.println("¿Está llena la cola? " + miCola.isFull());
        System.out.println("Tamaño de la cola: " + miCola.size());
    }
}

    

