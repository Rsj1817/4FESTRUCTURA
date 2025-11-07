package PracticaExamenU2;

public class ArrayStack<T> {
    private Object[] data;
    private int size;

    public ArrayStack() { this(8); }

    public ArrayStack(int cap) {
        data = new Object[Math.max(8, cap)];
        size = 0;
    }

    public void push(T x) {
        if (size == data.length) resize(data.length * 2);
        data[size++] = x;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) return null;
        T v = (T) data[--size];
        data[size] = null;
        if (size > 0 && size == data.length / 4) resize(data.length / 2);
        return v;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        return isEmpty() ? null : (T) data[size - 1];
    }

    public boolean isEmpty() { return size == 0; }
    public int size() { return size; }

    private void resize(int newCap) {
        Object[] nd = new Object[newCap];
        for (int i = 0; i < size; i++) nd[i] = data[i];
        data = nd;
    }

    public String asStringBottomToTop() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i] == null ? "null" : data[i].toString());
            if (i < size - 1) sb.append(" -> ");
        }
        sb.append("]");
        return sb.toString();
    }
}