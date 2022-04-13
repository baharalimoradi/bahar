import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String 1 : ");
        String string1 = input.nextLine();
        System.out.print("Enter a String 2 : ");
        String string2 = input.next();
        int t = 0, f = 0, i, j, count = 0, k = 0;

        // ======================<< هر دو رشته برابرند>>=====================//

        if (string1.compareTo(string2) == 0) {
            t++;
        } else {
            f++;
        }

        // ====================<< شامل حداقل یک رقم است>>====================//

        for (i = 0; i < string1.length(); i++) {

            if (string1.charAt(i) >= '0' && string1.charAt(i) <= '9') {
                count++;
            }
        }

        if (count >= 1) {
            t++;
        } else {
            f++;
        }

        // =================<< طول رشته از هشت کمتر نباشد >>===================//

        if (string1.length() >= 8) {
            t++;
        } else {
            f++;
        }

        // ==========<< شامل حداقل یک کاراکتر غیر حرف و رقم باشد >>============//

        for (j = 0; j < string1.length(); j++) {

            if (string1.charAt(j) >= 33 && string1.charAt(j) <= 47 || string1.charAt(j) >= 58 && string1.charAt(j) <= 64
                    ||
                    string1.charAt(j) >= 91 && string1.charAt(j) <= 96
                    || string1.charAt(j) >= 123 && string1.charAt(j) <= 126) {

                k++;
            }
        }

        if (k >= 1) {
            t++;
        } else {
            f++;
        }

        // =======================================================================//

        if (t == 4) {
            System.out.println(true);
        } else if (f >= 1) {
            System.out.println(false);
        }

    }

}
