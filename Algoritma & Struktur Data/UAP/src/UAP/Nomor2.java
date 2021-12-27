package UAP;

import java.util.Scanner;
import java.util.Stack;

public class Nomor2 {

    public static void main(String[] args) {
        //HINT: gunakanlah Stack untuk menyelesaikan studi kasus ini
        Scanner scanner = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();
        int tmp1 = 0;
        int tmp2 = 0;

        char[] input = scanner.nextLine().toCharArray();
        boolean balance = true;//Boolean untuk mengecek apakah jumlah kurungnya seimbang atau tidak

        for (char bracket : input) {
            /*Lakukan pengecekan terhadap satu per satu karakter dari string.
            Jika karakternya merupakan kurung buka, tambah ke stack.
            Jika karakternya kurung tutup, lakukan pengecekan dengan karakter paling atas di stack.

            Jika karakternya sejenis dengan karakter paling atas, keluarkan karakter tersebut dari stack.
            Jika karakternya tidak sejenis, maka sudah pasti tidak seimbang.
            */
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
                tmp2++;
            } else {
                if ((bracket == '}' || bracket == ']' || bracket == ')')
                        && stack.isEmpty()) {
                    balance = false;
                } else if ((bracket == '}' && stack.peek() == '{')
                        || (bracket == ']' && stack.peek() == '[')
                        || (bracket == ')' && stack.peek() == '(')) {
                    stack.pop();
                    tmp1++;
                } else {
                    break;
                }
            }
        }
        //Pastikan balance tetap true dan semua isi stack telah habis untuk mencetak Seimbang
        if (stack.size() == 0) {
            System.out.println("Seimbang " + tmp1);
        } else {
            System.out.println("Tidak Seimbang " + (method(input, '{', '}') + method(input, '[', ']') + method(input, '(', ')')));
        }
    }

    public static int method(char[] arrStack, char needleOpen, char needleClose) {
        int semua = 0;
        int semuaOpen = 0;
        int semuaClose = 0;

        for (char check : arrStack) {
            if (check == needleOpen) {
                semuaOpen++;
            }
            if (check == needleClose) {
                semuaClose++;
            }
        }
        while (semuaOpen > 0 && semuaClose > 0) {
            semua++;
            semuaOpen--;
            semuaClose--;
        }
        return semua;
    }
}
