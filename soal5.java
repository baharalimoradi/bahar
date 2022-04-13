public class soal5 {

    public static int f(String string) {
        String[] strings = string.toLowerCase().split(" ");
        int n = 0;
        for (String s : strings)
            if (!s.contains("a") && !s.contains("e") && !s.contains("i") && !s.contains("o") && !s.contains("u"))
                n++;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(f("fez or day"));
        System.out.println(f("day fyyyz"));
        System.out.println(f("HI YOU"));
    }
}
