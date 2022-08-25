public class Main {
    public static void main(String[] args) {
        int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};

        System.out.println(islandPerimeter(grid));

    }

    public static int islandPerimeter(int[][] grid) {
        int result=0;
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]==1){
                    result+=4;
                    if (i<grid.length-1 && grid[i+1][j]==1){
                        result-=2;
                    }
                    if (j<grid[0].length-1 && grid[i][j+1]==1){
                        result-=2;
                    }
                }
            }
        }
        return result;
    }
    public static int islandPerimeter2(int[][] grid) {
        int result=0;
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                result+=getOnegrid(i,j,grid);
            }
        }
        return result;
    }
    public static int getOnegrid(int i,int j,int[][] grid){
        int result=0;
        if (grid[i][j]==1){
            if (j-1>=0){
                if (grid[i][j-1]==0){
                    result++;
                }
            }else result++;
            if (j+1<=grid[0].length-1){
                if (grid[i][j+1]==0){
                    result++;
                }
            }else result++;
            if (i-1>=0){
                if (grid[i-1][j]==0){
                    result++;
                }
            }else result++;
            if (i+1<=grid.length-1){
                if (grid[i+1][j]==0){
                    result++;
                }
            }else result++;
        }
        return result;

    }
}
