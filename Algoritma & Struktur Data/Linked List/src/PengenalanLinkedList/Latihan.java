package PengenalanLinkedList;

import java.util.LinkedList;

public class Latihan { // Ferdhy Ihza Armanda 205150401111011

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();

//      Array                               Linked List
//      - Statis                            - Dinamis
//      - Elemen disimpan berurutan         - Elemen disimpan acak
//      - Random access                     - Sequential access

//        ll.add(10,10);
        ll.addFirst(1);
        ll.add(1,2);
        ll.addLast(3);
        ll.add(3,4);
        ll.addFirst(5);
        ll.add(1,6);

        System.out.println(ll);
    }
}
