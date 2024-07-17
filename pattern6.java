public class pattern6{
    public static void main(String[] args) {
        
        int j,i,row, space = 1;
        row = 5;
        space = row - 1;

        for (i = 1; i <= row; i++) 
        {
            for (j = 1; j <= space; j++) 
            {
                System.out.print(" ");            
            }
            space--;
            for (j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}