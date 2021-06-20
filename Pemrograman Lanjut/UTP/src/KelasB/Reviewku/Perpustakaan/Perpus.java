package KelasB.Reviewku.Perpustakaan;

import java.util.ArrayList;

public class Perpus {

    ArrayList<Book> listBuku = new ArrayList<>();

    void addBook(Book buku){
        listBuku.add(buku);
    }

    Book getBook(int index){
        return listBuku.get(index);
    }

    Book[] getBook(){
        Book[] books = new Book[listBuku.size()];
        for (int i=0 ; i < books.length ; i++) {
            books[i] = listBuku.get(i);
        }
        return books;
    }


}
