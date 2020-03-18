import java.io.*;
import java.util.*;

class NumberOfIslands {

    public static void bfs(char[][] grid,int x,int y,int n) {
        int curx=x,cury=y;
        if(curx >= n-1 && cury >= n-1)
            return;
        if(curx >= n-1) {
            curx = n-1;
            if(grid[curx][cury + 1] == '0')
                return;
            if(grid[curx][cury+1] == '1')
                grid[curx][cury+1] = '2';
        }
        else if(cury >= n-1) {
            cury = n-1;
            if(grid[curx+1][cury] == '0')
                return;
            if(grid[curx+1][cury] == '1')
                grid[curx+1][cury] = '2';
        }
        else {
            if(grid[curx][cury+1] == '0' && grid[curx+1][cury] == '0') 
                return;
            if(grid[curx][cury+1] == '1')
                grid[curx][cury+1] = '2';
            if(grid[curx+1][cury] == '1')
                grid[curx+1][cury] = '2';
            bfs(grid,curx,cury+1,n);
            bfs(grid,curx+1,cury,n);
        }
    }

    // Implement your solution by completing the below function
    public int numIslands(char[][] grid) {
        int n = grid[0].length;
        int cnt = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] == '1') {
                    cnt++;
                    bfs(grid,i,j,n);
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