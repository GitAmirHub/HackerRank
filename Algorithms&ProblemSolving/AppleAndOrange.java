public class AppleAndOrange {
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int[] applePos = new int[apples.length];
        int[] orangePos = new int[oranges.length];
        for (int i = 0; i < apples.length; i++){
            applePos[i] = apples[i] + a;
        }
        for (int j = 0; j < oranges.length; j++){
            orangePos[j] = oranges[j] + b;
        }
        int appleHouse = 0;
        int orangeHouse = 0;
        for (int ah = 0; ah < apples.length; ah++){
            if (applePos[ah] >= s && applePos[ah] <= t) {
                appleHouse++;
            }
        }
        for (int oh = 0; oh < oranges.length; oh++){
            if (orangePos[oh] <= t && orangePos[oh] >= s ){
                orangeHouse++;
            }
        }
        System.out.println(appleHouse);
        System.out.println(orangeHouse);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
