public class Main {
    public static void main(String[] args) {
        String  s = "011101";
        maxScore(s);

    }

    public static int maxScore(String s) {
        int max=0;
        int k=s.length()/2;
        int sumLeft=0, sumRight =0;
        for(int i=0;i<=k;i++){
            if (s.charAt(i) == '0') {
                sumLeft++;
            }
            if (s.charAt(s.length()-1-i)=='1'){
                sumRight++;

            }

        }



    }
    public static int maxScore2(String s) {
        int max=0;


        for (int i=0;i<s.length()-1;i++){
            String left=s.substring(0,i+1);
            String right=s.substring(i+1);
            System.out.println("left: "+left);
            System.out.println("right: "+right);
            System.out.println();
            int sumLeft=0, sumrRight=0;
            for (int j=0;j<left.length();j++){
                if (left.charAt(j)=='0'){ sumLeft++;}
            }
            for(int k=0;k<right.length();k++){
                if (right.charAt(k)=='1'){ sumrRight++;}
            }

            if (sumLeft+sumrRight>max){
                max=sumLeft+sumrRight;

            }
            System.out.println(max);
        }
        return max;




    }
}
