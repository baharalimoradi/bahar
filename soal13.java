public class soal13 {

    public static int A(int m, int n) {
        System.out.println(m + " " + n);
        if (m == 0 && n >= 0)
            return n + 1;
        if (n == 0 && m > 0)
            return A(m - 1, 1);
        if (n >= 0)
            return A(m - 1, A(m, n - 1));
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(A(5, 6));
    }
}
