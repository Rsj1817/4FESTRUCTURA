package ArrayStackActividad;

public interface IStack1 <T> {


    void push(T data);
    T pop();
    T peek();
    void clear();
    int size();
    boolean isEmpty();
    void print();

}
