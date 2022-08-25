import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes2(nums));

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int[] newnums=new int[nums.length+2];
        newnums[0]=0;
        for (int i=0;i< nums.length;i++){
            newnums[i+1]=nums[i];
        }
        newnums[nums.length+2-1]=0;
        int result=0;
        for (int i=0;i< newnums.length;i++){
            if (newnums[i]==0){
                newnums[i]=i-result;
                result=i;
            }
        }
        int max=newnums[0];
        for (int n:newnums){
            if (n>max){
                max=n;
            }
        }
        return max-1;

    }

    public static int findMaxConsecutiveOnes2(int[] nums){
        int max=0;
        int count=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]==1){
                count++;
            }else {
                max=Math.max(count,max);
                count=0;
            }
        }
        return Math.max(count,max);

    }
}
