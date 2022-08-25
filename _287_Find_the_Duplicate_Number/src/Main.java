public class Main {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int[] exist=new int[nums.length+1];
        for (int i=0; i< nums.length;i++){
            exist[nums[i]]+=1;
        }
        int result=0;
        for (int i=0;i<exist.length;i++){
            if (exist[i]==2){
                result=i;
            }
        }
        return result;

    }
}
