public class soal8 {
    public static String f(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int a = (int) input.charAt(i);
            if (a >= 65 && a <= 90) {
                a = a - 65;
                a = (a + 3) % 26;
                output = output + (char) (a + 65);
            } else if (a >= 97 && a <= 122) {
                a = a - 97;
                a = (a + 3) % 26;
                output = output + (char) (a + 97);
            } else {
                output = output + (char) a;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(f("Minimum"));
    }
}
