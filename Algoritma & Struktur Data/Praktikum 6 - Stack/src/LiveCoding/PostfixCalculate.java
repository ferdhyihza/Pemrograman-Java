package LiveCoding;

import java.util.Scanner;
import java.util.Stack;

public class PostfixCalculate {

    public static void main(String[] args) {

        Stack<Double> stack = new Stack();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.concat(",)");
        String [] arrStr = str.split(",");

        for(int i = 0 ; i < arrStr.length;i++){
            double var1,var2;
            switch (arrStr[i]){
                case "+" :
                    var1 =  stack.pop();
                    var2 = stack.pop();
                    stack.push(var2+var1);
                    break;
                case "-":
                    var1 = stack.pop();
                    var2 = stack.pop();
                    stack.push(var2-var1);
                    break;
                case "/":
                    var1 = stack.pop();
                    var2 = stack.pop();
                    double bagi;
                    try{
                        bagi= var2/var1;
                    } catch (ArithmeticException e){continue;}
                    stack.push(bagi);
                    break;
                case "*":
                    var1 = stack.pop();
                    var2 = stack.pop();
                    stack.push(var2*var1);
                    break;
                case "^":
                    var1 = stack.pop();
                    var2 = stack.pop();
                    stack.push(Math.pow(var2,var1));
                    break;
                case "%":
                    var1 = stack.pop();
                    var2 = stack.pop();
                    stack.push(var2 % var1);
                    break;
                case ")":
                    break;
                default:
                    try {
                        stack.push(Double.parseDouble(arrStr[i]));
                    }catch (Exception e){
                        continue;
                    }
            }
        }
        System.out.println(Math.round(stack.pop()));
    }

}
