import java.security.PublicKey;

public class Main {

    public static void main(String[] args) {
        int[] a={9,8,2,7,1,5,3};
//        bubbleSort(a);
//        insertioniSort(a);
//        System.out.println("***************");










    }

    public static void showarr(int[] a){
        for (int i=0; i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] a){
        for (int i=0;i<a.length;i++){
            boolean issorted=true;
            for (int j=0;j< a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    issorted=false;
                    int b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;
                }
            }

            System.out.printf("%d: ",i);
            showarr(a);
            if (issorted){
                break;
            }

        }
    }

    public static void insertioniSort(int[] a){
        for (int i=1;i<a.length;i++){
//            Chèn a[i] vào dãy 0 -> i-1
            int ai=a[i];
            int j=i-1;
            while (j>=0 && a[j]>ai){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=ai;
            System.out.printf("%d: ",i);
            showarr(a);
        }
    }

    public static void selectionSort(int[] a){
        for (int i=0;i<a.length;i++){
            int minIndex=i;
            for (int j=i+1;j<a.length;j++){
                if (a[j]<a[minIndex]){
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                int b=a[i];
                a[i]=a[minIndex];
                a[minIndex]=b;
            }
            System.out.printf("%d: ",i);
            showarr(a);
        }


    }




}
