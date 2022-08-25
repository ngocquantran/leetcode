public class Main {
    public static void main(String[] args) {

    }
    public int mostFrequent(int[] nums, int key) {
        int[] arr=new int[1001];
        for (int i=1;i< nums.length;i++){
            if (nums[i-1]==key){
                arr[nums[i]]++;
            }
        }
        int max=0;
        int result=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
                result=i;
            }
        }
        return result;

    }
}
