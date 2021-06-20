package Method;

public class Method {

    public static void main(String[] args) {

        System.out.println("METHOD VOID");
        panggilNama("Ferdhy");
        panggilNama("Rizqi");
        gambarSegitiga(3);
        gambarSegitiga(4);

        System.out.println("\nMETHOD RETURN");
        System.out.println(hitungFaktorial(5));
        System.out.println(hitungFaktorial(3));
        System.out.println(ganjilGenap(3));
        System.out.println(ganjilGenap(6));

    }

    private static void panggilNama (String nama) {
        System.out.printf("%s, %s!\n", "Hello" ,nama);
    }

    private static void gambarSegitiga (int x) {
        for (int i=0 ; i < x ; i++) {
            for (int j=0 ; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int hitungFaktorial (int x) {
        for (int i=x-1 ; i>=1 ; i--) x *= i;
        return x;
    }

    private static String ganjilGenap (int bilangan) {
        if (bilangan % 2 == 0) return bilangan + " adalah genap";
        else return bilangan + " adalah ganjil";
    }

}
