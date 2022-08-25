import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result=new ArrayList<>();
        int[] arr=new int[101];
        for (int i=0;i< nums.length;i++){
            arr[nums[i]]++;
        }
        int index=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                    int count=1;
                    while (count<=arr[i]){
                        if (i==target){
                            result.add(index++);
                            count++;
                        }else {
                            index++;
                            count++;
                        }

                    }


            }
        }
        return result;

    }
}
