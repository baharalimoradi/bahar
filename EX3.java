import java.util.*;

public class EX3 {
    public static void main(String[] args) {
        int n = 0, m = 0;
        String nNumber = "", mNumber = "";
        System.out.println(EX3(n, nNumber, m, mNumber));
    }
    
    public static String EX3(int n, String nNumber, int m, String mNumber) {
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        nNumber = sc.next();
        m = sc.nextInt();
     
        int num = ConvertToDecimalFromBase_n(nNumber, n);
 
        mNumber = ConvertToBase_m(m, num);
 
        return mNumber;
    }
    
    public static int ConvertToDecimalFromBase_n(String nNumber, int n){
        int p = 1, num = 0;

        for(int i = nNumber.length() - 1; i >= 0; i--){
            if (val(nNumber.charAt(i)) >= n){
                return -1;
            }
            num += val(nNumber.charAt(i)) * p;
            p *= n;
        }

        return num;
    }
    
    public static String ConvertToBase_m(int m, int num){
        String r = "";

        while (num > 0){
            r += reVal(num % m);
            num /= m;
        }
        
        /* StringBuilder ix = new StringBuilder();        
        ix.append(r);
        return new String(ix.reverse());*/
        
        r = reverse(r);

        return r;
    }

    public static char reVal(int num){
        if (num >= 0 && num <= 9)
            return(char)(num + '0');
        else
            return(char)(num - 10 + 'A');
    }

    public static int val(char ch){
        if (ch >= '0' && ch <= '9')
            return(int)ch - '0';
        else
            return(int)ch - 'A' + 10;
    }
 
    
    public static String reverse(String str){
        char[] chArray = str.toCharArray();
        int r = chArray.length - 1;
        
        for(int i = 0; i < r; i++, r--){
            char temp = chArray[i];
            chArray[i] = chArray[r];
            chArray[r] = temp;
        }
        
        return String.valueOf(chArray);
    }
}