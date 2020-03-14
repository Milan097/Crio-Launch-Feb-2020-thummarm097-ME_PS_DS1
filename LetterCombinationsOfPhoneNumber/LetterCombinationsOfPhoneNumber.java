import java.io.*;
import java.util.*;
import java.lang.*;

public class LetterCombinationsOfPhoneNumber {

    public static String sortString(String inputString) { 
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    }

    // Implement your solution by completing the below function
    public List<String> letterCombinations(String digits) {
        List<String> ss = new ArrayList<String>();
        String sortDigits = sortString(digits);
        List<String> cList = new ArrayList<String>();
        for(int i=0;i<sortDigits.length();i++) {
            if(sortDigits.charAt(i) == '2') 
                cList.add("abc");
            else if(sortDigits.charAt(i) == '3') 
                cList.add("def");
            else if(sortDigits.charAt(i) == '4') 
                cList.add("ghi");
            else if(sortDigits.charAt(i) == '5') 
                cList.add("jkl");
            else if(sortDigits.charAt(i) == '6') 
                cList.add("mno");
            else if(sortDigits.charAt(i) == '7') 
                cList.add("pqrs");
            else if(sortDigits.charAt(i) == '8') 
                cList.add("tuv");
            else if(sortDigits.charAt(i) == '9') 
                cList.add("wxyz");
            else;
        }

        int n = cList.size();
        int[] index = new int[n];
        for(int i=0;i<n;i++)
            index[i] = 0;

        while(true) {
            String temp = "";
            for(int i=0;i<n;i++)
                temp += cList.get(i).charAt(index[i]);
            ss.add(temp);
            
            int rightMost = n-1;
            while(rightMost >= 0 && cList.get(rightMost).length() <= (index[rightMost] + 1)){
                rightMost--;
            }
            
            if(rightMost < 0)
                break;
            index[rightMost]++;

            for(int i=rightMost+1;i<n;i++) 
                index[i] = 0;
        }
        Collections.sort(ss);
        return ss;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        List<String> combinations = new LetterCombinationsOfPhoneNumber().letterCombinations(line);
        for (String cmbn : combinations)
            System.out.print(cmbn + " ");
    }
}