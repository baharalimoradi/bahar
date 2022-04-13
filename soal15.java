import java.util.Arrays;

public class soal15 {
    
    public static void f(int[] input) {
        if (input.length > 1) {
            int[] output = new int[input.length - 1];
            for (int i = 0; i < output.length; i++)
                output[i] = input[i] + input[i + 1];
            f(output);
        }
        System.out.println(Arrays.toString(input));
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        f(A);
    }
}
