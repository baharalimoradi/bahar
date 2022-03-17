import java.util.Scanner;

public class tamrin7 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter a size of arr :");
    int size = input.nextInt();
    int[] arr = new int[size];
    int i, sum = 0;
    int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

    for (i = 0; i < size; i++) {
        System.out.print("arr [" + i + "]:");
        arr[i] = input.nextInt(); 

        if (arr[i] >= 0){

            if (arr[i] > max1) {
                max1 = arr[i];
    
            }
        }
        
    
        if (arr[i] < 0)
        {
            if (arr[i] > max2) {
                max2 = arr[i];
    
            }
        }
    }
    
    
    System.out.println("number 1 = " + max1);
    System.out.println("number 2 = " + max2);

    }
}