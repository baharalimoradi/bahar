public class soal7 {

    public static int count(String string, char c) {
        int n = 0;
        for (int i = 0; i < string.length(); i++)
            if (string.charAt(i) == c)
                n++;
        return n;
    }

    public static boolean f(String string1, String string2) {
        string1 = string1.replace(" ", "").toLowerCase();
        string2 = string2.replace(" ", "").toLowerCase();
        for (int i = 0; i < string1.length(); i++)
            if (count(string1, string1.charAt(i)) != count(string2, string1.charAt(i)))
                return false;
        for (int i = 0; i < string2.length(); i++)
            if (count(string1, string2.charAt(i)) != count(string2, string2.charAt(i)))
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(f("Partial Men", "Parliament"));
    }
}
