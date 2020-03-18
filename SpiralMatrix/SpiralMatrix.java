import java.io.*;
import java.util.*;

class SpiralMatrix {
    // Implement your solution by completing the below function
    public List<Integer> spiralOrder(int[][] a) {
        int i, k = 0, l = 0, m = a.length, n = a[0].length;
        List<Integer> list = new ArrayList<>();
        while (k < m && l < n) { 
            for (i = l; i < n; ++i) { 
                list.add(a[k][i]); 
            } 
            k++; 
            for (i = k; i < m; ++i) { 
                list.add(a[i][n - 1]); 
            } 
            n--; 
            if (k < m) { 
                for (i = n - 1; i >= l; --i) { 
                    list.add(a[m - 1][i]); 
                } 
                m--; 
            } 
            if (l < n) { 
                for (i = m - 1; i >= k; --i) { 
                    list.add(a[i][l]); 
                } 
                l++; 
            } 
        }  
        return list;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                matrix[i][j] = scanner.nextInt();
        scanner.close();

        List<Integer> result = new SpiralMatrix().spiralOrder(matrix);
        for (int i = 0; i < result.size(); ++i)
            System.out.printf("%d ", result.get(i));
    }
}