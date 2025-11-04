package EjercicioDePractica1Stack;

public class RunPracticaStack {

    public static void main(String[] args) throws Exception {
        String ana = "Anita lava la tina";
        String mensaje = "Hola";

        System.out.println("\"" + ana + "\" -> " + isPalindrome(ana));
        System.out.println("\"" + mensaje + "\" -> " + isPalindrome(mensaje));
    }
    public static boolean isPalindrome(String text) {
        ArrayStack<Character> stack = new ArrayStack<>();
        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                char lower = Character.toLowerCase(c);
                cleaned.append(lower);
                stack.push(lower);
            }
        }
        for (int i = 0; i < cleaned.length(); i++) {
            char fromText = cleaned.charAt(i);
            Character fromStack = stack.pop();
            if (fromStack == null || fromText != fromStack.charValue()) {
                return false;
            }
        }
        return true;
    }

}
