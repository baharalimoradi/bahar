public class soal14 {

    public static int count(String string, int i, int j, int n) {
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;
        int count = count(string, i + 1, j, n - 1) + count(string, i, j - 1, n - 1) - count(string, i + 1, j - 1, n - 2);
        if (string.charAt(i) == string.charAt(j))
            count++;
        return count;
    }

    public static int f(String string) {
        return count(string, 0, string.length() - 1, string.length());
    }

    public static void main(String[] args) {
        System.out.println(f("java"));
    }
}
