import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] original={1,2,3,4};
        int[][] result=construct2DArray(original,2,2);
        for (int i=0;i< result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }


    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m*n!=original.length) return new int [0][0];
        int[][] result=new int[m][n];
        int row=0;
        int col=0;
        for (int i=0;i< original.length;i++){
            if (col<n){
                result[row][col++]=original[i];
            }
            System.out.println(col);
            if (col==n){
                col=0;
                row++;}
        }

        return result;


    }
}
