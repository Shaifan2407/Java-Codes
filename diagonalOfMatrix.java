public class diagonalOfMatrix {
    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j){
                    System.out.println(arr[i][j]);
                }
            }            
        }

        System.out.println("****************************************");
        System.out.println("****************************************");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if((i+j)==(4-1)){
                    System.out.println(arr[i][j]);
                }
            }            
        }
    }
}
