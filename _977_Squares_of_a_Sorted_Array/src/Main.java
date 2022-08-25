import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums={-7,-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortArr2(nums)));




    }
    public int[] sortedSquares(int[] nums) {
        sortArr(nums);
        for (int i=0;i< nums.length;i++){
            nums[i]*=nums[i];
        }
        return nums;
    }
    public static int[] sortArr(int[] nums){
        for (int i=0;i< nums.length;i++){
            boolean isSorted=true;
            for (int j=0;j< nums.length-1-i;j++){
                if (Math.abs(nums[j])>Math.abs(nums[j+1])){
                    isSorted=false;
                    int t=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=t;
                }
            }
            nums[nums.length-i-1]*=nums[nums.length-i-1];
            System.out.println(Arrays.toString(nums));
//            if (isSorted){
//                break;
//            }

        }
        return nums;
    }

    public static int[] sortArr2(int[] nums){
        int count=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]<0){
                count++;
            }
        }
        int[] negativeArr=new int[count];
        for (int i=count-1;i>=0;i--){
            negativeArr[i]=Math.abs(nums[count-i-1]);
        }
        int[] positiveArr=new int[(nums.length)-count];
        for (int i=0;i< nums.length-count;i++){
            positiveArr[i]= nums[count+i];
        }
        int m= positiveArr.length;
        int n=negativeArr.length;
        while (m>0 && n>0){
            if (positiveArr[m-1]>negativeArr[n-1]){
                nums[m+n-1]=positiveArr[m-1]*positiveArr[m-1];
                m--;
            }else {
                nums[m+n-1]=negativeArr[n-1]*negativeArr[n-1];
                n--;
            }
        }
        while (m>0){
            nums[m+n-1]=positiveArr[m-1]*positiveArr[m-1];
            m--;
        }
        while (n>0){
            nums[m+n-1]=negativeArr[n-1]*negativeArr[n-1];
            n--;
        }
        return nums;
    }
}
