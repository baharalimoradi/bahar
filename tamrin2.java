import java.util.Scanner;

public class tamrin2 {

    public static void main(String[] args) {
        
        System.out.print("enter a number :");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }

        System.out.println();
        System.out.println("<< ============================================================================== >>");
        System.out.println();

        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }

        System.out.println();
        System.out.println("<< ============================================================================== >>");
        System.out.println();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print("");
            }

            for (int b = i; b <= number; b++) {
                if (b == number || b == i || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.print("\n");

        }

        System.out.println();
        System.out.println("<< ============================================================================== >>");
        System.out.println();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }

            for (int b = 0; b <= i; b++) {
                System.out.print("* ");
            }

            System.out.print("\n");

        }

        System.out.println();
        System.out.println("<< ============================================================================== >>");
        System.out.println();

        for (int i = number; i >= 0 ; i--) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }

            for (int b = 0; b < i; b++) {
                System.out.print("* ");
            }

            System.out.print("\n");

        }

        System.out.println();
        System.out.println("<< ============================================================================== >>");
        System.out.println();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == number - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("<< ============================================================================== >>");
        System.out.println();
    }

}
