import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public boolean checkIfExist(int[] arr) {
        int found=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]*2==arr[j] || arr[i]*0.5==arr[j]){
                    found++;
                }
            }
        }
        return (found>0);

    }

    public boolean checkIfExist2(int[] arr) {
        int found=0;
        String str= Arrays.toString(arr);
        for (int a:arr){
            String x=String.valueOf(a*2);
            String y=String.valueOf(a*0.5);
            if (str.contains(x) || str.contains(y)){
                found++;
            }
        }

        return (found>0);

    }

    public boolean checkIfExist3(int[] arr) {
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                int num=arr[i]*2;
                if (j!=i && arr[j]==num){
                    return true;
                }
            }
        }
        return false;

    }
}
