import java.io.*;
import java.util.*;
class TrappingRainWater {

    // complete the below function implementation
    public int trap(int[] height) {
        int res = 0;
        int n = height.length;
        for (int i = 0;i < n;i++){
            int leftMax = 0, rightMax = 0;
            for (int k = i; k >= 0; k--){
                leftMax = Math.max(leftMax, height[k]);
            }
            for (int j = i; j < n; j++){
                rightMax = Math.max(rightMax, height[j]);
            }
            res += Math.min(leftMax, rightMax) - height[i];
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
