import java.util.*;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [5];
        
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        EX4(arr);
    }
    
    public static void EX4(int arr[]) {
        int sum1 = 0, sum2 = 0;
        boolean flag = false;
        for(int i = 0; i < 5; i++){
            sum1 += arr[i];
            sum2 = 0;
            for (int j = i+1; j < 5; j++) {
                sum2 += arr[j];
            }
            
            if(sum1 == sum2){
                flag = true;
                break;
            }
        }
        
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
