package entrega2;

import java.util.*;
import java.util.stream.Collectors;

public class ColaPrioridad<T> {
    private PriorityQueue<PriorityElement<T>> queue;

    public ColaPrioridad() {
        // Priority queue que usa PriorityElement para ordenar por prioridad
        queue = new PriorityQueue<>(Comparator.comparingInt(PriorityElement::getPriority));
    }

    // Método para agregar un elemento con su prioridad
    public void enqueue(T value, int priority) {
        queue.offer(new PriorityElement<>(value, priority));
    }

    // Método para cambiar la prioridad de un elemento
    public void changePriority(T value, int newPriority) {
        PriorityElement<T> elementToChange = null;
        for (PriorityElement<T> element : queue) {
            if (element.getValue().equals(value)) {
                elementToChange = element;
                break;
            }
        }
        if (elementToChange != null) {
            queue.remove(elementToChange);
            enqueue(value, newPriority);  // Añadir de nuevo con la nueva prioridad
        }
    }

    // Método para desencolar el elemento con la más alta prioridad
    public T dequeue() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("No se puede eliminar de un agregado vacío.");
        }
        return queue.poll().getValue();
    }

    // Método para obtener todos los elementos de la cola con su prioridad
    public List<PriorityElement<T>> getElements() {
        return new ArrayList<>(queue);
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return queue.size();
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return getElements().stream()
                .map(pe -> pe.getValue().toString())
                .collect(Collectors.toList())
                .toString();
    }

    // Clase interna para representar un elemento con su prioridad
    static class PriorityElement<T> {
        private T value;
        private int priority;

        public PriorityElement(T value, int priority) {
            this.value = value;
            this.priority = priority;
        }

        public T getValue() {
            return value;
        }

        public int getPriority() {
            return priority;
        }

        @Override
        public String toString() {
            return "PriorityElement[value=" + value + ", priority=" + priority + "]";
        }
    }

    // Método addAll modificado para aceptar un array de valores
    public void addAll(T[] values, int priority) {
        for (T value : values) {
            enqueue(value, priority);
        }
    }
}
