public class Main {
    public static void main(String[] args) {
        int[] nums={1,3,2,4};
        System.out.println(compareMiddle(nums,0, nums.length-1));
    }
    public boolean isMonotonic(int[] nums) {
        int key=nums[0];
        int index=0;
        boolean increase=true;
        for (int i=1;i< nums.length-1;i++) {
            if (nums[i]!=key){
                if (nums[i]<key){
                    increase=false;
                }
                key=nums[i];
                index=i;
                break;
            }
        }
        if (index==0){
            return true;
        }
        if (increase){
            for (int i=index;i< nums.length;i++){
                if (nums[i]<key){
                    return false;
                }else {
                    key=nums[i];
                }
            }
        }else {
            for (int i=index;i< nums.length;i++){
                if (nums[i]>key){
                    return false;
                }else {
                    key=nums[i];
                }
            }
        }
        return true;
    }

    public static boolean compareMiddle(int[] nums,int leftIndex, int rightIndex){
        if (leftIndex>=rightIndex) return true;

        int k=(leftIndex+rightIndex)/2;
        System.out.println("left= "+leftIndex+"; k= "+k+"; right= "+rightIndex);
        System.out.println(nums[leftIndex]+" - "+nums[k]+" - "+nums[rightIndex]);
        if (nums[k]>nums[leftIndex] && nums[k]>nums[rightIndex]){
            return false;
        }
        if (nums[k]>nums[leftIndex] && nums[k]>nums[k+1] ){
            return false;
        }
        if (nums[k]<nums[leftIndex] && nums[k]<nums[rightIndex]  && nums[k]<nums[k+1]) {
            return false;
        }
        if (nums[k]<nums[leftIndex] && nums[k]<nums[k+1] ) {
            return false;
        }
        compareMiddle(nums,leftIndex,k);
        compareMiddle(nums,k+1,rightIndex);
        return true;
    }
}
