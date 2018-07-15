package Java.Zoho_Prep;

import java.util.*;

public class String_Premutation {
int count=0;
    public static void main(String[] args) {
        String_Premutation sp = new String_Premutation();
        Scanner sc = new Scanner(System.in);
        TreeSet<String> ts = new TreeSet<String>();
        System.out.println("Enter String to Be Pre-muted...");
        String data = sc.nextLine();
        ts=sp.premute(data,0,data.length()-1,ts);
        System.out.println(ts.toString());
    }
   TreeSet premute(String val, int start, int end,TreeSet ts){
        if(start==end){
            ts.add(val);
            count++;
            System.out.println(count+" )--> "+val);
        }
        else{
            for (int i=start;i<=end;i++){
                val=swap(val,start,i);
                premute(val,start+1,end,ts);
                val=swap(val,start,i);
            }
        }
        return ts;
    }
    String swap(String a , int i, int j){
       StringBuilder sb = new StringBuilder(a);
        String tt = sb.substring(i,i+1);
        sb.replace(i,i+1,sb.substring(j,j+1));
        sb.replace(j,j+1,tt);
        return sb.toString();
    }
}
