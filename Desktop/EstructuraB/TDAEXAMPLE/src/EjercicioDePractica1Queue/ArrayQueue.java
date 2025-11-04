package EjercicioDePractica1Queue;

public class ArrayQueue<T> implements IQueue<T> {
    private Object[] data;
    private int rear;
    private int front;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public ArrayQueue() {
        this.data = new Object[INITIAL_CAPACITY];
        this.rear = 0;
        this.front = 0;
        this.size = 0;
    }

    @Override
    public void offer(T element) {
        expandCapacity();
        data[rear] = element;
        rear = (rear + 1) % data.length;
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T poll() {
        if (isEmpty()) {
            System.out.println("La Queue esta vacia");
            return null;
        }
        T result = (T) data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("La Queue esta vacia");
            return null;
        }
        return (T) data[front];
    }

    @Override
    public void clear() {
        data = new Object[INITIAL_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

    private void expandCapacity() {
        if (size < data.length) return;
        Object[] newArr = new Object[data.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = data[(front + i) % data.length];
        }
        front = 0;
        data = newArr;
        rear = size;
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[(front + i) % data.length]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    public ArrayQueue<T> reverse() {
        ArrayQueue<T> reversed = new ArrayQueue<>();
        reverseHelper(reversed);
        return reversed;
    }

    private void reverseHelper(ArrayQueue<T> reversed) {
        if (isEmpty()) {
            return;
        }
        T element = poll();
        reverseHelper(reversed);
        reversed.offer(element);
    }
}