import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,1};
        int n=2;
        System.out.println(canPlaceFlowers(flowerbed,n));


    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean isZezo= flowerbed[0]==0;

        int count=0;
        for (int i=0;i< flowerbed.length;i++){
            System.out.println("i= "+i);

            if(flowerbed[i]==0 && isZezo){
                if (i< flowerbed.length-1 && flowerbed[i+1]==0){
                    System.out.println(flowerbed[i-1]+" "+flowerbed[i]+" "+flowerbed[i+1]);
                    count++;
                    flowerbed[i]=1;
                    isZezo=flowerbed[i+1]==0;
                    i++;
                }else if (i== flowerbed.length-1){
                    count++;
                }
            }else isZezo=flowerbed[i]==0;
            System.out.println("count= "+count);
            System.out.println();
        }

        return (count>=n);

    }
}
