package ArrayStackActividad;

public class PrincipalArrayStack {
    public static void main(String[] args) {

        ArrayStack1<Character> stack1 = new ArrayStack1<>();
        stack1.print();
        stack1.push('A');
        stack1.push('B');
        stack1.push('C');
        stack1.pop();
        stack1.print();

    }
}
