public class Main {
    public static void main(String[] args) {

    }
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for (int i=0;i< mat.length;i++){
            for (int j=0;j<mat.length;j++){
                if (i==j || (j==mat.length-1-i && i!=j)){
                    sum+=mat[i][j];
                }
            }
        }

        return sum;

    }
}
