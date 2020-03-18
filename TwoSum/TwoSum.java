import java.io.*;
import java.util.*;

public class TwoSum {
    // Implement your solution by completing the below function	
    public int[] twoSum(int[] num, int target) {
        int i=0,j=num.length-1;
        Arrays.sort(num);
        int[] a = new int[2];
        while(i < j) {
            if(num[i] + num[j] == target) {
                a[0] = i;
                a[1] = j;
                break;
            }
            if(num[i] + num[j] < target) 
                i++;
            if(num[i] + num[j] > target)
                j--;
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
