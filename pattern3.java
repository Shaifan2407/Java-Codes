public class pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.err.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.err.println();
        }
    }
}
