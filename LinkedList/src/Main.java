import java.util.Arrays;

public class Main {

    public static void printF(){
        System.out.println("F");
        printF();
    }
    public static int giaiThua(int n){
        if (n==0)
            return 1;
        return n*giaiThua(n-1);
    }

    public static int deQuy(int n){
        if (n<=2)
            return 1;
//        System.out.printf("Cần tính F[%d]\n",n);
        return deQuy(n-1)+deQuy(n-2);
    }
    static int[] F=new int[1000];


    public static int deQuy2(int n){
        if (F[n]!=0)
            return F[n];

//        System.out.printf("Cần tính F[%d]\n",n);
        if (n<=2){
            F[1]=1;
            F[2]=1;
            return 1;
        }
        F[n]=deQuy2(n-1)+deQuy2(n-2);
        return F[n];
    }
    public static int deQuy3(int n){
        int[] Fibo =new int[n+1];
        Fibo[1]=1;
        Fibo[2]=1;
        for (int i=3;i<=n;i++){
            Fibo[i]=Fibo[i-1]+Fibo[i-2];
        }
        return Fibo[n];
    }


    public static int deQuy4(int n){
        int a=0;int b=1;
        if (n<=2){
            return 1;
        }else {
            int deQuy=0;
            for (int i=2;i<=n;i++){
                deQuy=a+b;
                a=b;
                b=deQuy;

            }
            return deQuy;
        }
    }

    public static int linearSum(int n){
        if (n==1)
            return 1;
        return linearSum(n-1)+n;
    }

    public static int luyThua(int a, int n){
        if (n==0)
            return 1;
        if (n==1)
            return a;
        return a*luyThua(a,n-1);
    }

    public static void printElement(int[] arr,int index){
        if (index<0 || index>=arr.length)
            return;
        System.out.println(arr[index]);
        printElement(arr,index+1);
    }

    public static void downPrintElement(int[] arr,int index){
        if (index<0 || index>=arr.length)
            return;
        System.out.println(arr[index]);
        downPrintElement(arr,index-1);
    }

    public static int ucln(int a, int b){
        if (b==0)
            return a;
        return ucln(b,a%b);
    }

    public static int bcnn(int a, int b){
        return (a*b)/(ucln(a,b));
    }

    public static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod)
    {
        if (n == 1)
        {
            System.out.println("Xếp đĩa 1 từ cột " +  from_rod + " sang cột " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
        System.out.println("Xếp đĩa " + n + " từ cột " +  from_rod + " sang cột " + to_rod);
        towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
    }

    public static int[] sortArray(int[] arr){
        return mergeSort(arr,0,arr.length-1);

    }

    public static int[] mergeSort(int[] a, int L, int R){
        //TH Đặc biệt và điều kiên dừng
        if (L>R){
            return new int[0];
        }
        if (L==R){
            int[] singleElemnt={a[L]};
            return singleElemnt;
        }

        //Chia ra
        System.out.println("Chia: "+L+" - "+R);
        int k=(L+R)/2;
        int[] a1=mergeSort(a,L,k);
        int[] a2=mergeSort(a,k+1,R);

        //Trộn vào a1 a2 là các mảng đã được sắp xếp
       int[] result=merge(a1,a2);
        System.out.println("Kết quả Merge:"+ Arrays.toString(result));
       return result;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int ai:nums) {
            int number = 1;
            while (ai / 10 > 0) {
                number++;
                ai=ai/10;
            }
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countDigit(int a){
        int count=1;
        while ((a/10)>0){
            count++;
            a=a/10;
        }
        return count;
    }

    public static int[] merge(int[] a1,int[] a2){
        int n=a1.length+a2.length;
        int[] result=new int[n];

        int i=0, i1=0, i2=0;
        while (i<n){
            if (i1<a1.length && i2<a2.length){ //a1 và a2 vẫn còn phần tử
                if (a1[i1]<=a2[i2]){
                    result[i]=a1[i1];
                    i++;i1++;
                }else {
                    result[i]=a2[i2];
                    i++;i2++;
                }
            }else {// a1 rỗng hoặc a2 rỗng
                if (i1<a1.length){//a1 ok
                    result[i]=a1[i1];
                    i++;i1++;
                }else {//a2 ok
                    result[i]=a2[i2];
                    i++;i2++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,10,25,14};
        downPrintElement(arr,5);
//        long t0=System.currentTimeMillis();
////        System.out.println(deQuy(46));
//        long t1=System.currentTimeMillis();
//        System.out.println(deQuy2(21));
//        long t2=System.currentTimeMillis();
//        System.out.println(deQuy3(21));
//        long t3=System.currentTimeMillis();
//        System.out.println(deQuy4(21));
//        long t4=System.currentTimeMillis();
//
////        System.out.println("Cách 1: "+(t1-t0));
//        System.out.println("Cách 2: "+(t2-t1));
//        System.out.println("Cách 3: "+(t3-t2));
//        System.out.println("Cách 4: "+(t4-t3));

//        int[] a={1,3,5,7,9};
////        int[] b={2,4,6,8,10};
////        int[] c={1,5,3,2,8,7,6,4};
////        System.out.println(Arrays.toString(mergeSort(c,0,c.length-1)));
//        int[] nums={12,345,2,6,7896};
//        System.out.println(findNumbers(nums));
//        int[] nums2={555,901,482,1771};
//        System.out.println(findNumbers(nums2));






    }
}
