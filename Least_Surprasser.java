package Java.Expanion.Module_II;

import java.util.Scanner;

/*
Given integer array, replace every element with least greatest element on the right.
If there are no greater number, then place the same number.

Input:    [10, 12, 5, 40, 21, 70, 1, 49, 37]
Output:   [12, 21, 21, 49, 37, 70, 37, 49, 37]

Given integer array,
return new array where each element is replaced with the count of number of elements
 which are greater towards it right

Input:          	[10, 12, 5, 40, 21, 70, 1, 49, 37]
Output:      	[6, 5, 5, 3, 3, 0, 2, 0, 0]

*/
public class Least_Surprasser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Array count -->  ");
        int n = s.nextInt();
        System.out.println();
        int arr[]=new int[n];
        System.out.print("Array elements -->  ");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            int count=0;
            int a=arr[i];
            int b=arr[i];
            //Find greatest right value.
            for(int k=i+1;k<arr.length;k++){
                if(arr[k]>arr[i]){
                    b=arr[k];
                    break;
                }
            }
            //********************Surprasser count only********************************//
            for(int jj=i+1;jj<arr.length;jj++){
                if(a<arr[jj])
                {count++;}
            }
            System.out.println("Surprasser count for  "+arr[i]+" --> "+count);
            //*******************************************************************************//
            for(int j=i+1;j<arr.length;j++){
                //Find value which is lesser than greatest value and greater than i'th value.
                if(a<arr[j] && b>arr[j]){
                    b=arr[j];
                }
            }
            if(arr[i]!=b)//replace with current value.
                arr[i]=b;
        }
        System.out.println("Surprasser count for  "+arr[n-1]+" --> 0");
        System.out.print( "Final surprassed array  ->");
        for (int i=0;i<n;i++){
            System.out.print( " "+arr[i]);
        }
        System.out.println();

    }
}
