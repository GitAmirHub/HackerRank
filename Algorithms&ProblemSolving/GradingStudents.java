import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> ls = new ArrayList();
    for (int i = 0; i < grades.size(); i++){
    int x = grades.get(i);
     if (x >= 38){
         if ((x + 5 - x % 5)- x < 3){
             ls.add(x + 5 - x % 5);
         }else{
             ls.add(x);
         }
     }else{
         ls.add(x);
     }  
    }
    return ls;
    }

}