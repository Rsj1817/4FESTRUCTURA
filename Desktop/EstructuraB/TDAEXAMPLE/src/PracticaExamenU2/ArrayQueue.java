package PracticaExamenU2;

public class ArrayQueue<T> {
    private Object[] data;
    private int head;
    private int tail;
    private int size;

    public ArrayQueue() { this(8); }

    public ArrayQueue(int initialCapacity) {
        data = new Object[Math.max(8, initialCapacity)];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(T item) {
        ensureCapacityForAdd();
        data[tail] = item;
        tail = (tail + 1) % data.length;
        size++;
    }

    public void enqueueFront(T item) {
        ensureCapacityForAdd();
        head = (head - 1 + data.length) % data.length;
        data[head] = item;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) return null;
        T item = (T) data[head];
        data[head] = null;
        head = (head + 1) % data.length;
        size--;
        return item;
    }

    public boolean isEmpty() { return size == 0; }
    public int size() { return size; }

    private void ensureCapacityForAdd() {
        if (size == data.length) {
            int newCap = data.length * 2;
            Object[] nd = new Object[newCap];
            for (int i = 0; i < size; i++) nd[i] = data[(head + i) % data.length];
            data = nd;
            head = 0;
            tail = size;
        }
    }

    public String asStringFrontToRear() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            Object o = data[(head + i) % data.length];
            sb.append(o == null ? "null" : o.toString());
            if (i < size - 1) sb.append(" -> ");
        }
        sb.append("]");
        return sb.toString();
    }
}