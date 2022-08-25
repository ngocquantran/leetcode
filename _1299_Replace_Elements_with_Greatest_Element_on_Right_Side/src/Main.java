import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));

    }
    public static int[] replaceElements(int[] arr) {
        int max=arr[arr.length-1];
        for (int i= arr.length-2;i>=0;i--){
            int t=arr[i];
            arr[i]=max;
            if (t>max){
                  max=t;
              }
        }
        arr[arr.length-1]=-1;
        return arr;
    }

    public static int[] replaceElements2(int[] arr) {
        int n=arr.length-1;
        for (int i=0;i<arr.length;i++){
            int max=0;
            if (n>0){
                for (int j=i+1;j<arr.length;j++){
                    if (arr[j]>max){
                        max=arr[j];
                    }
                }
                arr[i]=max;
                n--;
            }else {
                arr[i]=-1;
            }
        }
        return arr;
    }
}
