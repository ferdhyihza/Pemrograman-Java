package Materi;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Deklarasi
class Node<T> {
    T data;
    List<Node> childs;

    public Node(T data) {
        this.data = data;
        childs = new LinkedList<Node>();
    }
}

// Deklarasi
public class Tree<T> {
    // Inisialisasi
    Node<T> root;

    public Tree(Node<T> root) {
        this.root = root;
    }

    public Tree(T data) {
        root = new Node<>(data);
    }

    // cek kosong
    public boolean isEmpty() {
        return root == null;
    }

    // Penambahan
    // method rekursif untuk mendapatkan node dengan nilai data tertentu
    private Node getNode(Node<T> node, T data) {
        if(node.data == data) return node;

        for(Object curNode : node.childs) {
            Node<T> returned = getNode((Node) curNode, data);
            if(returned != null) return returned;
        }
        return null;
    }

    // method penambahan node
    public void addNode(T parent, T data) {
        Node<T> node = getNode(root, parent);
        Node<T> node2 = getNode(root, data);

        if(node != null && node2 == null) node.childs.add(new Node(data));
        else {
            if(node2 != null) System.out.println("Tidak dapat memasukkan data yang sudah ada.");
            if(node == null) System.out.println("Tidak ada node dengan data tersebut.");
        }
    }

    // Pengaksesan
    // method rekursif untuk menampilkan node di bawah node pada parameter
    private void access(Node<T> node, String space) {
        System.out.println();
        for (Object curNode : node.childs) {
            System.out.print(space + " --> " + ((Node)curNode).data);
            access((Node) curNode, space + "  ");
        }
    }

    // Method untuk menampilkan seluruh tree
    public void access() {
        System.out.print(root.data);
        access(root, " ");
    }

   // Jumlah Node
   public int getCount() {
        if(root == null) return 0;

       Queue<Node> queue = new LinkedList<Node>();
       queue.add(root);

       int count = 1;
       while (!queue.isEmpty()) {
           Node temp = queue.poll();

           for (Object e : temp.childs) {
               count++;
               queue.add((Node) e);
           }
       }
       return count;
   }

   // mendapatkan parent
    public Node getParent(T data) {
        if(root.data == data) return null;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            for (Object e : temp.childs) {
                if(((Node)e).data == data) return temp;
                queue.add((Node) e);
            }
        }
        return null;
    }

    // mendapatkan child
    public List<Node> getChild(T data) {
        Node node = getNode(root, data);

        return node.childs;
    }

    // mendapat jumlah child
    public int getNumOfChild(T data) {
        return getChild(data).size();
    }

    public static void main(String[] args) {

        Tree<Character> tree = new Tree<>('H');

        tree.addNode('H','D');
        tree.addNode('H','K');
        tree.addNode('D','F');
        tree.addNode('D','B');
        tree.addNode('K','J');
        tree.addNode('K','L');
        tree.addNode('F','E');
        tree.addNode('F','G');
        tree.addNode('B','A');
        tree.addNode('B','C');
        tree.addNode('J','I');

        tree.access();










    }
}