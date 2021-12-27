package OperasiLinkedList;

import java.util.LinkedList;

public class Latihan { // Ferdhy Ihza Armanda 205150401111011

    public static LinkedList<Integer> ll = new LinkedList<>();

    public static void main(String[] args) {

        // Soal 1
        for (int i=1 ; i<=10 ; i++) {
            ll.add(i);
        }
        print("Ascending", ll);

        // Soal 2
        for(int i=0 ; i<ll.size() ; i++) {
            ll.add(i,ll.getLast());
            ll.removeLast();
        }
        print("Descending", ll);

        // Soal 3
        tambahData(1);
    }

    public static void tambahData (Integer data) {
        if (ll.contains(data)) {
            System.out.println("Tambah data: Skip, data sudah ada");
        } else {
            ll.add(data);
            System.out.println("Tambah data: "+data);
        }
        print("Linked list", ll);
    }

    public static void print(String judul, LinkedList<Integer> ll){
        System.out.print(judul +": ");
        for(int i=0; i<ll.size(); i++){
            if (i==ll.size()-1) {
                System.out.println(ll.get(i));
            } else {
                System.out.print(ll.get(i)+"->");
            }
        }
    }

}
