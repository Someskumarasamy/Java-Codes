package Java.Data_Structures.Tree.BST;

public class Width_Tree {
    Height_Tree h = new Height_Tree();
    protected int Width_of_Tree(Node root){
        if(root==null)
            return 0;
        int left_height=h.BST_Height(root.lchild);
        int right_height=h.BST_Height(root.rchild);
        int left_diameter=Width_of_Tree(root.lchild);
        int right_diameter=Width_of_Tree(root.rchild);
        return 1+Math.max(Math.max(left_height,right_height),left_diameter+right_diameter);

    }
}
