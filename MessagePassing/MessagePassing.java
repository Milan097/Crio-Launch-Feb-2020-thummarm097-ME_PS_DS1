import java.io.*;
import java.util.*;

class MessagePassing  {

  // Complete the below function implementation
  // Print "Yes" for success and "No" for Failure
  public void messagePassTest(int n, int s, int p, int[][] matrix) {
    if(n == 1 && s >= 1) {
      System.out.println("Yes");
      return;
    }
    int i, k = 0, l = 0, m = n;
    int st = s;
    while (k < m && l < n) { 
      for (i = l; i < n; ++i) {  
        st--;
        if(st <= 0) {
          System.out.println("No");
          return;
        }
        st = Math.max(st,matrix[k][i]);
      } 
      k++; 
      for (i = k; i < m; ++i) { 
        st--;
        if(st <= 0) {
          System.out.println("No");
          return;
        }
        st = Math.max(st,matrix[i][n-1]);
      } 
      n--; 
      if (k < m) { 
        for (i = n - 1; i >= l; --i) {  
          st--;
          if(st <= 0) {
            System.out.println("No");
            return;
          }
          st = Math.max(st,matrix[m - 1][i]);  
        } 
        m--; 
      } 
      if (l < n) { 
        for (i = m - 1; i >= k; --i) {  
          st--;
          if(st <= 0) {
            System.out.println("No");
            return;
          }
          st = Math.max(st,matrix[i][l]); 
        } 
        l++; 
      } 
    }  
    System.out.println("Yes");
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int s = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] matrix = new int[n][n];

    for(int i = 0 ; i < m ; ++i) {
        int x , y , p;
        x = scanner.nextInt();
        y = scanner.nextInt();
        p = scanner.nextInt();
        matrix[x][y] = Math.max(p, matrix[x][y]);
    }
    scanner.close();
    new MessagePassing().messagePassTest(n,s,m,matrix);
  }
}
