import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String target="101001100";
        System.out.println(minFlips2(target));

    }

    public static int minFlips(String target) {
        int count = 0;
        char[] arr = target.toCharArray();
        System.out.println("đề bài: "+Arrays.toString(arr));
        boolean isContinue = true;
        int lastIndex= arr.length-1;
        while (isContinue) {
            int index = arr.length;
            for (int i = lastIndex; i >= 0; i--) {
                if (arr[i] == '1') {
                    index = i;
                } else if (index< arr.length){
                    break;
                }
            }
            System.out.println("index tìm được: "+index);
            if (index < arr.length) {
                if (index==0){
                    count++;
                    lastIndex=index-1;
                }else {
                    count+=2;
                    lastIndex=index-1;
                }

//                for (int i = index; i < arr.length; i++) {
//                    if (arr[i]=='0'){
//                        arr[i]='1';
//                    } else {
//                        arr[i] = '0';
//                    }
//                }
                System.out.println("count= "+count);
            }else {
                isContinue = false;
            }
            System.out.println(Arrays.toString(arr));

        }
        return count;

    }
    public static int minFlips2(String target) {
        int count=0;
        int curNum=0;
        for (int i=0;i<target.length();i++){
            char c=target.charAt(i);
            if (c-'0'!=curNum){
                count++;
                curNum=c-'0';
            }
        }
        return count;
    }
}
