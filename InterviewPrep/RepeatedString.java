public class RepeatedString {
    static long repeatedString(String s, long n) {
        int count = 0;
        long suba = 0;
        long repeats = n / s.length();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 'a'){
                suba++;
        }
    }
    long total = suba * repeats;
    long remain = n % s.length();
    for (int j = 0; j < remain; j++){
        if (s.charAt(j) == 'a'){
            total++;
        }
    }
    return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
