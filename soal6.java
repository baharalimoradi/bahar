public class soal6 {

    public static String f(String input) {
        char[] chars = new char[input.length()];
        for (int i = 0; i < input.length(); i++)
            chars[(i + 7) % input.length()] = input.charAt(i);
        String output = "";
        for (char c : chars)
            output = output + c;
        return output;
    }

    public static void main(String[] args) {
        System.out.println(f("Hello"));
    }
}
