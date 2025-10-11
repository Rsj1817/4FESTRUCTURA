/*-
 *Proyecto: 4FESTRUCTURA
 * Creado por: rigob
 */
//
import java.util.ArrayList;
import java.util.List;
/*
public class Worker {

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Sueldo: " + sueldo;
    }

    private int id;
    private String nombre;
    private int sueldo;


    public Worker(int id, String nombre, int sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();

        workers.add(new Worker(1, "Getsai", 1200));
        workers.add(new Worker(2, "Naul", 950));
        workers.add(new Worker(3, "Luis", 1100));
        workers.add(new Worker(4, "Ricardo", 800));
        workers.add(new Worker(5, "Max", 1500));
        workers.add(new Worker(6, "Ana", 1300));

        // Calcular promedio
        int totalSueldo = 0;
        for (Worker worker : workers) {
            totalSueldo += worker.getSueldo();
        }
        double promedio = (double) totalSueldo / workers.size();
        System.out.println("Promedio de Sueldo: " + promedio);

        // sueldos menores a 1000
        workers.removeIf(worker -> worker.getSueldo() < 1000);

        //lista actualizada
        System.out.println("Lista actualizada:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }

}

*/