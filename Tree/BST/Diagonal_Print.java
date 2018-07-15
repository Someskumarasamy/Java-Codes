package Java.Data_Structures.Tree.BST;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Diagonal_Print {
    public Diagonal_Print(Node root) {
        HashMap<Integer,Vector<Integer>> map=new HashMap<>();
        Print_Dia(root,map,0);
    }

   void Print_Dia(Node root, HashMap<Integer,Vector<Integer>>map,int d){
        if(root ==null)
            return;
        Vector k = map.get(d);
        if(k==null){
            k=new Vector();
            k.add(root.data);
        }
        else
            k.add(root.data);
        map.put(d,k);
        Print_Dia(root.lchild,map,d+1);
        Print_Dia(root.rchild,map,d);
        System.out.println("Diagonal_Traversal : ");
        for(Map.Entry<Integer,Vector<Integer>> entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
