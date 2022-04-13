import java.util.Scanner;

public class soal12 {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Namber 1 :");
        int number1 = input.nextInt();
        System.out.print("Enter a Namber 2 :");
        int number2 = input.nextInt();
        
       System.out.print("BMM = " + BMM(number1 , number2));

    }

    public static int BMM (int number1 , int  number2 ){

          if (number1 % number2 == 0)
        { 
            return number2;
        }
        else
        {
            return BMM(number2 , number1 % number2);
        }
         
    }

 
}
