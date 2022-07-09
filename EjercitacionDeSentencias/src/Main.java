public class Main {
    public static void main(String[] args) {
        exercise7();
    }

    private static void exercise7() {
        //imprimir triangulo de mayor a menor//
        for (int i = 0; i < 7; i++) {
            String msg = "";
            for (int j = 0; j < 7 - i; j++) {
                msg = msg + "*";
            }
            System.out.println(msg);
        }
    }
}