import javax.sound.midi.MidiFileFormat;

public class Main {
    public static void main(String[] args) {

    }
    public int[] rearrangeArray(int[] nums) {
        int[] result=new int[nums.length];
        int indexEven=0;
        int indexOdd=1;
        for (int i=0;i< nums.length;i++){
            if (nums[i]>0){
                result[indexEven]=nums[i];
                indexEven+=2;
            }
            if (nums[i]<0){
                result[indexOdd]=nums[i];
                indexOdd+=2;
            }
        }
        return result;

    }

}
