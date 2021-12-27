package UAP;

import java.util.Scanner;
import java.util.Stack;

public class Cek {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String arr[] = in.nextLine().split("");
        Stack < String > stack = new Stack < > ();
        int size = arr.length;
        int jml = 0;
        for (String i: arr) {
            switch (i) {
                case "(": stack.push("("); break;
                case "{": stack.push("{"); break;
                case "[": stack.push("["); break;
                case "}": {
                    if (stack.contains("{")) {
                        stack.remove("{");
                        jml++;
                    }
                    else {
                        stack.push("}");
                    };
                }
                break;
                case "]": {
                    if (stack.contains("[")) {
                        stack.remove("[");
                        jml++;
                    }
                    else {
                        stack.push("]");
                    };
                }
                break;
                case ")": {
                    if (stack.contains("(")) {
                        stack.remove("(");
                        jml++;
                    }
                    else {
                        stack.push(")");
                    }
                    ;
                }
                break;
            }
        }
        if (size % 2 == 3 && size !=1) {
            System.out.println("Tidak Seimbang " + stack.size());
        } else if (jml == size / 2 && jml != 3) System.out.println("Seimbang " + jml);
        else if (jml == size / 2){
            System.out.println("Tidak Seimbang " + jml);
        }


    }
}
