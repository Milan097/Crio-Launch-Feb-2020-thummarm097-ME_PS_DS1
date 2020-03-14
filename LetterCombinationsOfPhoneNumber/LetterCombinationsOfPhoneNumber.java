import java.io.*;
import java.util.*;
import java.lang.*;

public class LetterCombinationsOfPhoneNumber {

    // Implement your solution by completing the below function
    public static List<String> getList(char c) {
        List<String> res = null;
        switch(c) {
            case '2':
                res = Arrays.asList("a","b","c");
                break;
            case '3':
                res = Arrays.asList("d","e","f");
                break;
            case '4':
                res = Arrays.asList("g","h","i");
                break;
            case '5':
                res = Arrays.asList("j","k","l");
                break;
            case '6':
                res = Arrays.asList("m","n","o");
                break;
            case '7':
                res = Arrays.asList("p","q","r","s");
                break;
            case '8':
                res = Arrays.asList("t","u","v");
                break;
            case '9':
                res = Arrays.asList("w","x","y","z");
                break;
        }
        return res;
    }
    public static List<String> crossProduct(List<String> a, List<String> b) {
        List<String> res = new ArrayList<>();
        for(int i = 0; i < a.size(); i++) {
            for(int j = 0; j < b.size(); j++) {
                res.add(a.get(i) + b.get(j));
            }
            
        }

        return res;
    }
    public static List<String> letterCombinations(String digits) {
        List<String> res = getList(digits.charAt(0));
        for (int i = 1; i < digits.length(); i++) {
            res = crossProduct(res,getList(digits.charAt(i)));
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        List<String> combinations = letterCombinations(line);
        for (String cmbn : combinations)
            System.out.print(cmbn + " ");
    }
}