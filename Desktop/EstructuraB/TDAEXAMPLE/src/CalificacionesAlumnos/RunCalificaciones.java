package CalificacionesAlumnos;

import java.util.Scanner;

public class RunCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones deseas registrar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        

        String[] nombres = new String[cantidad];
        double[] calificaciones = new double[cantidad];
        

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre del alumno: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Calificación: ");
            calificaciones[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        

        for (int i = 0; i < cantidad - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < cantidad; j++) {
                if (calificaciones[j] < calificaciones[minIndex]) {
                    minIndex = j;
                }
            }
            

            double tempCalif = calificaciones[minIndex];
            calificaciones[minIndex] = calificaciones[i];
            calificaciones[i] = tempCalif;

            String tempNombre = nombres[minIndex];
            nombres[minIndex] = nombres[i];
            nombres[i] = tempNombre;
        }
        

        System.out.println("\nResultados ordenados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(calificaciones[i] + " - " + nombres[i]);
        }
        
        scanner.close();
    }
}
