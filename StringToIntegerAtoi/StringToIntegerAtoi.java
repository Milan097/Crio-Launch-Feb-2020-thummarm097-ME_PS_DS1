import java.io.*;
import java.util.*;

class StringToIntegerAtoi {
    // Implement your solution by completing the below function
    public int myAtoi(String str) {
        str.trim();
        int n = str.length();
        if(n == 0)
            return 0;
        int pre = 0;
        int ind = 0;
        if(str.charAt(0) == '-') {
            pre = -1;
            ind = 1;
        }
        else if(str.charAt(0) == '+') {
            pre = 1;
            ind = 1; 
        }
        int ans = 0;
        while(ind < n) {
            if(str.charAt(ind) == ' ')
                ind++;
            else {
                ans = ans * 10;
                ans += (str.charAt(ind) - '0');
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
