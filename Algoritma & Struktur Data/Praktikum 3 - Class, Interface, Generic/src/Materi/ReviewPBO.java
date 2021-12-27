package Materi;

// interface
interface Animal {
    //Bisa dibuat field tapi sifatnya final, nilainya tidak dapat diubah-ubah
    int iniFieldPadaInterface = 0;

    void talk();
}

// class
class Dog implements Animal{
    // Field
    String name;
    int energy = 100;

    // Constructor
    Dog(String name) {
        this.name = name;
    }

    // Method yang dioverride dari interface
    @Override
    public void talk() {
        System.out.println("woof");
    }

    // Method
    public void run() {
        this.energy -= 10;
    }
}

// Generic Class
class Data<T> { // Type parameter : T
    private T data;

    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

// Generic Interface
interface DataInterface<T> {
    T dataInterface();
}

class DataImplementInterface<T> implements DataInterface{
    T data;

    @Override
    public T dataInterface() {
        return data;
    }
}

public class ReviewPBO {
    // Generic method
    public static <T> void methodGeneric(T a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Membuat object dari class
        Dog dog = new Dog("Doggy");
        // Memanggil method dari class
        dog.talk();
        // Mendapatkan value dari field
        System.out.println(dog.name);

        //Tanpa Generic
        Object obj = "ABCDE";
        Integer a = (Integer) obj; //baris ini tidak error di compile time tapi akan error di runtime

        //Membuat object generic class
        Data<String> data = new Data<>("ABCDE");
        // Baris di bawah akan error saat compile time
        // Integer data2 = (Integer) data;

        // Invariant
        Data<String> data1= new Data<>("ABCDE");
        // Data<Object> data2 = data1; -> Baris ini error karena class generic Object tidak dapat menerima
        //                                String walau String adalah child class Object

        // Covariant
        Data<? extends Object> data3 = data1; //-> Baris ini tidak error. dengan menggunakan kata kunci extend
        //                                         data dengan childclassnya dapat diterima

        // Contravariant
        Data<Object> data2 = new Data<>("abcde");
        Data<? super String> data4 = data2; // -> Baris ini tidak error. dengan menggunakan kata kunci super,
        //                                        data dengan parent classnya dapat diterima
    }
}
