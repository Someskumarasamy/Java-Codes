package Java.Expanion.Module_II;

import java.util.Scanner;

public class String_Encoding {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String -->  ");
        String str = s.nextLine();
        System.out.println();
        int count = 1;
        String op = "", as = "";
        int n = str.length();
        System.out.println("Length of the String is -->"+n);
        for (int i = 0; i < n; i++) {
            int h=i; //only to print;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            as = "";
            if (count > 1) {
                as = "" + count;
            }
            op += str.charAt(i) + as;
            count = 1;
            // write your code here
            System.out.println("Current iteration intial ["+h+"]  final ["+i+"] -->"+op);
        }
        System.out.println("*******************************************\nFinal encoded word --> " + op+"\n length --> "+op.length());
    }
}
