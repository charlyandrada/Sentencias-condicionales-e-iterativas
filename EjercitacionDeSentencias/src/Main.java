public class Main {
    public static void main(String[] args) {
        exercise8();
    }

    private static void exercise8() {
        for (int i = 0; i < 7; i++) {
            String msg = "";
            for (int j = 0; j < 6 - i; j++) {
                msg = msg + " ";
            }
            for (int j = 0; j < i + 1; j++) {
                msg = msg + "*";
            }
            System.out.println(msg);
        }
    }
}