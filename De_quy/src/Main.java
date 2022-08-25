import javax.sound.midi.MidiFileFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] a={1,2,3,4,5,6,7,8};
//        System.out.println(timKiemTuanTu(2,a,a.length-1));
//        System.out.println(sum1(a,0,0));
//        System.out.println(sum2(a,5,6,0));
//        char[] s={'h','e','l','l','o'};
//        reverseString(s);
//        System.out.println(Arrays.toString(s));

//        System.out.println(calculate(2,5));
        int[][] a=new int[3][3];
        travel(a,3,3);





    }
    public static int timKiemTuanTu(int x,int[] a,int i){
        if (a[i]==x){
            return i;
        }
        if (i<0 || i>=a.length){
            return -1;
        }
        return timKiemTuanTu(x,a,i-1);
    }

    public static int sum1(int[] a, int i,int sum){
        if (i<0 || i>=a.length){
            return sum;
        }
        sum+=a[i];
        return sum1(a,i+1,sum);
    }

    public static int sum2(int[] a, int startIndex,int endIndex,int sum){
        if (startIndex>endIndex){
            return sum;
        }
        sum+=a[startIndex];
        return sum2(a,startIndex+1,endIndex,sum);
    }

    public static void reverseString(char[] s) {
        reverse(s,0,s.length-1);

    }

    public static void reverse(char[] s,int i,int j){
        if (i>=j){
            return;
        }
        char m=s[j];
        s[j]=s[i];
        s[i]=m;
        reverse(s,i+1,j-1);
    }

    public double myPow(double x, int n) {
        if (n==0){
            return 1;
        }
        if (n>0){
            double t= positivePow(x,n);
            return Math.round(t*100000)/100000.f;
        }else {
            double t= negativePow(x,n);
            return Math.round(t*100000)/100000.f;
        }
    }
    public static double positivePow(double x, int n){
        if (n==0){
            return 1;
        }
        return x*positivePow(x,n-1);
    }
    public static double negativePow(double x, int n){
        if (n==0){
            return 1;
        }
        return (1/x)*(negativePow(x,n+1));
    }

     public static double myPow1(double x, int n) {
        if (n==0){
            return 1;
        }
        else {
            double result=1;
            if(n>0){
                for (int i=1;i<=Math.round(n/2);i++){
                    result*=x;
                }

            }else {
                for (int i=-1;i>=Math.round(n/2);i--){
                    result*=1/x;
                }

            }
            return n%2==0 ? result*result : (x*result*result);
        }
     }
    public static double myPow2(double x, int n) {
        if (n==0){
            return 1;
        }else {
            if (n>0){
                double t=x*myPow2(x,n-1);
                return t*t;
            }else {
                double t= (1/x)*myPow2(x,n+1);
                return Math.round(t*100000)/100000.f;
            }

        }
    }

    public static double myPow3(double x, int n) {
        if (n==0){
            return 1;
        }
        int n_2=0;
        if (n<0){
            n=-n;
            n_2=n%2==0? -(n/2) : (-n-1)/2;
            x=1/x;
        }else {
            n_2=n%2==0?n/2:(n-1)/2;
        }

        double t=myPow3(x,n_2);
        return n%2==0? t*t : (x*t*t);
//        if (n%2==0){
//            double t=myPow3(x,n_2/2);
//            return t*t;
//        }else {
//            double t=myPow3(x,(n_2-1)/2);
//            return x*t*t;}
//
    }

    public static double myPow4(double x, int n) {
        if (n==0){return 1;
        }else {
            double result=1;
            int nn=Math.abs(n)-1;
            double xx=x;
            while (nn>0){
                if (nn%2==1){
                    result=result*xx;
                    nn--;
                }else {
                    xx=xx*xx;
                    nn=nn/2;
                }
            }
            System.out.println(result);
            System.out.println(x);
            if (n<0){
                return 1/(result*x);
            }else
                return result*x;
        }


    }

    public static double myPow5(double x, int n) {
        if (n>0){
            return mypositivePow(x,n-1)*x;
        }else {
            return 1/mypositivePow(x,Math.abs(n));
        }
    }

    public static double mypositivePow(double x, int n) {
        if (n==0){
            return 1;
        }
        if (n%2==0){
            double t=myPow3(x,n/2);
            return t*t;
        }else {
            double t=myPow3(x,(n-1)/2);
            return x*t*t;}

    }

    public static double myPow6(double x, int n) {
        long N=n;
        if (N<0){
            return 1/calculate(x, -N);
        }else return calculate(x,N);
    }

    public static double calculate(double x, long n){
        if (n==0){
            System.out.println(1);
            return 1;
        }
        double half=calculate(x,n/2);
        if (n%2==0){
            return half=half*half;
        }else {
            return half=half*half*x;
        }

    }

    public static void travel(int[][] a,int i, int j){
        if (j==0){
            i--;
            j=a[i].length;
        }
        if (i==0 ){
            return;
        }
        travel(a,i, j-1);
        System.out.printf("[%d,%d]\n",i-1,j-1);



    }



}
