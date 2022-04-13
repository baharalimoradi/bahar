import java.util.Scanner;

public class soal9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Namber  :");
        int number = input.nextInt();
        int i = 1;

        reverse(number , i);

    }

    static void reverse (int number , int i ) {

        if(number >= i)
        {
            System.out.print(i + "  ");
            reverse(number, i + 1);
        }
    }

}
