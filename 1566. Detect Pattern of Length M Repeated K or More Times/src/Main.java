public class Main {
    public static void main(String[] args) {
        int[] arr ={1,2,1,2,1,3};
        int m=2, k=3;

        System.out.println(containsPattern(arr,m,k));

    }
    public static boolean containsPattern(int[] arr, int m, int k) {
        for (int i=0;i<arr.length;i++){
            System.out.println("i: "+i);
            int subStart=i+m;
            System.out.println("substart: "+subStart);
            int count=1;
            while (subStart<arr.length){
                boolean isOk=true;
                for (int j=0;j<m;j++){
                    System.out.println("arr[j]: "+arr[i+j]+" arr[j+m] "+arr[subStart+j]);
                    if (arr[i+j]!=arr[subStart+j]){
                        isOk=false;
                        break;
                    }
                }
                System.out.println("ok: "+isOk);
                if (isOk){
                    count++;
                    subStart+=m;
                }else {
                    subStart=arr.length;
                }
                System.out.println("count: "+count);
            }
            if (count>=k) return true;

        }
        return false;

    }
}
