import java.io.*;
import java.util.*;

public class TwoSum {
    // Implement your solution by completing the below function	
    public int[] twoSum(int[] num, int target) {
        int n=num.length;
        Arrays.sort(num);
        int[] a = new int[2];
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(num[i] + num[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        int target = scanner.nextInt();
        scanner.close();

        int[] complements = new TwoSum().twoSum(numbers, target);
        System.out.print(complements[0] + " " + complements[1]);
    }
}
