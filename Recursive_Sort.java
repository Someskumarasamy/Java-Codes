package Java.Zoho_Prep;
//Auth : Somes Kumar K.
import java.util.Scanner;
public class Recursive_Sort {
    public static void main(String[] args) {
        Recursive_Sort rs = new Recursive_Sort();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n]; //Dynamic memory allocation;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        a=rs.recursion(a,0,n-1);
        display(a);
    }
    int[] recursion(int a[],int x,int y){
        int first= 0;
        if(x>y)
            return a;
        first=a[x];
        a[x]=a[y];
        a[y]=first;
        return recursion(a,x+1,y-1);
    }
    static  void display(int a[]){
        for(int i:a){
            System.out.print(i+" ");

        }
    }
}
