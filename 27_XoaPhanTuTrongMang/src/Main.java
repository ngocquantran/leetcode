import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] nums={3,2,2,3};
//        int val=3;
//        removeElement2(nums,val);
//        System.out.println(Arrays.toString(nums));

        int[] nums1={1,3,5,7,9};
        int[] nums2={2,5,6,7};
        System.out.println(Arrays.toString(mergeTwoArray(nums1,nums2)));


    }
    public static int removeElement(int[] nums, int val) {
        int size= nums.length;
        int i=0;
        while (i<size){
            if (nums[i]==val){
                for (int j=i;j< size-1;j++){
                    nums[j]=nums[j+1];
                }
                size--;
            }else {
                i++;
            }
        }
        return size;
    }

    public static int removeElement2(int[] nums, int val){
        int cur=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]!=val){
                nums[cur]=nums[i];
                cur++;
            }
        }
        return cur;
    }

    public static int[] mergeTwoArray(int[] nums1, int[] nums2){
        int m= nums1.length;
        int n= nums2.length;
        int[] nums=new int[m+n];
        while (m>0 && n>0){
            if (nums1[m-1]>nums2[n-1]){
                nums[m+n-1]=nums1[m-1];
                m--;
            }else {
                nums[m+n-1]=nums2[n-1];
                n--;
            }
        }
        while (m>0){
            nums[m+n-1]=nums1[m-1];
            m--;
        }
        while (n>0){
            nums[m+n-1]=nums2[n-1];
            n--;
        }
        return nums;
    }
}
