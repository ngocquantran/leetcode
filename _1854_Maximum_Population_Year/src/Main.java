public class Main {
    public static void main(String[] args) {

    }
    public int maximumPopulation(int[][] logs) {
        int[] list=new int[2050];
        for (int i=0;i< logs.length;i++){
            int age=logs[i][0];
            while (age<logs[i][1]){
                list[age]++;
                age++;
            }
        }
        int max=list[0];
        int year=1950;
        for(int i=1;i< list.length;i++){
            if(list[i]>max){
                max=list[i];
                year=i;
            }
        }

        return year;

    }

}
