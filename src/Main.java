public class Main {
    public static void main(String[] args) {
        Cola<String> cola = new Cola<>();
        cola.insertar("a");
        cola.insertar("b");
        cola.insertar("c");
        System.out.println(cola.peek());
        cola.eliminar();
        System.out.println(cola.peek());

        System.out.println(cola.toString());
    }
}



