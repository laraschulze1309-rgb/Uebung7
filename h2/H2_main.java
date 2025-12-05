package h2;

import java.util.Arrays;

public class H2_main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(change(new int[]{4, 2, 8, 6}, new int[]{1, 3, 5},1,3))); 
        System.out.println(Arrays.toString(change(new int[]{4, 2, 8, 6}, new int[]{4, 2, 8, 6}, 0, 2))); 
        System.out.println(Arrays.toString(change(new int[]{4,2,8,6}, new int[]{4,2,8,6}, 3, 1))); 
    }

    public static int[] change(int[] a, int[] b, int start, int end) {
      
        if (end > start) {
          if (Arrays.compare(a, b) != 0) {
                return Arrays.copyOf(a, a.length);
            } 
            else {
                int[] sorted = Arrays.copyOf(a, a.length);
                Arrays.sort(sorted);
                return Arrays.copyOfRange(sorted, start, end);
            }
        }

        return new int[0];
    }
}



