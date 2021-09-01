public class ColaSimple<T> {

    int MAX;
    int inicio;
    int fin;
    T[] cola;

    ColaSimple() {
        cola = (T[]) new Object[10];
        inicio = -1;
        fin = -1;
        MAX = 10;
    }

    ColaSimple(int size) {
        MAX = size;
        cola = (T[]) new Object[size];
        inicio = -1;
        fin = 0;
    }

    void insertar(T dato) {
        if (fin < MAX) {
            fin += 1;
            cola[fin] = dato;
            if (fin == 1)
                inicio = 0;
        } else
            System.out.println("Desbordamiento");
    }

    T eliminar() {
        T dato = null;
        if (inicio != 0) {
            dato = cola[inicio];

            if (inicio == fin) {
                inicio = 0;
                fin = 0;
            } else {
                inicio += 1;
            }
        } else
            System.out.println("Subdesbordamiento");

        return dato;
    }

    T peek() {
        return cola[0];
    }
}
