import java.util.*;
public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        EX1(n);
    }
    
    public static void EX1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if((KMM(i, j) != i * j) && (j > i)){
                    System.out.print("(" + i + ", " + j + ")");
                    System.out.println();
                }
            }
        }
    }
    
    public static int KMM(int a, int b){
        int kmm;
        if(a<b)
            kmm = b;
        else
	    kmm = a;
	    
	while(true){
	    if(kmm % b == 0 & kmm % a == 0){
                return kmm;
	    }
	    kmm++;
	}
    }
}
