public class Main {
    public static void main(String[] args) {
        ColaSImple<String> colaSImple = new ColaSImple<>();
        colaSImple.insertar("a");
        colaSImple.insertar("b");
        colaSImple.insertar("c");
        System.out.println(colaSImple.peek());
        colaSImple.eliminar();
        System.out.println(colaSImple.peek());
    }
}
