import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMaximumGenerated(7));

    }
    public static int getMaximumGenerated(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        int[] nums=new int[n+1];
        int max=1;
        nums[0]=0;
        nums[1]=1;
        int index=1;
        while (index<=n/2){
            if (nums[index]>max){
                max= nums[index];
            }
            nums[index*2]=nums[index];
            if (index<=(n-1)/2){
                if (nums[index]+nums[index+1]>max){
                    max=nums[index]+nums[index+1];
                }
                nums[index*2+1]= nums[index]+nums[index+1];
            }
            index++;
        }
        return max;
    }
}
