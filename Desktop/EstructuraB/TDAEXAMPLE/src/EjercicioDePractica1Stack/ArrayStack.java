package EjercicioDePractica1Stack;

public class ArrayStack<T> implements IStack<T> {
    private Object[] data;
    private int top;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int initialCapacity) {
        this.data = new Object[initialCapacity];
        this.top = 0;
    }

    @Override
    public void push(T element) {
        if (top >= data.length) {
            Object[] newArr = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) newArr[i] = data[i];
            data = newArr;
        }
        data[top++] = element;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            return null;
        }
        T value = (T) data[--top];
        data[top] = null;
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Lista vacia");
            return null;
        }
        return (T) data[top - 1];
    }

    @Override
    public void clear() {
        for (int i = 0; i < top; i++) data[i] = null;
        top = 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = top - 1; i >= 0; i--) {
            sb.append(data[i]);
            if (i != 0) sb.append("->");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}