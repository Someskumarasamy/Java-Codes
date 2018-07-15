package Java.Data_Structures.Linked_List.Singlly;

public class CreateList{
    Node head,temp;
    void addNode(int d){
        if(head==null){
            head = new Node(d);
            temp=head;
        }
        else{
            while(temp.next != null){
                temp=temp.next;
            }
            Node newnode = new Node(d);
            temp.next=newnode;
            newnode.next=null;
        }
    }
    void addNode(int d, int pos)throws Exception{
        if(head == null && pos>1) {
            System.out.println("Oops no node in begining");

        }
        else if(head ==null && pos==1){
            addNode(d);
        }
        else if(head!=null && pos==1){
            Node newnode = new Node(d);
            newnode.next = head;
            head= newnode;
        }
        else{
            Node add = head;
            while(temp.next!=null && pos-2>0){
                add = add.next;
                pos--;
            }
            Node newnode = new Node(d);
            newnode.next = add.next;
            add.next = newnode;
        }
    }
int nnxt=0,nxt=0;
    void display(){
        Node dis = head;
        while(dis!=null){
            System.out.print(dis.data+" -> ");
            dis=dis.next;
            nxt++;

        }
        dis=head;
        while(dis.next!=null){
          nnxt++;
            dis=dis.next;
        }
        System.out.print("null");
        System.out.println("not-Next "+nxt+" next "+nnxt);
        MID_ELEMENT.find_mid(head);
        Reverse_List rl = new Reverse_List();
        rl.reverse(head);
    }
}
