package Java.Data_Structures.Linked_List.Singlly;

public class MID_ELEMENT {
    static void find_mid(Node head){
        int count=0;
        Node temp=head, mid = head, prev_mid=head;
        while(temp.next!=null){
            if(count%2!=0) {
                prev_mid=mid;
                mid = mid.next;
            }
            count++;
            temp=temp.next;
        }
        System.out.println("Mid Element is   "+ mid.data);
        System.out.println("Previous_Mid Element is   "+ prev_mid.data);
    }
}
