package OperasiLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class main {

    public static LinkedList<Integer> ll= new LinkedList<Integer>();

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        for(int i=0; i<10; i++){
            ll.add(sc.nextInt());
        }
        System.out.println("Ascending");
        for(int i=0; i<ll.size(); i++){
            System.out.print(ll.get(i)+"->");
        }
        System.out.println();
        System.out.println("Descending");
        for(int i=0; i<ll.size(); i++){
            System.out.print(ll.get((ll.size()-1)-i)+"->");
        }
        addMemberLL(11);
    }

    public static void addMemberLL(int x){
        if(ll.contains(x)){
            System.out.println("Hasil Method addMemberLL");
            for(int member : ll){
                System.out.print(member+" ");
            }
        }else{
            ll.add(x);
            for(int member : ll){
                System.out.print(member+" ");
            }
        }
    }

}
