import java.io.*;
import java.util.*;

class NumberOfIslands {

    static class GetAxis {
        static int[] xAxis = { 1, 0, -1, 0 };
        static int[] yAxis = { 0, 1, 0, -1 };
    }

    public void bfs(int i,int j,char arr[][]){
	    arr[i][j] = '0';
	    for(int k=0;k<4;k++){
	        int x = i + GetAxis.xAxis[k];
	        int y = j + GetAxis.yAxis[k];
	        
	        if(x<0 || x>=arr.length || y<0 || y>= arr[0].length)
	            continue;
	        if(arr[x][y] == '1')
                bfs(x,y,arr);
	    }
	}

    // Implement your solution by completing the below function
    public int numIslands(char[][] grid) {
        int n = grid[0].length;
        int m = grid.length;
        if(m == 0 || n == 0)
            return 0; 
        int cnt = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] == '1') {
                    cnt++;
                    bfs(i,j,grid);
                }
            }
        } 
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        char[][] grid = new char[rows][columns];

        for (int i = 0; i < rows; ++i) {
            String s = scanner.next();
            for (int j = 0; j < columns; ++j) {
                grid[i][j] = s.charAt(j);
            }
        }
        scanner.close();
        int result = new NumberOfIslands().numIslands(grid);
        System.out.println(result);
    }
}