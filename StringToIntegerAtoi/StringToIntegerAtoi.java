import java.io.*;
import java.util.*;

class StringToIntegerAtoi {
    // Implement your solution by completing the below function
    public int myAtoi(String str) {
        
        int n = str.length();
        // System.out.println(n);
        if(n == 0)
            return 0;
        int pre = 0;
        int ind = 0;
        int ans = 0;
        while(ind < n) {
            System.out.print(str.charAt(ind));
            if(str.charAt(ind) == ' ' || str.charAt(ind) == '\t') {
                ind++;
            }
            else if(str.charAt(0) == '-') {
                pre = -1;
                ind++;
            } else if(str.charAt(0) == '+') {
                pre = 1;
                ind++;
            }
            else {
                ans = ans * 10;
                ans += (str.charAt(ind) - '0');
                System.out.println(" " + ans);
                ind++;
            }
            
        }
        if(pre == 0)
            return ans;
        return ans*pre;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        int result = new StringToIntegerAtoi().myAtoi(str);
        System.out.println(result);
    }
}
