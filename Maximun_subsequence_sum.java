package Java.Expanion.Module_II;

import java.util.Scanner;

public class Maximun_subsequence_sum {


    public static void main(String args[]){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = m.nextInt();
        }
        if(arr.length == 1){
            System.out.print(arr[n-1]);
        }
        else if(arr.length == 2){
            System.out.print(arr[0]+arr[1]);
        }
        else{
            int sum[] = new int[n];
            sum[0] = arr[0];
            sum[1] = arr[0] + arr[1];
            sum[2] = Math.max(sum[1], Math. max(arr[1] + arr[2], arr[0] + arr[2]));

            for (int i = 3; i < n; i++)
                sum[i] = Math.max(Math.max(sum[i - 1], sum[i - 2] + arr[i]),arr[i] + arr[i - 1] + sum[i - 3]);

            System.out.print(sum[n - 1]);
        }
    }
}
