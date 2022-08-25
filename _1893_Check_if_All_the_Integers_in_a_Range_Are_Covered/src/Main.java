public class Main {
    public static void main(String[] args) {


    }

    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] check = new boolean[51];
        int count = 0;

        int m = ranges[0].length;
        for (int i = 0; i < ranges.length; i++) {
            for (int j = left; j <= right; j++) {
                if (ranges[i][0] <= j && ranges[i][m - 1] >= j && check[j] == false) {
                    check[j] = true;
                    count++;
                }
            }
        }

        return count == right - left + 1;


    }

}

