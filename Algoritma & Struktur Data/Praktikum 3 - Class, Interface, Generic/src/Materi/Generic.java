package Materi;

public class Generic {

    public static <T> void print(T a){
        System.out.println(a);
    }

    public static void main(String[] args) {

        String nama= "kayes";

        print("Hayuk");
        print(10);
        print(nama);
    }
}
