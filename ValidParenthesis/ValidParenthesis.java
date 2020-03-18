import java.io.*;
import java.util.*;

public class ValidParenthesis {
    // Implement your solution by completing the below function
  public boolean isValid(String s) {
    int n = s.length();
    int cnt = 0;
    for(int i=0;i<n;i++) {
      if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
        cnt++;
      } else {
        cnt--;
      }
      if(cnt < 0)
        return false;
    }
    if(cnt == 0)
      return true;
    return false;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String parenthesis = in.readLine();
    boolean result = new ValidParenthesis().isValid(parenthesis);
    System.out.print(String.valueOf(result));
  }
}
