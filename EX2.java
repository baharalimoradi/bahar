import java.util.*;
public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [5], k;
        
        for(int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();
        
        k = sc.nextInt();
        
        System.out.println(Arrays.toString(EX2(arr, k)));
    }

    public static int[] EX2(int arr1[], int k){
        int arr2[] = new int [5];
        String arr3[] = new String [5];
        int b = Binary(k);
        
        for(int i = 0; i < 5; i++){
            arr2[i] = Binary(arr1[i]);
        }
        
        for(int i = 0; i < 5; i++){
            arr2[i] = XOR(Integer.toString(b), Integer.toString(arr2[i]));
        }
        
        for(int i = 0; i < 5; i++){
            arr2[i] = Decimal(arr2[i]);
        }
        
        return arr2;
    }
    
    public static int XOR(String firstBinary, String secondBinary){
        String xor = "", tmp = "";		
        if(firstBinary.length() > secondBinary.length()){
            for(int i = 0; i < firstBinary.length() - secondBinary.length(); i++)
                tmp += "0";
            secondBinary = tmp + secondBinary;
        }
        
        else if(secondBinary.length() > firstBinary.length()){
            for(int i = 0; i < secondBinary.length() - firstBinary.length(); i++)
                tmp += "0";
            firstBinary = tmp + firstBinary;
        }
        
        for(int i = 0; i < firstBinary.length(); i++){
            xor += firstBinary.charAt(i) ^ secondBinary.charAt(i);
        }

        return Integer.parseInt(xor);
    }
    
    public static int Binary(int n){
        int bin = 0, count = 0, tmp;
      
        while (n != 0) {
            tmp = n % 2;
            bin += tmp * Math.pow(10, count);
            n /= 2;
            count++;
        }
  
        return bin;
    }
    
    public static int Decimal(int n){
        int dec = 0, count = 0, tmp;
      
        while (n != 0) {
            tmp = n % 10;
            dec += tmp * Math.pow(2, count);
            n /= 10;
            count++;
        }
  
        return dec;
    }
}
