package entrega2;

import java.util.*;

class ListaOrdenadaSinRepeticion<T extends Comparable<T>> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void add(T value) {
        if (!elementos.contains(value)) {
            elementos.add(value);
            Collections.sort(elementos);
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < elementos.size()) {
            elementos.remove(index);
        }
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }

    public void clear() {
        elementos.clear();
    }

    @Override
    public String toString() {
        return elementos.toString();
    }

    public void addAll(T[] values) {
        for (T value : values) {
            add(value);
        }
    }
}
