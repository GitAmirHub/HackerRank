public class SubArrayDivision{

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//Initial attempts. Solves sample test case 2, but times out on other cases. 
static int birthday(List<Integer> s, int d, int m) {
    int count = 0;
    for (int i = 0; i < s.size(); i++){
        while (i < m){
            int sum = s.get(i);
            if (sum == d){
                count++;
                break;
            }
        }
    }
return count;
}

static int birthday(List<Integer> s, int d, int m) {
    int count = 0;
    int sum = 0;

    for(int i = 0 ; i <= (s.size() - m) ; i++){
        for(int j = 0 ; j < m ; j++){
            sum = sum + s.get(j+i);
        }
        if(sum == d){
            count++;
        }
        sum = 0;
    }
    return count;
}

public static void main(String[] args){
    
}
}