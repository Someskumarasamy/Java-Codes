package Java.Expanion.Module_II;

import java.util.Scanner;

public class Count_CharPairs_Same_Distance {

    public static void main(String args[]){
        Scanner m = new Scanner(System.in);
        String str = m.nextLine();
        int result = 0;
        int n = str.length();
        for (int i = 0 ; i < n ; i++)
            for (int j = i+1; j < n ; j++)
                if (Math.abs(str.charAt(i) - str.charAt(j)) == Math.abs(i-j))
                    result++;

        System.out.println(result);
    }
}
