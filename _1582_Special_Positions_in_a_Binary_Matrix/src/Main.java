import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] mat={{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(numSpecial(mat));


    }
    public static int numSpecial(int[][] mat) {
        int[] row=new int[mat.length];
        int[] col=new int[mat[0].length];

        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                row[i]+=mat[i][j];
                col[j]+=mat[i][j];
            }
        }
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));
        int count=0;
        for(int i=0;i<row.length;i++){
            for (int j=0;j<col.length;j++){
                if (mat[i][j]==1 && row[i]==1 && col[j]==1) count++;

            }
        }
        return count;

    }
}
