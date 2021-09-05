public class ColaSImple<T> {
    private int max;
    private T[] cola;
    private int inicio;
    private int fin;

    public ColaSImple() {
        this.max = 100;
        this.inicio = 0;
        this.fin = 0;
        this.cola = (T[]) new Object[this.max +1];
    }

    public ColaSImple(int max) {
        this.max = max;
        this.inicio = 0;
        this.fin = 0;
        this.cola = (T[]) new Object[this.max +1];
    }

    public boolean colaLlena() {
        return this.fin == this.max;
    }

    public boolean colaVacia() {
        return this.inicio == this.fin;
    }

    public void insertar(T data) {
        if (fin < max) {
            cola[fin] = data;
            fin++;

            if (fin == 0) {
                inicio = 0;
            }
        } else
            System.out.println("desbordamiento");
    }

    public T eliminar() {
        T dato = null;
        if (inicio != -1) {
            dato = cola[inicio];

            if (inicio == fin) {
                inicio = -1;
                fin = -1;
            } else
                inicio++;
        } else
            System.out.println("Subdesbordamiento");

        return dato;
    }

    public T peek() {
        return cola[inicio];
    }
}
