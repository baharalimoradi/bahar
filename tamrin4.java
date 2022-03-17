import java.util.Scanner;

public class tamrin4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number a scores :");
        int size = input.nextInt();
        double[] arr = new double[size];

        int i = 0;
        double sum = 0, ave = 0;
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;

        while (i < size) {
            System.out.print("arr [" + i + "]:");
            arr[i] = input.nextDouble();

            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];

            }

            if (arr[i] < min) {
                min = arr[i];
            }

            i++;

        }

        ave = sum / size;

        System.out.println("equal : " + ave);
        System.out.println("maximum : " + max);
        System.out.println("minimum : " + min);

    }

}
