package Java.Data_Structures.Tree.BST;

public class Tree_Add {
    Node add_tree_element(Node root,int data){
    if(root==null){
        root=new Node(data);
    }
    else{
        if(data<=root.data)
            root.lchild = add_tree_element(root.lchild,data);
        else
            root.rchild=add_tree_element(root.rchild,data);
    }
        return root;
    }
}
