public class ColaCircular<T> {

    private final int max;
    private final T[] cola;
    private int inicio;
    private int fin;

    public ColaCircular() {
        this.max = 100;
        this.inicio = -1;
        this.fin = -1;
        this.cola = (T[]) new Object[this.max +1];
    }

    public ColaCircular(int max) {
        this.max = max;
        this.inicio = -1;
        this.fin = -1;
        this.cola = (T[]) new Object[this.max +1];
    }

    public void insertar(T dato) {
        if((fin == max-1 && inicio==0) || (fin + 1 == inicio))
            return;
        if(fin == max - 1 && inicio != 0)
            fin = 0;
        else
            fin++;

        cola[fin] = dato;

        if(inicio == -1)
            inicio = 0;
    }

    public T eliminar() {
        T dato = null;

        if(inicio ==- 1)
            return null;

        dato = cola[inicio];

        if(inicio == fin) {
            inicio=-1;
            fin=-1;
        }
        if(inicio == max)
            inicio=0;
        else
            inicio++;
        return dato;
    }

    public String mostrar() {
        int i = 0;
        StringBuilder s = new StringBuilder();

        if (inicio == -1)
            return "";
        else {
            i = inicio;
            do {
                s.append(" ").append(cola[i]);
                i++;
                if (i == max && inicio > fin)
                    i = 0;
            } while (i != fin + 1);
        }
        return s.toString();
    }
}

