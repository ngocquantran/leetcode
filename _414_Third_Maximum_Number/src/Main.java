import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        thirdMax(nums);

    }
    public static int thirdMax(int[] nums) {

        Arrays.sort(nums);
        int firstMax=nums[nums.length-1];
        int secondMax=firstMax;
        int thidMax=secondMax;

        int n=nums.length-2;
        while (n>=0){
            if (nums[n]!=firstMax){
                secondMax=nums[n];
                n--;
                while (n>=0){
                    if (nums[n]!=firstMax && nums[n]!=secondMax){
                        thidMax=nums[n];
                        n=-1;
                    }
                    n--;
                }

            }
            n--;
        }

        return thidMax;

    }

}
