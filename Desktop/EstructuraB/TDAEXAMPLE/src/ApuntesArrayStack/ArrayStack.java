package ApuntesArrayStack;

public class ArrayStack<T> implements IStack<T> {

    private Object[] data;
    private int top;

    //contructor vacio 1
    public ArrayStack(){
        this(10);//invoca al constructor 2

    }

    //contructor 2
    public ArrayStack(int initialCapacity){
        this.data = new Object[initialCapacity];
        this.top = 0;
    }

    @Override
    public void push(T element) {
        data[top++] = (T)element;


    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {

        if(isEmpty()){
            System.out.println("La pila esta vacia ");
            return null;
        }
        T value = (T) data[--top];
        data[top] = null;
        return value;

    }

    @Override
    public T peek() {
        if(isEmpty()){
            System.out.println("La pila esta vacia ");
            return null;
        }
        return (T) data[top];
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Unimplemented method 'clear'");

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
        for (int i = top-1; i >= 0; i--) {
            sb.append(data[i]);
            if(i != 0){
                sb.append("->");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}

