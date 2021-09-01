public class Main {
    public static void main(String[] args) {
        ColaSimple<Integer> colaSimple = new ColaSimple<Integer>();
        colaSimple.insertar(1);
        colaSimple.insertar(2);
        colaSimple.insertar(3);
        System.out.println(colaSimple.peek());
    }
}
