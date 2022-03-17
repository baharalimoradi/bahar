import java.util.Scanner;

public class tamrin6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number :");
        int number = input.nextInt();
        System.out.print("enter a size of arr :");
        int size = input.nextInt();
        int[] arr = new int[size];
        int count = 0, i;

        for (i = 0; i < size; i++) {
            System.out.print("arr [" + i + "]:");
            arr[i] = input.nextInt();
        }    

           for (i = 0; i < size; i++) {

                if (arr[i] != number) {
                    arr[count++] = arr[i];
                }
            }

            for (i = count; i < size; i++) {
                arr[i] = number;

            }
            for (i = 0; i < size; i++) {

                System.out.print(arr[i] + " ");
            }
        

    }
}
