import java.util.Scanner;

public class soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String string = input.nextLine();
        string = string.replaceAll(" ", "");
        int max = Integer.MIN_VALUE;
        int j, temp ,rem = 0, count = 0, a = 0;

        for(int i = 0; i < string.length(); i++){
            if(Character.isDigit(string.charAt(i))){
                j = i;
                temp = 0;
                
                while (Character.isDigit(string.charAt(j))){
                    temp = temp * 10 + (string.charAt(j) - '0');
                    j++;
                    if(temp > max)
                    {
                         max = temp;
                    }
                   
                }
                   
                i = j;
                
            }
        }
         
        while (max > 0 ){
            rem = max % 10;
            count += rem * (Math.pow(2 , a));
            a++;
            max = max / 10;
        }
            
        
        System.out.print("is equal to = " + count);
    }
}
