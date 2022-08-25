import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] heights={1,5,9,3,4,6,2};
        int[] expected=new int[heights.length];
        System.arraycopy(heights,0,expected,0,heights.length);
        for (int i=0;i<heights.length;i++){
            expected[i]=heights[i];
        }
        System.out.println(Arrays.toString(expected));
        Arrays.sort(expected);

        int found=0;
        for (int i=0;i<heights.length;i++){
            if (heights[i]!=expected[i]){
                found++;
            }
        }

    }
    public static int heightChecker(int[] heights) {
        int[] expected=mergeSort(heights,0,heights.length-1);
        int found=0;
        for (int i=0;i<heights.length;i++){
            if (heights[i]!=expected[i]){
                found++;
            }

        }
        return found;
    }
    public static int[] mergeSort(int[] a, int L, int R){
        if (L>R){
            return new int[0];
        }
        if (L==R){
            int[] singleElement={a[L]};
            return singleElement;
        }
        int k=(L+R)/2;
        System.out.println("Chia: "+L+" - "+R);
        int[] a1=mergeSort(a,L,k);
        int[] a2=mergeSort(a,k+1,R);

//        Trộn 2 mảng đã sắp xếp
        int n=a1.length+a2.length;
        int[] result=new int[n];

        int i=0, i1=0, i2=0;
        while (i<n){
            if (i1<a1.length && i2<a2.length){
                if (a1[i1]<=a2[i2]){
                    result[i]=a1[i1];
                    i++;
                    i1++;
                }else {
                    result[i]=a2[i2];
                    i++;
                    i2++;
                }
            }else{
                if (i1<a1.length){
                    result[i]=a1[i1];
                    i++;
                    i1++;
                }else {
                    result[i]=a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return result;


    }
}
