public class Main {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        System.out.println(validMountainArray(arr));

    }
    public static boolean validMountainArray(int[] arr) {
        if (arr.length<3){
            return false;
        }else {
            int m=0;
            int n= arr.length-1;
            for(int i=0;i< arr.length-1;i++){
                if (arr[i+1]>arr[i]){
                    m++;
                }else {
                    break;
                }
            }
            for (int i= arr.length-1;i>0;i--){
                if (arr[i-1]>arr[i]){
                    n--;
                }else {break;}

            }
            return (m==n && m>0 && n< (arr.length-1));}
    }
}
