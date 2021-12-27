package LiveCoding;

import java.util.Scanner;

interface AnArray<T>{
    void printArray();
    T getFirstElement();
    T getLastElement();
    T getMiddleElement();
}

class RegularArray<T> implements AnArray<T>{

    T[] arr;

    public RegularArray(T[] arr){
        this.arr = arr;
    }

    @Override
    public void printArray() {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    @Override
    public T getFirstElement() {
        return arr[0];
    }

    @Override
    public T getLastElement() {
        return arr[arr.length-1];
    }

    @Override
    public T getMiddleElement() {
        return arr.length%2 == 0 ? arr[(arr.length/2)-1] : arr[(arr.length/2)];
    }
}

class ReversedArray<T> implements AnArray<T>{

    T[] arr;

    public ReversedArray(T[] arr) {
        this.arr = arr;
    }

    @Override
    public void printArray() {
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    @Override
    public T getFirstElement() {
        return arr[arr.length-1];
    }

    @Override
    public T getLastElement() {
        return arr[0];
    }

    @Override
    public T getMiddleElement() {
        return arr[(arr.length/2)];
    }
}

public class Solution {

    public static void main(String[] args) {
        // Jangan ubah main method
        Scanner scan = new Scanner(System.in);

        Integer[] intArr = new Integer[scan.nextInt()];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = scan.nextInt();
        }

        String[] strArr = new String[scan.nextInt()];
        scan.nextLine();
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = scan.next();
        }

        AnArray<Integer> intRegArr = new RegularArray<Integer>(intArr);
        AnArray<Integer> intRevArr = new ReversedArray<Integer>(intArr);

        AnArray<String> strRegArr = new RegularArray<String>(strArr);
        AnArray<String> strRevArr = new ReversedArray<String>(strArr);

        intRegArr.printArray();
        intRevArr.printArray();
        System.out.println(intRegArr.getFirstElement() + " " + intRegArr.getLastElement() + " " + intRegArr.getMiddleElement());
        System.out.println(intRevArr.getFirstElement() + " " + intRevArr.getLastElement() + " " + intRevArr.getMiddleElement());

        strRegArr.printArray();
        strRevArr.printArray();
        System.out.println(strRegArr.getFirstElement() + " " + strRegArr.getLastElement() + " " + strRegArr.getMiddleElement());
        System.out.println(strRevArr.getFirstElement() + " " + strRevArr.getLastElement() + " " + strRevArr.getMiddleElement());
    }
}
