import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] ops= {{2,2},{3,3}};
        int m=3;
        int n=3;
        System.out.println(maxCount(m,n,ops));

    }

    public static int maxCount(int m, int n, int[][] ops) {
        int row=m;
        int col=n;
        for (int i=0;i< ops.length;i++){
            if (ops[i][0]<row){
                row=ops[i][0];
            }
            if (ops[i][1]<col){
                col=ops[i][1];
            }
        }
        return row*col;

    }
    public int maxCount2(int m, int n, int[][] ops) {
        int[][] arr=new int[m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              arr[i][j]=ops.length;
            }
        }
        for (int i=0;i< ops.length;i++){
            for (int j=0;j<ops[i][0];j++){
                for (int k=0;k<ops[i][1];k++){
                    arr[j][k]++;
                }
            }
        }
//        for (int i=0;i< ops.length;i++){
//            for (int j=0;j<ops[i][0];j++){
//                for (int k=0;k<ops[i][1];k++){
//                    arr[j][k]++;
//                }
//            }
//        }
        int max=arr[0][0];
        int count=1;
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (arr[i][j]==max){
                    count++;
                }
                if (arr[i][j]>max){
                    max=arr[i][j];
                    count=1;
                }
            }
        }
        return count;

    }
}
