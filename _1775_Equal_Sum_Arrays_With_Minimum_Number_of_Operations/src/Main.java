public class Main {
    public static void main(String[] args) {

    }
    public int minOperations(int[] nums1, int[] nums2) {
        if (nums1.length> nums2.length*6) return -1;
        if (nums2.length> nums1.length*6) return -1;
        int[] arr1=new int[7];
        int[] arr2=new int[7];
        int sum1=0;
        int sum2=0;
        for (int i=0;i<nums1.length;i++){
            arr1[nums1[i]]++;
            sum1+=nums1[i];
        }
        for (int i=0;i<nums2.length;i++){
            arr2[nums2[i]]++;
            sum2+=nums2[i];
        }


    }
}
