package Java.Expanion.Module_II;

public class String_Decoding {
    public static void main(String[] args) {
        String str = "a12br3";
        String ch = "";
        int n = str.length(),k=0;
        System.out.println("Input String Length -->"+n);
        for(int i=0;i<n;i++){
            System.out.println("Input_Character --> "+str.charAt(i));
            if(str.charAt(i)<='9' && str.charAt(i)>='0'){
                char t = str.charAt(i-1);
                 k=(int)str.charAt(i)-48;
                 for(int j=i+1 ; j<str.length();j++) {
                    if (str.charAt(j) <= '9' && str.charAt(j) >= 0) {
                        k *= 10;
                        k += ((int) str.charAt(i + 1) - 48);
                        i++;
                    }
                    else{
                        break;
                    }
                }
                System.out.println("Character Count ->"+k);
                while(k-1>0){
                    ch=ch+t;
                    k--;
                }

            }
            else{
                ch=ch+str.charAt(i);
            }
            System.out.println("OutPut_String --> "+ch);
            System.out.println("OutPutStringLength --> "+ch.length());
        }
        System.out.println("************************************\nFinal_String --> "+ch+"\n*********************");
    }
}
