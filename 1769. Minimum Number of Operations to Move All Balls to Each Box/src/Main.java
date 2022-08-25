import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minOperations("110")));

    }
    public static int[] minOperations(String boxes) {
        int[] result=new int[boxes.length()];
        for (int i=0;i< result.length;i++){
            System.out.println("i: "+i);
            int indexL=0;
            int indexR=i+1;
            int sum=0;
            while (indexL<i){
                System.out.println("indexL: "+indexL);
                if (boxes.charAt(indexL)=='1'){
                    sum+=i-indexL;

                }
                indexL++;
                System.out.println("sum: "+sum);
            }
            while (indexR<boxes.length()){
                System.out.println("indexR: "+indexR);
                if (boxes.charAt(indexR)=='1'){
                    sum+=indexR-i;

                }
                indexR++;
                System.out.println("sum: "+sum);
            }
            result[i]=sum;

        }
        return result;

    }

}
