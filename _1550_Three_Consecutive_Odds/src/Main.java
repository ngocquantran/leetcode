public class Main {
    public static void main(String[] args) {

    }
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for (int i=0;i<arr.length-2;i++){
            if (arr[i]%2!=0){
                if (arr[i+1]%2!=0 && arr[i+2]%2!=0){
                    count++;
                    break;
                }
            }else {
                continue;
            }
        }
        return count>0;

    }
}
