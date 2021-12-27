package LK;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node kiri;
    Node kanan;

    Node(int data){
        this.data = data;
    }
}

class BinaryTree{

    Node root;

    BinaryTree(){
        root = null;
    }

    public void add(int data) {
        root = add(root, data);
    }

    private Node add(Node node, int data) {
        if (node == null) return node = new Node(data);
        if (data < node.data) node.kiri = add(node.kiri, data);
        else if (data > node.data) node.kanan = add(node.kanan, data);
        return node;
    }

    public Node search(int data){
        return search(data, this.root);
    }

    public void insert(int parent, String arah, int data){
        Node node = search(parent);
        if (node != null) {
            if(arah.equalsIgnoreCase("l")) node.kiri = new Node(data);
            else if(arah.equalsIgnoreCase("r")) node.kanan = new Node(data);
        } else {
            System.out.println("Tidak ada parent");
        }

    }

    private Node search(int data, Node node){
        if (node != null){
            if (node.data == data){
                return node;
            } else {
                Node nodeKetemu = search(data, node.kiri);
                if (nodeKetemu == null) {
                    nodeKetemu = search(data, node.kanan);
                }
                return nodeKetemu;
            }
        } else {
            return null;
        }
    }

    private int minValue(Node node) {
        while (node.kiri != null){
            node = node.kiri;
        }
        return node.data;
    }

    private int maxValue(Node node){
        while (node.kanan != null){
            node = node.kanan;
        }
        return node.data;
    }

    public void delete(int data) {
        this.root = delete(root,data);
    }

    private Node delete(Node node, int data){
        if (node == null) return node;

        if (data > node.data) {
            node.kanan = delete(node.kanan, data);
        } else if (data<node.data) {
            node.kiri = delete(node.kiri, data);
        } else {
            // kalau tidak ada child atau ada 1
            if(node.kiri == null) return node.kanan;
            else if(node.kanan == null) return node.kiri;
            // kalau ada 2 child
            else {
                node.data = minValue(node.kanan);
                node.kanan = delete(node.kanan, node.data);
            }
        }
        return node;
    }

    public void levelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node node = q.remove();
            if(node != null) System.out.print(node.data + " ");
            if(node.kiri != null) q.add(node.kiri);
            if(node.kanan != null) q.add(node.kanan);
        }
    }

    public void preOrder(Node akar){
        if(akar != null){
            System.out.print(akar.data + " ");
            preOrder(akar.kiri);
            preOrder(akar.kanan);
        }
    }
    public void inOrder(Node akar){
        if (akar != null){
            inOrder(akar.kiri);
            System.out.print(akar.data + " ");
            inOrder(akar.kanan);
        }
    }

    public void postOrder(Node root){
        if (root != null){
            postOrder(root.kiri);
            postOrder(root.kanan);
            System.out.print(root.data + " ");
        }
    }

    public void preOrder(){
        preOrder(root);
    }

    public void inOrder(){
        inOrder(root);
    }

    public void postOrder(){
        postOrder(root);
    }
}

public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

//        tree.root = new Node(1);
//        tree.insert(1,"l",3);
//        tree.insert(1,"r",7);
//        tree.insert(3,"l",5);
//        tree.insert(5,"l",4);
//        tree.insert(5,"r",6);
//        tree.insert(7,"l",8);
//        tree.insert(7,"r",9);
//        tree.insert(9,"r",10);
//        tree.insert(10,"l",11);
//        tree.insert(10,"r",12);

//        tree.add(15);
//        tree.add(8); tree.add(20);
//        tree.add(2); tree.add(11); tree.add(27);
//        tree.add(6); tree.add(10); tree.add(12);tree.add(22);tree.add(30);
//        tree.add(3);tree.add(7);tree.add(14);

        tree.add(10);
        tree.add(5);
        tree.add(20);
        tree.add(2);
        tree.add(6);
        tree.add(15);
        tree.add(25);

        System.out.print( "PreOrder\t: ");
        tree.preOrder();
        System.out.print( "\nInOrder\t\t: ");
        tree.inOrder();
        System.out.print( "\nPostOrder\t: " );
        tree.postOrder();
        System.out.print( "\nlevelOrder\t: ");
        tree.levelOrder();

    }
}
