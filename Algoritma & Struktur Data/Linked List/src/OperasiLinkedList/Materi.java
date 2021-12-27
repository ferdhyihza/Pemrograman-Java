package OperasiLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Materi {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList<>();

        // Tambah Node
        ll.add(5);
        ll.addFirst("a");
        ll.add(2,1);
        ll.addLast(9);
        ll.add("a");
        ll.add(1);

        // Hapus Node
//        ll.remove(3);
//        ll.remove("a");
//        ll.clear();
//        ll.removeFirst();
//        ll.removeLast();
//        ll.removeFirstOccurrence("a");
//        ll.removeLastOccurrence("a");

        // Cek Node
        boolean cek = ll.contains(1); // true/false
        ll.indexOf(5); // nilai 5 ada di index ke ...
        ll.lastIndexOf(1); // nilai 1 ada di index terakhir kali ditemukan ke ...
        System.out.println(cek);

        // Melihat Node
        ll.get(0);
        ll.getFirst();
        ll.getLast();

        // Operasi Lain
        ll.set(0,"Pertamax");
        ll.size();
        ll.isEmpty();
        Object[] a = ll.toArray();
        System.out.println(Arrays.toString(a));

        System.out.println(ll);
    }
}
