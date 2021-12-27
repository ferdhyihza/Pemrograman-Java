package UAP;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        //HINT: gunakanlah Stack untuk menyelesaikan studi kasus ini
        Scanner input = new Scanner(System.in);
        Stack<String> stack = new Stack();
        int jml=0;
        String s = input.next();
        boolean balance = true;//Boolean untuk mengecek apakah jumlah kurungnya seimbang atau tidak

        for (int i = 0; i < s.length(); i++) {
//          	Lakukan pengecekan terhadap satu per satu karakter dari string.
            String current = s.substring(i,i+1);
//            Jika karakternya merupakan kurung buka, tambah ke stack.
            if (current.equals("{") || current.equals("[") || current.equals("(")) stack.push(current); continue;
//            Jika karakternya kurung tutup, lakukan pengecekan dengan karakter paling atas di stack.

//            if ((current.equals("}") && stack.peek().equals("{")) || (current.equals("]") && stack.peek().equals("[")) || (current.equals(")") && stack.peek().equals("("))) {
//                stack.pop(); jml++;
//            }
//            char check;
//            switch (current) {
//                case ')':
//                    String checkStr = stack.pop();
//                    check = Character.valueOf(checkStr);
//                    if (check == '{'  || check == '[') balance = false;
//                    break;
//
//                case '}':
//                    check = stack.pop();
//                    if (check == '(' || check == '[') balance = false;
//                    break;
//
//                case ']':
//                    check = stack.pop();
//                    if (check == '(' || check == '{')
//                        return false;
//                    break;
//            }

            /*Jika karakternya sejenis dengan karakter paling atas, keluarkan karakter tersebut dari stack.
            Jika karakternya tidak sejenis, maka sudah pasti tidak seimbang.
            */

        }
        if (!stack.empty()) {
            for (int i = 0; i < s.length(); i++) {
                String current = s.substring(i,i+1);
                if ((current.equals("}") && stack.peek().equals("{")) || (current.equals("]") && stack.peek().equals("[")) || (current.equals(")") && stack.peek().equals("("))) {
                    stack.pop(); jml++;
                }
            }
        }
        System.out.println(stack);
        //Pastikan balance tetap true dan semua isi stack telah habis untuk mencetak Seimbang
        if (stack.empty()) System.out.println("Seimbang " + jml);
        else System.out.println("Tidak Seimbang " + jml);


    }
}
