package entrega2;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Cola<T> {

    private LinkedList<T> elementos = new LinkedList<>();

    public void enqueue(T elemento) {
        elementos.addLast(elemento);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("No se puede eliminar de un agregado vacío.");
        }
        return elementos.removeFirst();
    }

    public int size() {
        return elementos.size();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}

