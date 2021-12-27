package UAP;
//Nama : Ferdhy Ihza Armanda
//NIM  : 205150401111011
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Nomor1 {
    //DILARANG MENGUBAH BAGIAN INI
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jmlDesc = scan.nextInt();
        Tree<Integer> tree = new Tree<>();
        LinkedList<Integer> temp = new LinkedList<>();
        int count = 0;
        for (int i=0; i < jmlDesc; i++) {
            int a = scan.nextInt();
            temp.addLast(a);
            if(tree.isEmpty()){
                tree = new Tree(a);
            } else {
                int j = 0;
                boolean masuk;
                do {
                    masuk = tree.add(temp.get(j), a);
                    j++;
                } while (!masuk && j < temp.size());
            }
        }
        int t = scan.nextInt();
        System.out.println("Banyak child dari node " + t + ": " + tree.hitungChild(t));
        System.out.println("Banyak jmlDesc dari node " + t + ": " + tree.hitungDescendant(t));
    }
}

//DILARANG MENGUBAH BAGIAN INI
class Node<T> {
    T data;
    List<Node> childs;
    public Node(T data){
        this.data = data;
        childs = new LinkedList<Node>();
    }
}

class Tree<T>{
    //DILARANG MENGUBAH BAGIAN INI
    Node <T> root;
    public Tree(){
        this.root = null;
    }
    public Tree(T data){
        root = new Node<T>(data);
    }
    public Tree(Node<T> root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return root == null;
    }

    //Method untuk mencari node berdasarkan datanya. DILARANG MENGUBAH BAGIAN INI
    public Node getNode(Node<T> node, T data){
        if (node.data == data) return node;

        for(Object currNode : node.childs){
            Node<T> returnNode = getNode((Node) currNode, data);
            if(returnNode!=null) return returnNode;
        }
        return null;
    }

    public boolean add(T dataParent, T data){
        Node<T> node = getNode(root, dataParent);
        int jmlDesc = 0;
        if (node != null){
            for (Node nc : node.childs){
                jmlDesc += (int)nc.data;
            }
            if(jmlDesc < (int)node.data*2){
                node.childs.add(new Node(data));
                return true;
            }
        }
            /*Hitung jumlah data dengan melakukan looping semua
              child dari variabel node. Jika jumlahnya <= data node * 2,
            maka tambah data tersebut menjadi child dari node.

            Jika berhasil ditambahkan menjadi child, return true

            HINT: gunakan casting ke int agar tidak error
              */
        return false;
    }

    public int hitungChild(T data){
        Node node = getNode(this.root, data);
        if (node != null){
            return node.childs.size();
        } return 0;
    }

    public int hitungDescendant(T data){
        Node node = getNode(this.root, data);
        int jmlChild = node.childs.size();
        int jmlDesc = 0;
        if (node != null) {
            if (jmlChild == 0) return 0;
            else {
                jmlDesc += node.childs.size();
                for (int i=0 ; i<node.childs.size() ; i++){
                    Node cn= (Node) node.childs.get(i);
                    jmlDesc += hitungDescendant((T) cn.data);
                }
            }
        }
        return jmlDesc;
          /*Cari node berdasarkan data yang diberikan.
        Kemudian cari jumlah childnya.
        Jika jumlah childnya 0, kembalikan nilai 0.

        Jika jumlah childnya tidak 0, lakukan rekursif dari method ini
        terhadap tiap child dari node, kemudian ditambahkan ke variabel
        yang menyimpan jumlah childnya.
        Terakhir, kembalikan variabel tersebut.
        */
    }

}