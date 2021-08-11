import java.util.List;
import java.util.Arrays;


public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for (int value : list){
            if (value > max){
                secondMax = max;
                max = value;
            }else if (value > secondMax && value < max) {
				secondMax = value;
			}
        }
        int sum = max + secondMax;
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list));
    }
}
