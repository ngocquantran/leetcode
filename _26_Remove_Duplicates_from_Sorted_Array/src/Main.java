import javax.sound.midi.MidiFileFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int n= nums.length;
        int k=1;
        for (int i=1; i<n;i++){
           if (nums[i]>nums[i-1]){
               k++;
               nums[k-1]=nums[i];
           }
           }
        return k;
    }
    public static int removeDuplicates2(int[] nums) {
        int n= nums.length;
        int k=0;
        for (int i=0; i<n;i++){
            for (int j=i+1;j<n;){
                if (nums[i]==nums[j]){
                    int t=nums[j];
                    for (int m=j;m<=n-1-1;m++){
                        nums[m]=nums[m+1];
                    }
                    nums[n-1]=t;
                    n--;
                }else {j++;}
            }
            k++;
        }
        return k;
    }
}
