import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={5,2,6,5,2,2};
        int[][] result=internet(arr);
        for (int i=0;i< result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }

    }
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            if (!stack.isEmpty() && stack.peek()=='(' && s.charAt(i)==')'){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.size();



    }

    public static int[][]  internet(int[] arr) {

        Map<Integer,Integer> map=new HashMap<>();
        for (Integer n:arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        boolean isDuplicateFreq=false;
        Set<Integer> set=new HashSet<>();
        for (Integer freq: map.values()){
            if (set.add(freq)==false){
                isDuplicateFreq=true;
                break;
            }
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        if (isDuplicateFreq){
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o1.getKey()-o2.getKey();
                }
            });
        }else {
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue()-o1.getValue();
                }
            });
        }
        System.out.println(list.toString());
        int[][] result=new int[map.size()][2];
        int index=0;
        for (int i=0;i< list.size();i++){
            result[index][0]=list.get(i).getKey();
            result[index][1]=list.get(i).getValue();
            index++;
        }

        return result;

    }
}
