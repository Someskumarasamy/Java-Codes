package Java.Data_Structures.Tree.BST;

public class Display_Tree {
    void disp_in(Node a){
        if(a!=null) {
            disp_in(a.lchild);
            System.out.print(a.data+" ");
            disp_in(a.rchild);
        }
    }
    void disp_po(Node a){
        if(a!=null) {
            disp_po(a.lchild);
            disp_po(a.rchild);
            System.out.print(a.data+" ");

        }
    }
    void disp_pre(Node a){
        if(a!=null) {
            System.out.print(a.data+" ");
            disp_pre(a.lchild);
            disp_pre(a.rchild);
        }
    }

}
