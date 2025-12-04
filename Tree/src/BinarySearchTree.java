public class BinarySearchTree {
    Node root; // Raiz de nuestro arbol

    public void insert(int value){
        root = insetRecursive(root, value);
    }


    private Node insetRecursive(Node current, int value){
        // caso base, cuando current sea null, en este punto vamos a crear el nodo
        if (current==null) {
            return new Node(value);
        }
        // si el valor a insertar es menor que el valor de current
        // entonces vamos a crear el nodo de lado izquierdo
        if (value< current.value) {
            current.left= insetRecursive(current.left, value);
        }else if (value> current.value) {
            current.right = insetRecursive(current.right, value);
        }

        return current;
    }

    public void printInOrder(){
        System.out.println("--- print in Order ---");
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(Node current){
        if (current != null) {
            // recorrido del lado izquierdo
            printInOrderRecursive(current.left);
            System.out.println(current.value +" ");
            printInOrderRecursive(current.right);
        }
    }

}