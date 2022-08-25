public class Main {
    public static void main(String[] args) {
        int[] nums={7,1,5,4};
        int[] nums2={9,4,3,2};
        int[] nums3={1,5,2,10};

        System.out.println(maximumDifference2(nums));
        System.out.println(maximumDifference2(nums2));
        System.out.println(maximumDifference2(nums3));

        System.out.println(maximumDifference(nums));
        System.out.println(maximumDifference(nums2));
        System.out.println(maximumDifference(nums3));

    }
    public static int maximumDifference(int[] nums) {
        int result=-1;
        int min=nums[0];
        for (int i=0;i<nums.length;i++){
            if (nums[i]>min){
                result=Math.max(result,nums[i]-min);
            }
            min=Math.min(min,nums[i]);
        }
        return result;

    }

    public static int maximumDifference2(int[] nums) {
        int max=0;
        for (int i=0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if ( nums[j]>nums[i]+max ){
                    max=nums[j]-nums[i];
                }
            }
        }
        if (max==0) return -1;
        return max;

    }
}
