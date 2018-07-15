package Java.Expanion.Module_II;

import java.util.Scanner;

public class Sum_Of_Numbers_In_String {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        int sum = 0, n = 0;
        int l = a.length() - 1, i = 0;
        while (i <= l) {
            System.out.println("Current char  "+a.charAt(i));
            if (Character.isDigit(a.charAt(i))) {
                if (n == 0) {
                    n = Character.getNumericValue(a.charAt(i));
                    System.out.println("Current n  "+n);
                }
                else {
                    System.out.println("Current n  "+a.charAt(i));
                    n = n * 10;
                    n += Character.getNumericValue(a.charAt(i));
                    System.out.println("Current n to be saved "+n);
                }
            }
            else {
                sum += n;
                n = 0;
                System.out.println("Current sum  "+sum);
            }
            i++;
        }
        System.out.println("*************************************************\nFinal Sum  "+(sum + n));
    }
}

