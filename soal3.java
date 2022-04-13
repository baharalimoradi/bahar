import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String string =  input.nextLine();
        int i, j, count = 0;
        string = string.replaceAll(" " , string);

        for(i = 0; i < string.length();i++)
        { 

            count = 0;
            for(j = 0; j < i; j++)
            {
                 if(string.charAt(i) == string.charAt(j))
                 {
                     count = 1;
                 }

            }

            if(count == 0)
            {
                System.out.print(string.charAt(i));
            }
            
        }  

    }

}