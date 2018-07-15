package Java.other;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayUpdate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayUpdate au=new ArrayUpdate();
        System.out.println("Array Count = ");
        int n= s.nextInt();
        System.out.println("Queries Count: ");
        int count=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("The Array is  "+Arrays.toString(arr));

        while(count>0){
            System.out.println("Reaming queries "+count+"    Query Values: " );
            int way=s.nextInt();
            if(way==1){
                int key=s.nextInt();
                System.out.println(count+" ) position "+au.search(key,arr,n));
            }
           else if(way==0){
                int pos=s.nextInt()-1;
                int val=s.nextInt();
               arr= au.update(pos,val,arr,n);
               System.out.println(count+" ) "+Arrays.toString(arr));
            }
            count--;
        }


    }
    int search(int key,int arr[],int n){
        for(int i=0;i<n;i++){
            if(key<=arr[i]){
                return i+1;
            }
        }
        return -1;
    }
    int[] update(int pos,int val,int arr[],int n){
        if(pos<n){
            arr[pos]=val;
        }
        return arr;
    }

}
