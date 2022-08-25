import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int curIndex=0;

        for (int i=0;i< arr2.length;i++){
            for (int j=0;j<arr1.length;j++){
                if (arr1[j]==arr2[i]){
                    int t=arr1[curIndex];
                    arr1[curIndex]=arr1[j];
                    arr1[j]=t;
                    curIndex++;
                }
            }
        }
        if (curIndex<arr1.length){
            int[] arr=new int[arr1.length-curIndex];
            for (int i=curIndex;i< arr1.length;i++){
                arr[i-curIndex]=arr1[i];
            }
            Arrays.sort(arr);
            for (int i=curIndex;i< arr1.length;i++){
                arr1[i]=arr[i-curIndex];
            }

        }
        return arr1;

    }
}
