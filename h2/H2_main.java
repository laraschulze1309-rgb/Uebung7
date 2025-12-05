package h2;

import java.util.Arrays;

public class H2_main {


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



