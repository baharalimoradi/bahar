import java.util.Scanner;

public class tamrin3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number :");
        int number = input.nextInt();

         number -= 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }

            for (int b = 0; b <= i; b++) {
                System.out.print("* ");
            }

            System.out.print("\n");

        }

        for (int i = number; i >= 0 ; i--) {
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

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        for (int i = number; i >= 0; i--) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i ) {
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
