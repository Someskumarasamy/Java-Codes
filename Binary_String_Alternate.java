package Java.Expanion.Module_II;

import java.util.Scanner;

public class Binary_String_Alternate {
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);
        String s = m.nextLine();

        int result = 0;
        for (int i=0; i<(s.length()-1); i++)
            if (s.charAt(i) == s.charAt(i+1))
                result++;

        System.out.println(result);
    }
}
