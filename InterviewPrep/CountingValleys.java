public class CountingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleys = 0;
        int level = 0;
        int[] levelArr = new int[steps];
        for (int i = 0; i < path.length(); i++){
            char c = path.charAt(i);
            if (c == 'U'){
                level++;
                levelArr[i] = level;
            }else if (c == 'D'){
                level--;
                levelArr[i] = level;
            }
        }
        for (int j = 1; j < levelArr.length; j++){
        if (levelArr[j] == 0 && levelArr[j-1] == -1){
            valleys++;
        }
        }
        return valleys;
        }
}
