import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class DivisibleSumPairs {   


//10/20 test cases passed. 
//mistake on the if statement. Old if was ar[i] < ar[j]
    static int divisibleSumPairs(int n, int k, int[] ar) {
    int sum = 0;
    int count = 0;
    
    for (int i = 0; i < ar.length; i++){
        for (int j = 0; j < ar.length; j++){
            if (i < j){
                sum = ar[i] + ar[j];
                if (sum % k == 0){
                    count++;
                }
            }
        }
    }
    return count;

}
}
