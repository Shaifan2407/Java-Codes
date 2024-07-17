public class pattern5 {
    public static void main(String[] args) {
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     if (i % 2 == 0) {
        //         System.out.print(" ".repeat(n - i));
        //         System.out.println("*".repeat(i));
        //     } else {
        //         System.out.println("*".repeat(i));
        //     }
        // }
        int n = 6;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                // Print leading spaces for even rows
                for (int j = 1; j <= (n - i); j++) {
                    System.out.print(" ");
                }
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
