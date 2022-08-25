public class Main {
    public static void main(String[] args) {

    }
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i].length()+nums[j].length()==target.length()){
                    String str1=nums[i]+nums[j];
                    String str2=nums[j]+nums[i];
                    if (str1.equals(target)) count++;
                    if (str2.equals(target)) count++;
                }

            }
        }
        return count;


    }
}
