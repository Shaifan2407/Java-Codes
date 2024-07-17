public class pattern7{
    public static void main(String[] args) {
        
        int n=5;

        // for (int i = 5; i >= 1; i--) {
        //     System.out.println("*".repeat(i));
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}