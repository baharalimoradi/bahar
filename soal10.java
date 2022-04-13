import java.util.Scanner;

public class soal10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Namber 1 :");
        int number1 = input.nextInt();
        System.out.print("Enter a Namber 2 :");
        int number2 = input.nextInt();

      System.out.print(number1 + " ^ " + number2 + " = " + power(number1, number2));

    }

    public static int power(int number1, int number2) {
        if (number2 == 0) {
            return 1;
        } else {
            return power(number1, number2 - 1) * number1;
        }
    }
}
