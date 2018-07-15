package Java.Data_Structures.Tree.BST;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Tree_Main {
    public static void main(String[] args) {
        Tree_Add a = new Tree_Add();
        Height_Tree h = new Height_Tree();
        Width_Tree w = new Width_Tree();
        Display_Tree disp = new Display_Tree();
        Scanner s = new Scanner(System.in);
        Node root=null;
        while (true) {
            System.out.println("Enter tree element");
            int data = s.nextInt();
            if(data>0) {
                root = a.add_tree_element(root, data);
                System.out.print("In-Order : ");
                disp.disp_in(root);
                System.out.println();
                System.out.println("HEIGHT__________________  " + h.BST_Height(root));
                System.out.println("DIAMETER________________" + w.Width_of_Tree(root));
            }
           Diagonal_Print dp = new Diagonal_Print(root);
            System.out.println("Tree_Ended");
        }
    }
}
