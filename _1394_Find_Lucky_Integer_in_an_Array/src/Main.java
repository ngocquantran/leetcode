public class Main {
    public static void main(String[] args) {

    }
    public int findLucky(int[] arr) {
        int[] list=new int[501];
        for (Integer a:arr){
            list[a]++;
        }
        int max=-1;
        for (int i=1;i< list.length;i++){
            if (list[i]==i && i>max){
                max=i;
            }
        }
        return max;

    }
}
