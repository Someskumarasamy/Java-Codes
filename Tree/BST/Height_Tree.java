package Java.Data_Structures.Tree.BST;

public class Height_Tree {
   protected int BST_Height(Node root){
        if(root==null)
            return 0;
        return 1+Math.max(BST_Height(root.lchild),BST_Height(root.rchild));

    }

}
