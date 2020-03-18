import java.io.*;
import java.util.*;

public class ValidParenthesis {
    // Implement your solution by completing the below function
  public boolean isValid(String s) {
    int n = s.length();
    Stack<Character> ss = new Stack<>();
    //int cnt = 0;
    for(int i=0;i<n;i++) {
      if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
        ss.push(s.charAt(i));
      } else {
        char t1 = ss.pop();
        char t2 = s.charAt(i);
        if((t1 == '(' && t2 == ')') || (t1 == '{' && t2 == '}') || (t1 == '[' && t2 == ']')) {
        } else {
          return false;
        }
      }
    }
    if(ss.size() == 0)
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
