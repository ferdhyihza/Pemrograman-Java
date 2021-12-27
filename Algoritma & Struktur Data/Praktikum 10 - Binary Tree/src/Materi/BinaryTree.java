package Materi;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree(int data) {
        this.root = new Node(data);
    }

    BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if(node == null) return node = new Node(data);

        if(data < node.data) node.left = insert(node.left, data);
        else if(data > node.data) node.right = insert(node.right, data);

        return node;
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private int minValue(Node node) {
        int minVal = node.data;
        while (node.left != null) {
            minVal = node.left.data;
            node = node.left;
        }
        return minVal;
    }

    private Node delete(Node node, int data) {
        if(node == null) return node;

        if(data < node.data) node.left = delete(node.left, data);
        else if(data > node.data) node.right = delete(node.right, data);
        else {
            // kalau childnya gaada atau ada 1
            if(node.left == null) return node.right;
            else if(node.right == null) return node.left;
            // kalau childnya ada 2
            else {
                node.data = minValue(node.right);
                node.right = delete(node.right, node.data);
            }
        }
        return node;
    }

    public Node search(int data) {
        return search(root, data);
    }

    private Node search(Node node, int data) {
        if(node == null || data == node.data) return node;

        if(data < node.data) return search(node.left, data);

        return search(node.right, data);
    }

    public Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }

        return node;
    }

    public Node findMax(Node node) {
        while (node.right != null) {
            node = node.right;
        }

        return node;
    }

    private void preOrder(Node node){
        System.out.print(node.data + " ");
        if (node.left != null) preOrder(node.left);
        if (node.right != null) preOrder(node.right);
    }

    public void preOrder(){
        preOrder(root);
    }

    private void inOrder(Node node){
        if (node.left != null) inOrder(node.left);
        System.out.print(node.data + " ");
        if (node.right != null) inOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void postOrder(Node node){
        if (node.left != null) postOrder(node.left);
        if (node.right != null) postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void postOrder(){
        postOrder(root);
    }

    public void levelOrder() {
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.remove();

            if(node != null) System.out.print(node.data + " ");

            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(2);
        tree.insert(6);
        tree.insert(15);
        tree.insert(25);

        System.out.print( "Pre Order\t: ");
        tree.preOrder();
        System.out.print( "\nIn Order\t: ");
        tree.inOrder();
        System.out.print( "\nPost Order\t: " );
        tree.postOrder();
        System.out.print( "\nLevel Order\t: ");
        tree.levelOrder();
    }
}
