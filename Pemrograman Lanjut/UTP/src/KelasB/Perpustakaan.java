package KelasB;

import java.util.ArrayList;

class Book {

    private String title;
    private String category;
    private String description;
    final private int id;

    static int generateId = 1;

    public Book(String title, String category) {
        this.title = title;
        this.category = category;
        this.id = generateId;
        generateId++;
    }

    public Book(String title, String category, String description) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.id = generateId;
        generateId++;
    }

    void setDescription(String description){
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

}


public class Perpustakaan {

    public static void main(String[] args) {

        Book buku1 = new Book("Mekanika Kuantum", "Teknologi", "Buku ini ditulis oleh Vani Sugiyono");
        Book buku2 = new Book("Pemrograman Javascript", "Teknologi", "Buku ini ditulis oleh Sandhika Galih");
        Book buku3 = new Book("Pemrograman C++", "Teknologi");
        Book buku4 = new Book("Matematika Komputasi", "Sains");
        buku3.setDescription("Buku ini ditulis oleh Kang Pukis");
        buku4.setDescription("Buku ini ditulis oleh Bapak Ameenul");

        System.out.println("==========Get A Book==========");
        System.out.println("Id: " + buku1.getId());
        System.out.println("Title: " + buku1.getTitle());
        System.out.println("Category: " + buku1.getCategory());
        System.out.println("Description: " + buku1.getDescription());
        System.out.println();

        ArrayList<Book> books = new ArrayList<>();
        books.add(buku1);
        books.add(buku2);
        books.add(buku3);
        books.add(buku4);

        System.out.println("==========Get List of Book==========");
        for(Book Buku : books) {
            System.out.println("Id: " + Buku.getId());
            System.out.println("Title: " + Buku.getTitle());
            System.out.println("Category: " + Buku.getCategory());
            System.out.println("Description: " + Buku.getDescription() + "\n");
        }

    }
}
