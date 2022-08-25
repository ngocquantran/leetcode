import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;
        merge5(nums1,m,nums2,n);

    }

    public static void merge5(int[] nums1, int m, int[] nums2, int n){
        while (m>0 && n>0){
            if (nums1[m-1]>nums2[n-1]){
                nums1[m+n-1]=nums1[m-1];
                m--;
            }else {
                nums1[m+n-1]=nums2[n-1];
                n--;
            }
        }
        while (n>0){
            nums1[m+n-1]=nums2[n-1];
            n--;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

                for (int i = 0; i < n; i++) {
                    nums1[m + i] = nums2[i];
                }
                boolean isSorted=true;
                for (int i = 0; i < nums1.length; i++) {
                    for (int j = 0; j < nums1.length-1; j++) {
                        if (nums1[j] > nums1[j+1]) {
                            isSorted=false;
                            int a = nums1[j];
                            nums1[j] = nums1[j+1];
                            nums1[j+1] = a;
                        }
                    }
                    if (isSorted){
                        break;
                    }
                }
                System.out.println(Arrays.toString(nums1));

    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n){
        for (int i=0;i<n;i++){
            int found=0;
            for (int j=0;j<m;j++){
                if (nums2[i]<nums1[j]){
                    found++;
                    moveRightWithM(nums1,j,m);
                    nums1[j]=nums2[i];
                    break;
                }

            }
            if (found<1){
                nums1[m]=nums2[i];}

        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void moveRight(int[] arr,int index){
        for (int i= arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
    }
    public static void moveRightWithM(int[] arr,int index,int m){
        for (int i=m;i>index;i--){
            arr[i]=arr[i-1];
        }
    }









}
