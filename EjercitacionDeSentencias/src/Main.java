public class Main {
    public static void main(String[] args) {
        exercise6();
    }

    private static void exercise6() {
        // imprimir un triangulo de menor a mayor//
        for (int i = 0; i < 7; i++) {
            String msg = "";
            for (int j = 0; j < i + 1; j++) {
                msg = msg + "*";
            }
            System.out.println(msg);
        }
    }
}