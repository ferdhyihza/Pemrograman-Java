package KelasB.Reviewku.Perpustakaan;

public class Main {

    public static void main(String[] args) {

        Book buku1 = new Book("Mekanika Kuantum", "Teknologi", "Buku ini ditulis oleh Vani Sugiyono");
        Book buku2 = new Book("Pemrograman Javascript", "Teknologi", "Buku ini ditulis oleh Betha Sidik");
        Book buku3 = new Book("Pemrograman C++", "Teknologi");
        Book buku4 = new Book("Mycroft Holmes", "Biografi");
        buku3.setDescription("Buku ini ditulis oleh Budi Raharjo");
        buku4.setDescription("Buku ini ditulis oleh Abdul Jabbar");

        Perpus perpus = new Perpus();
        perpus.addBook(buku1);
        perpus.addBook(buku2);
        perpus.addBook(buku3);
        perpus.addBook(buku4);

        System.out.println("========Get A Book========");
        Book buku = perpus.getBook(0);
        buku.show();

        System.out.println("========Get List of Book========");
        Book[] books = perpus.getBook();
        for (Book s : books
             ) {
            s.show();
        }

    }

}
