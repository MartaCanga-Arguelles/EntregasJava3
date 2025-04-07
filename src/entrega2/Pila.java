package entrega2;

import java.util.*;

class Pila<T> {
    private LinkedList<T> pila;

    public Pila() {
        pila = new LinkedList<>();
    }

    // Añadir elemento a la pila (push)
    public void push(T item) {
        pila.addFirst(item);  // Añadimos el elemento al principio de la lista
    }

    // Desapilar un elemento
    public T pop() {
        if (pila.isEmpty()) {
            throw new NoSuchElementException("La pila está vacía.");
        }
        return pila.removeFirst();  // Eliminamos el primer elemento (el de la parte superior de la pila)
    }

    // Ver el elemento en el tope de la pila sin desapilarlo
    public T peek() {
        if (pila.isEmpty()) {
            throw new NoSuchElementException("La pila está vacía.");
        }
        return pila.getFirst();
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    // Obtener el tamaño de la pila
    public int size() {
        return pila.size();
    }

    // Método toString para ver el contenido de la pila
    @Override
    public String toString() {
        return pila.toString();  // El orden de los elementos es LIFO
    }
}

