public class Main {
    public static void main(String[] args) {

    }
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum=0;
        int result=0;
        for (int i=0;i<distance.length;i++){
            sum+=distance[i];
            if (i>=Math.min(start,destination) && i<Math.max(start,destination)){
                result+=distance[i];
            }
        }
        return Math.min(result,sum-result);


    }
}
