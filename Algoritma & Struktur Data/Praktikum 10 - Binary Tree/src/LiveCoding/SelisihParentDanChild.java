package LiveCoding;

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public Node search(int data) {
        return search(root, data);
    }

    private Node search(Node root, int data) {
        if (root != null) {
            if (root.data == data) {
                return root;
            } else {
                Node foundNode;
                if (root.data > data) {
                    foundNode = search(root.left, data);
                } else {
                    foundNode = search(root.right, data);
                }
                return foundNode;
            }
        } else {
            return null;
        }
    }

    public void insert(int data) {
        Node node = search (data);
        if (node == null) root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if(node == null) return new Node(data);
        if(data < node.data) node.left = insert(node.left, data);
        else if(data > node.data) node.right = insert(node.right, data);
        return node;
    }

    public int findSelisihParentChild(int data) {
        Node node = this.search(data);
        if (node != null) {
            if (node.left != null && node.right != null)
                return Math.abs((node.left.data + node.right.data) - node.data);
            else if (node.right == null && node.left != null){
                return Math.abs(node.left.data - node.data);
            } else if (node.right != null){
                return Math.abs(node.right.data - node.data);
            } else {
                return 0;
            }
        }
        return 0;
    }

}


public class SelisihParentDanChild {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        Scanner scan = new Scanner(System.in);

        int jml = scan.nextInt();

        for (int i=0 ; i<=jml ; i++) {
            String perintah = scan.nextLine();
            String[] arrPerintah = perintah.split(" ");
            switch (arrPerintah[0].toLowerCase()) {
                case "masuk" -> tree.insert(Integer.parseInt(arrPerintah[1]));
                case "selisih" -> System.out.println(tree.findSelisihParentChild(Integer.parseInt(arrPerintah[1])));
            }
        }

    }

}
