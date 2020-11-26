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
}
