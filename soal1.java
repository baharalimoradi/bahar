import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Email : ");
        String email = input.next();
        int f = 0, t = 0, count = 0;

        // ==============<< آدرس ایمیل نباید با ارقام یا _شروع شود >>===============//

        if (email.charAt(0) >= '0' && email.charAt(0) <= '9' || email.charAt(0) == '_') {
            f++;
        } else {
            t++;
        }
        // ======================<< کاراکتر (@) قبل از (.)بیای>>=====================//

        if (email.indexOf('@') < email.indexOf('.')) {
            t++;
        } else {
            f++;
        }

        // =============<< بعد از کاراکتر نقطه حداکثر سه حرف نوشته شود>>===========//

        String[] parts = email.split("\\.");

        if (parts[parts.length - 1].length() <= 3) {
            t++;
        } else {
            f++;
        }

        // ====================<< حروف باید شامل حروف کوچک باشد >>==================//

        char[] arr = parts[1].toCharArray();

        for (char temp : arr) {

            if (temp >= 'a' && temp <= 'z') {
                count++;
            }
        }

        if (count == parts[parts.length - 1].length()) {
            t++;
        } else {
            f++;
        }

        // ===========================================================================//

        if (t == 4) {
            System.out.println(true);
        } else if (f >= 1) {
            System.out.println(false);
        }

    }
}
