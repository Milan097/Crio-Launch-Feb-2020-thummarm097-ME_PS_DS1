import java.io.*;
import java.util.*;

class MergeIntervals {
    // Implement your solution by completing the below function
    public List<Pair> merge(Pair[] intervals) {
        
        Arrays.sort(intervals, new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                return Integer.compare(a.getStart(), b.getStart());
            }
        });
        List<Pair> pairs = new ArrayList<>();
        int size = 0;
        pairs.add(intervals[0]);
        for(int i = 1;i<intervals.length; i++) {
            if(intervals[i].getStart() <= pairs.get(size).getEnd() ) {
                pairs.get(size).setEnd(Math.max(pairs.get(size).getEnd(), intervals[i].getEnd()));
            } else {
                pairs.add(intervals[i]);
                size++;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Pair[] nums = new Pair[n];
        int x, y;
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            nums[i] = new Pair(x, y);
        }
        scanner.close();

        List<Pair> results = new MergeIntervals().merge(nums);
        for (int i = 0; i < results.size(); ++i)
            System.out.println(results.get(i).getStart() + " " + results.get(i).getEnd());
    }
    
    private static class Pair {
        int start;
        int end;

        public Pair(int s, int e) {
            start = s;
            end = e;        
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }    
    }
}