import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a={6,7,8,5,4,1,2,3};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }

    public static void quickSort(int[] a, int L, int R){
        if (L>=R){
            return;
        }
        int key=a[(L+R)/2];
        int k=partition(a,L,R,key);
        quickSort(a,L,k-1);
        quickSort(a,k,R);

    }
    public static int partition(int[] a, int L, int R, int key){
        int iL=L;
        int iR=R;
        while (iL<=iR){
            while (a[iL]<key){
                iL++;
            }
            while (a[iR]>key){
                iR--;
            }
            if (iL<=iR){
                int temp=a[iL];
                a[iL]=a[iR];
                a[iR]=temp;
                iL++; iR--;
            }
        }
        return iL;
    }

}
