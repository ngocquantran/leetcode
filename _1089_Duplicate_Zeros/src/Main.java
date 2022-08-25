import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,4,5,0};
        duplicateZeros(arr);

    }
    public static void duplicateZeros(int[] arr) {
        int n= arr.length;
        for (int i=0;i<n-1;i++){
            if (arr[i]==0){
                for (int j=n-1;j>=i+2;j--){
                   arr[j]=arr[j-1];
                }
                arr[i+1]=0;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
