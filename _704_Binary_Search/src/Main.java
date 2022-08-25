public class Main {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int n= nums.length;
        return binary(nums,target,0, nums.length-1);

    }
    public static int binary(int[] nums,int key, int L, int R){
        if (L>R){
            return -1;
        }
        int mid=(L+R)/2;
        if (key==nums[mid]){
            return mid;
        }else if (key>nums[mid]){
            return binary(nums,key,mid+1,R);
        }else {
            return binary(nums,key,L,mid-1);
        }
    }

}
