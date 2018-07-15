package Java.Expanion.Module_II;

import java.util.Scanner;

public class Array_Split_Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String -->  ");
        String str = s.nextLine();
        System.out.println();
        int n=str.length();
        System.out.println("Length of the String is -->"+n);
        String a = "";
        if(n%2!=0){
            a=""+str.charAt((n-1)/2);
            //if we change n value it affects in string length;
        }
        System.out.println("Mid Character is --> ("+a+")");
        for(int i=0;i<(n)/2;i++){
            a=(str.charAt(i))+a+(str.charAt(n-1-i));
            System.out.println("Iteration "+i+" --> " +a);
        }
        // write your code here
        System.out.println("*******************************************\nFinal rotated word --> "+a);
    }
}
