import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(absolutePermutation1(10, 1).toString());

      
    }

    public static List<Integer> absolutePermutation1(int n, int k) {
        // Write your code here
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i - k > 0 && arr[i - k] > 0) {
                result.add(arr[i - k]);
                arr[i - k]=0;

            } else if (i + k <= n && arr[i + k] > 0) {
                result.add(arr[i + k]);
                arr[i + k]=0;
            }
            if (result.size() != i) {

                return Arrays.asList(-1);
            }
        }
        return result;
    }

    public static List<Integer> absolutePermutation(int n, int k) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        List<Integer> result = new ArrayList<>();
        System.out.println(list);
        int index = 1;
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("index: " + index);
            for (int i = 0; i < list.size(); i++) {
                if (index - list.get(i) == k || list.get(i) - index == k) {
                    System.out.println("num= " + list.get(i) + " - i= " + i);
                    result.add(list.get(i));
                    list.remove(i);
                    break;
                }
            }

            System.out.println(list);
            System.out.println(result);
            if (result.size() == index) {
                index++;
            } else {
                result.removeAll(result);
                result.add(-1);
                return result;
            }
            if (index > n) {
                isContinue = false;
            }

        }
        return result;

    }
}
