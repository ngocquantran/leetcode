import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a={4,1,3,15,7,52,50,57,72};
//        System.out.println(binarySearch(a,31));
//        System.out.println(binarySearch2(a,31,0,a.length));
        System.out.println(mergeSort(a,0,a.length-1));

    }
    public static int binarySearch(int[] a,int key){
        int n=a.length;
        int left=0;
        int right=n-1;

        while (left<right){
            int mid=(left+right)/2;
            if (key ==a[mid]){
                return mid;
            }
            else {
                if (key>a[mid]){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }
        }
        return -1;
    }

    public static int binarySearch2(int[] a,int key,int left, int right){
        if (left>right){
            return -1;
        }
        int mid=(left+right)/2;
        if (key==a[mid]){
            return mid;
        }
        else if(key>a[mid]){
            return binarySearch2(a,key,mid+1,right);
        }else {
            return binarySearch2(a,key,left,mid-1);
        }

    }

    public static int[] mergeSort(int[] a, int left, int right){
        if (left>right){
            return new int[0];
        }
        if (left==right){
            int[] singleElement={a[left]};
            return singleElement;
        }
        int k=(left+right)/2;
        int[] a1=mergeSort(a,left,k);
        int[] a2=mergeSort(a,k+1,right);

        int[] result=merge(a1,a2);

        System.out.println(Arrays.toString(result));

        return result;
    }

    public static int[] merge(int[] a1, int[] a2){
        int[] result=new int[a1.length+a2.length];
        int m=0,n=0,index=0;
        while (m< a1.length && n <a2.length){
            if (a1[m]<=a2[n]){
                result[index]=a1[m];
                index++;m++;
            }else {
                result[index]=a2[n];
                index++;n++;
            }
        }
        while (m<a1.length){
            result[index]=a1[m];
            index++;m++;
        }
        while (n<a2.length){
            result[index]=a2[n];
            index++;n++;
        }
        return result;
    }
}
