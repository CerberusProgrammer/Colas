import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        /*
        ColaSImple<String> colaSImple = new ColaSImple<>();
        colaSImple.insertar("a");
        colaSImple.insertar("b");
        colaSImple.insertar("c");
        System.out.println(colaSImple.peek());
        colaSImple.eliminar();
        System.out.println(colaSImple.peek());

        ColaCircular<String> colaCircular = new ColaCircular<>();
        colaCircular.insertar("a");
        colaCircular.insertar("b");
        colaCircular.insertar("c");
        colaCircular.insertar("d");
        System.out.println(colaCircular.mostrar());
        colaCircular.eliminar();
        colaCircular.eliminar();
        System.out.println(colaCircular.mostrar());
         */

        AbstractQueue<String> abstractQueue = new AbstractQueue<String>() {
            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }
        };

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(0);
        priorityQueue.poll();
        System.out.println(priorityQueue.peek());
    }
}



