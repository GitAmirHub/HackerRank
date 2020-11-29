import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class JumpingOnClouds {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
    //My first implementation succeeds on first two test cases. 
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for (int i = 1; i < c.length -2; i++){
            if (i < c.length -2 && c[i+2] == 0){
                jumps++;
            }else if (c[i+1] == 0){
                jumps++;
            }
        }
    return jumps;
    }

    //Streamlined solution. 
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == 0) i++;
            jumps++;
        }
    return jumps;
    }
}
