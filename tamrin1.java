import java.util.Scanner;

public class tamrin1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a size of arr1:");
        int size = input.nextInt();
        int[] arr1 = new int[size];
        System.out.println();
        System.out.print("<< arr 1 >>");
        System.out.println("\n");
        int i, sum = 0;

        for (i = 0; i < size; i++) {
            System.out.print("arr1 [" + i + "]:");
            arr1[i] = input.nextInt();
        }

        System.out.println();
         
        for (i = 0; i < size; i++) {
            System.out.print(arr1[i]);
            System.out.print("x^" + i);

            if (i < size - 1) {
                System.out.print(" + ");
            }

        }

        System.out.println();
        System.out.print("<<======================================================>>");
        System.out.println("\n");
        System.out.print("<< arr 2 >>");
        System.out.println("\n");

        int[] arr2 = new int[size];

        for (i = 0; i < size; i++) {
            System.out.print("arr2 [" + i + "]:");
            arr2[i] = input.nextInt();
        }

        System.out.println();

        for (i = 0; i < size; i++) {
            System.out.print(arr2[i]);
            System.out.print("x^" + i);

            if (i < size - 1) {
                System.out.print(" + ");
            }

        }

        
        System.out.println();
        System.out.print("<<======================================================>>");
        System.out.println("\n");
        System.out.print("sum = ");



        for (i = 0; i < size; i++) {

            sum = arr1[i] + arr2[i];
            System.out.print(sum);
            System.out.print("x^" + i);

            if (i < size - 1) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.print("<<======================================================>>");
        

    }

}
