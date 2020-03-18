import java.io.*;
import java.util.*;
class TrappingRainWater {

    // complete the below function implementation
    public int trap(int[] height) {
        if (height.length < 3) return 0;
        
        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while (i < j) {
            int leftHeight = height[i];
            int rightHeight = height[j];
            if (leftHeight <= rightHeight) {
                i++;
                while (i < j && height[i] <= leftHeight) {
                    res += leftHeight - height[i];
                    i++;
                }
            } else {
                j--;
                while (i < j && height[j] <= rightHeight) {
                    res += rightHeight - height[j];
                    j--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int height[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            height[i] = scanner.nextInt();
        }
        scanner.close();
        int result = new TrappingRainWater().trap(height);
        System.out.println(result);
    }
}
