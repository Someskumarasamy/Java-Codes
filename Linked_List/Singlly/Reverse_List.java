package Java.Data_Structures.Linked_List.Singlly;

public class Reverse_List {
    CreateList cl = new CreateList();
     void reverse(Node head){
        Node cur=head,prev=null,nxt=null;
        while(cur!=null){
            nxt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }
        System.out.println("REVERSED____LIST : ");
         Node dis = prev;
         while(dis!=null){
             System.out.print(dis.data+" -> ");
             dis=dis.next;
         }
         System.out.print("null");
    }
}
