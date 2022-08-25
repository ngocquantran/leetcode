public class Main {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }else {
            int index= digits.length-1;
            while (digits[index]==9){
                digits[index]=0;
                index--;
            }
            if (index>=0){
                digits[index]++;
                return digits;
            } else {
                int[] result=new int[digits.length+1];
                result[0]=1;
                for (int i=0;i< digits.length;i++){
                    re
                }
            }
        }
        return null;
    }

}
