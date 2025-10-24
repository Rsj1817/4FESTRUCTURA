package ArrayStackActividad;



public class ArrayStack1<T> implements IStack1<T> {

    private Object[] data;
    private int top;

    //contructor vacio 1
    public ArrayStack1(){
        this(10);//invoca al constructor 2

    }

    //contructor 2
    public ArrayStack1(int initialCapacity){
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
    //metodo clear
    @Override
    public void clear() {
        for (int i = 0; i < top; i++) {
            data[i] = null;
        }
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
