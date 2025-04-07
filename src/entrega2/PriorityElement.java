package entrega2;

class PriorityElement<T> {
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

