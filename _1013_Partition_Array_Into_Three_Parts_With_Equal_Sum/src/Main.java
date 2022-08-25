public class Main {
    public static void main(String[] args) {
        int[] arr= {6,1,1,13,-1,0,-10,20};
        System.out.println(canThreePartsEqualSum(arr));




    }
    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for (Integer a:arr){
            sum+=a;
        }
        System.out.println(sum);
        int sumLeft=0;
        int sumRight=0;
        int indexLeft=0;
        int indexRight=0;
        for (int i=0;i<arr.length;i++){
            sumLeft+=arr[i];
            if (sumLeft==sum/3){
                indexLeft=i;
                System.out.println(i);
                break;}
        }
        System.out.println(sumLeft);

        for (int i= arr.length-1;i>=0;i--){
            sumRight+=arr[i];
            if (sumRight==sum/3) {
                indexRight=i;
                System.out.println(i);
                break;}
        }
        System.out.println(sumRight);

        return sum-sumLeft-sumRight==sumLeft && indexLeft<indexRight-1;

    }
}
