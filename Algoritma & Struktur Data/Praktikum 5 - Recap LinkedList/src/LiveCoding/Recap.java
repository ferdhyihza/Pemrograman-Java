package LiveCoding;

import java.util.LinkedList;
import java.util.Scanner;

public class Recap {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        LinkedList ll = new LinkedList();

        int jml = scan.nextByte();
        scan.nextLine();

        for (int i=0 ; i<jml ; i++) {
            String in = scan.nextLine();
            String[] arrIn = in.split(" ");
            switch (arrIn[0]) {
                case "TambahDiAwal" -> ll.addFirst(arrIn[1]);
                case "TambahDiAkhir" -> ll.addLast(arrIn[1]);
                case "TambahDiIndex" -> ll.add(Integer.parseInt(arrIn[1]), arrIn[2]);
                case "HapusDiAwal" -> ll.removeFirst();
                case "HapusDiAkhir" -> ll.removeLast();
                case "HapusDiIndex" -> ll.remove(Integer.parseInt(arrIn[1]));
            }
        }
        for (Object o : ll) {
            System.out.print(o + " ");
        }
    }
}
