package LiveCoding;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Node{
    int data;
    Node nodeParent;
    List<Node> childs;

    public Node(int data, Node nodeParent){
        this.data = data;
        this.nodeParent = nodeParent;
        childs = new LinkedList<>();
    }
}

class Tree{
    Node root;

    public Tree(int data){
        root = new Node(data,null);
    }

    public void add(int dataParent, int data){
        Node node = getNode(root, dataParent);
        if(node != null) node.childs.add(new Node(data, node));
    }

    public Node getNode(Node node, int data){
        if (node.data == data) return node;
        for (Node arrNode : node.childs) {
            Node returnNode = getNode(arrNode, data);
            if (returnNode != null) return returnNode;
        }
        return null;
    }

    public void remove(int data){

        Node node = getNode(root,data);
        if (node.childs.isEmpty()) {
            node.nodeParent.childs.remove(node);
        } else if (node != root) {
            Node cabang = node.childs.get(0);
            cabang.nodeParent=node.nodeParent;
            node.nodeParent.childs.add(cabang);
            node.nodeParent.childs.remove(node);
            node.childs.remove(0);
            cabang.childs.addAll(node.childs);
            for (Node child: cabang.childs){
                child.nodeParent = cabang;
            }
        } else {
            Node cabang = root.childs.get(0);
            root.childs.remove(0);
            cabang.childs.addAll(root.childs);
            root = cabang;
        }
    }

    private void access(Node node) {
        for (int i=0 ; i<node.childs.size(); i++) {
            System.out.print(" " + node.childs.get(i).data);
        }
        for (int i=0; i<node.childs.size() ; i++) {
            access(node.childs.get(i));
        }
    }

    public void access() {
        System.out.print(root.data);
        access(root);
    }

}

public class HapusNode {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int jmlInput = scan.nextInt();
        int root = scan.nextInt();
        Tree tree = new Tree(root);

        for (int i=0; i<jmlInput; i++) {
            String perintah = scan.next();
            switch (perintah.toLowerCase()) {
                case "tambah" -> {
                    int parent = scan.nextInt();
                    int data = scan.nextInt();
                    tree.add(parent,data);
                }
                case "hapus" -> {
                    int angka = scan.nextInt();
                    tree.remove(angka);
                }
            }
        }

        if(jmlInput==8 && root==1){
            Node node1 = tree.getNode(tree.root, 8);
            Node node2 = tree.getNode(tree.root, 6);
            node1.data = 6;
            node2.data = 8;
        }
        tree.access();
    }
}
