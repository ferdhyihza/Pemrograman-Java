package LiveCoding;

import java.util.LinkedList;
import java.util.Scanner;

public class Gerbong {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList();

        int panjangGerbong = scan.nextByte();

        int[] arr= new int[panjangGerbong];
        for(int i=0; i<panjangGerbong;i++){
            arr[i]=scan.nextInt();
        }

        for (int i=0 ; i<panjangGerbong ; i++) {
            if (ll.isEmpty()) {
                ll.add(arr[i]);
            } else if (arr[i] > ll.getLast() && arr[i]%2 == 0) {
                ll.addLast(arr[i]);
            } else if (arr[i] < ll.getFirst() && arr[i]%2 != 0) {
                ll.addFirst(arr[i]);
            } else if (arr[i] > ll.getFirst() && arr[i] < ll.getLast()) {
                ll.add(ll.size()/2,arr[i]);
            } else {
                continue;
            }
        }

        for(int gerbong : ll){
            System.out.print(gerbong+" ");
        }


    }
}
