public class BreakingTheRecords{

static int[] breakingRecords(int[] scores) {
    int lowest = scores[0];
    int highest = scores[0];
    int lowestCount = 0;
    int highestCount = 0;
    
    for (int i = 0; i < scores.length; i++){
        if (scores[i] < lowest){
            lowest = scores[i];
            lowestCount++;
        }
        if (scores[i] > highest){
            highest = scores[i];
            highestCount++;
        }
    }
    int[] res = new int[2];
    res[0] = highestCount;
    res[1] = lowestCount;
    return res;
}
}