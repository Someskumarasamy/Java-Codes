package Java.Data_Structures.Linked_List.Singlly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        CreateList cl=new CreateList();
        MID_ELEMENT mid = new MID_ELEMENT();
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("Data : ");
            int data = scanner.nextInt();
            if(data!=0) {
                System.out.println("Position 1 end 2 pos : ");
                int op = scanner.nextInt();
                switch(op) {
                    case 1 :
                    cl.addNode(data);
                    break;
                    case 2:
                        System.out.println("Position : ");
                        int pos = scanner.nextInt();
                        cl.addNode(data,pos);

                }
            }
            else{
                break;
            }
        }
        cl.display();

    }
}
