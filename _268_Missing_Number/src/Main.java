public class Main {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
//        System.out.println(missingNumber2(nums));
        System.out.println(0%1);
        System.out.println(1%2);
        System.out.println(2%3);
        System.out.println(2%4);
        System.out.println(2%5);
        System.out.println(3%4);
        System.out.println(3%5);
        System.out.println(3%6);


    }

    public static int missingNumber(int[] nums) {
        int[] exist= new int[nums.length+1];
        int result=0;
        for (int i=0;i<nums.length;i++){
            exist[nums[i]]=1;
        }
        for (int i=0;i< exist.length;i++){
            if (exist[i]==0){
                result=i;
            }
        }
        return result;
    }

    public static int missingNumber2(int[] nums) {
        int sum=0;
        int numsSum=0;
        for (int i=0;i<=nums.length;i++){
            sum+=i;
            if (i<nums.length){
                numsSum+=nums[i];
            }
        }
        return (sum-numsSum);
    }


}
