package PracticaExamenU2;

public class SinglyLinkedList<T> {
    static class Node<E> {
        E value;
        Node<E> next;
        Node(E v) { value = v; next = null; }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private ArrayStack<Node<T>> nodeStack;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
        nodeStack = new ArrayStack<>();
    }

    public void addLast(T v) {
        Node<T> n = new Node<>(v);
        if (size == 0) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        nodeStack.push(n);
        size++;
    }

    @SuppressWarnings("unchecked")
    public T removeLast() {
        if (size == 0) return null;
        Node<T> lastNode = nodeStack.pop();
        T val = lastNode.value;
        size--;
        if (size == 0) {
            head = tail = null;
        } else {
            Node<T> newTail = nodeStack.peek();
            tail = newTail;
            tail.next = null;
        }
        return val;
    }

    public boolean isEmpty() { return size == 0; }
    public int size() { return size; }

    public String asStringHeadToTail() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> cur = head;
        while (cur != null) {
            sb.append(cur.value == null ? "null" : cur.value.toString());
            if (cur.next != null) sb.append(" -> ");
            cur = cur.next;
        }
        sb.append("]");
        return sb.toString();
    }
}