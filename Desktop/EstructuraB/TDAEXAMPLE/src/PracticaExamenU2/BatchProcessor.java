package PracticaExamenU2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BatchProcessor {

    public static void main(String[] args) throws IOException {
        ArrayQueue<Job> queue = new ArrayQueue<>();
        ArrayStack<Job> stack = new ArrayStack<>();
        SinglyLinkedList<Job> log = new SinglyLinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        boolean finished = false;

        while (!finished && (line = br.readLine()) != null) {
            if (line.trim().isEmpty()) continue;

            String normalized = line.trim();
            String[] parts = normalized.split("\\s+");
            String cmd = parts[0].toUpperCase();

            switch (cmd) {
                case "ADD":
                    if (parts.length < 2) {
                        System.out.println("Falta ID de trabajo");
                    } else {
                        String id = normalized.substring(normalized.indexOf(' ') + 1).trim();
                        if (id.isEmpty()) {
                            System.out.println("Falta ID de trabajo");
                        } else {
                            queue.enqueue(new Job(id));
                        }
                    }
                    break;

                case "PROCESS":
                    if (parts.length < 2) {
                        System.out.println("Número inválido en PROCESS");
                    } else {
                        try {
                            int n = Integer.parseInt(parts[1]);
                            if (n < 0) {
                                System.out.println("Número inválido en PROCESS");
                            } else {
                                int processed = 0;
                                while (processed < n && !queue.isEmpty()) {
                                    Job j = queue.dequeue();
                                    stack.push(j);
                                    processed++;
                                }
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("Número inválido en PROCESS");
                        }
                    }
                    break;

                case "COMMIT":
                    while (!stack.isEmpty()) {
                        Job j = stack.pop();
                        log.addLast(j);
                    }
                    break;

                case "ROLLBACK":
                    if (parts.length < 2) {
                        System.out.println("Número inválido en ROLLBACK");
                    } else {
                        try {
                            int m = Integer.parseInt(parts[1]);
                            if (m < 0) {
                                System.out.println("Número inválido en ROLLBACK");
                            } else {
                                int toRevert = Math.min(m, log.size());
                                Job[] removed = new Job[toRevert];
                                int count = 0;
                                while (count < toRevert && !log.isEmpty()) {
                                    Job r = log.removeLast();
                                    removed[count++] = r;
                                }
                                // reinsertar al frente de la cola preservando el orden de revertidos
                                for (int i = count - 1; i >= 0; i--) {
                                    queue.enqueueFront(removed[i]);
                                }
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("Número inválido en ROLLBACK");
                        }
                    }
                    break;

                case "PRINT":
                    printStatus(queue, stack, log);
                    break;

                case "END":
                    finished = true;
                    System.out.println("=== ESTADO FINAL ===");
                    printStatus(queue, stack, log);
                    break;

                default:
                    System.out.println("Comando inválido: " + line);
                    break;
            }
        }
    }

    private static void printStatus(ArrayQueue<Job> q, ArrayStack<Job> s, SinglyLinkedList<Job> l) {
        System.out.println("QUEUE (pendientes): " + q.asStringFrontToRear());
        System.out.println("STACK (procesando): " + s.asStringBottomToTop());
        System.out.println("BITÁCORA (confirmados): " + l.asStringHeadToTail());
    }
}