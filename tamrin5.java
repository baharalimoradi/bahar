import java.util.Scanner;

public class tamrin5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number :");
        int number = input.nextInt();
        System.out.print("enter a based :");
        int based = input.nextInt();
        int rem = 0, sum = 0, rems = 0, i=0 , j;
        int[] arr = new int[100];

        while (number != 0) {

            rem = number % 10;
            sum += rem;
            number /= 10;

        }

        while (sum != 0) {

            rems = sum % based;
            arr[i] = rems; 
            i++;
            sum /= based;

        }

        System.out.print("output : ");

        for(j = i-1; j >= 0; j--){

            System.out.print(arr[j]);
        }
       
    }
}
