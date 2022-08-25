import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s).toString());

    }

    public static List<Integer> partitionLabels(String s) {
        //System.out.println(Arrays.toString(s.toCharArray()));
        List<Integer> result=new ArrayList<>();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i]=s.lastIndexOf(s.charAt(i));
            System.out.print(s.charAt(i)+ " - "+arr[i]+", ");
        }
        //System.out.println(Arrays.toString(arr));

        int lastIndex=arr[0];
        int length=lastIndex+1;
        int index=0;
        while (index<s.length() && lastIndex<s.length()){
            System.out.println(s.charAt(index));
            System.out.println("index: "+index+" - arr[index]= "+arr[index] + " - lastIndex= "+lastIndex);
            if (arr[index]>lastIndex){
                length+=arr[index]-lastIndex;
                lastIndex=arr[index];
            }

            System.out.println("Sau khi tăng index: index= "+index+" - length= "+length);
            if (index==lastIndex){
                result.add(length);
                System.out.println(result.toString());
                if (index<s.length()-1){
                    lastIndex=arr[index+1];
                    length=lastIndex-index;
                    System.out.println("Setup lại: index= "+index+" - lastIndex= "+lastIndex+" - length= "+length);

                }

            }
            index++;
        }
        return result;

    }
}
