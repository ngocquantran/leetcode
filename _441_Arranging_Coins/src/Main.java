public class Main {
    public static void main(String[] args) {

        System.out.println(tichluy(0));
        System.out.println(tichluy(1));
        System.out.println(tichluy(2));
        System.out.println(tichluy(3));
        System.out.println(tichluy(4));


    }
    public static int arrangeCoins(int n) {
        int row=0;
        int sum=0;
        int index=3;
        while (sum<n){
            sum=tichluy(index);
            index++;
            row++;
            System.out.println("sum: "+sum);
            System.out.println("index: "+index);
            System.out.println("row: "+row);
        }
        return row;

    }

    public static int tichluy(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return tichluy(n-1)+tichluy(n-1)+1;

    }
}
