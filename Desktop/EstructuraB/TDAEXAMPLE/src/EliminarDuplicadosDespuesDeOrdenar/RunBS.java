package EliminarDuplicadosDespuesDeOrdenar;

public class RunBS {
    public static void main(String[] args) {

        int[] numeros = {4, 2, 9, 2, 4, 7, 1};

        BubbleSort bs = new BubbleSort();

        bs.imprimirArreglo("Arreglo original:", numeros);
        bs.sort(numeros);

        bs.imprimirArreglo("Arreglo ordenado:", numeros);

        int[] sinDuplicados = bs.eliminarDuplicados(numeros);

        bs.imprimirArreglo("Arreglo ordenado (con duplicados):", numeros);
        bs.imprimirArreglo("Arreglo sin duplicados:", sinDuplicados);
    }
}
