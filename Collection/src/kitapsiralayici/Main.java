package kitapsiralayici;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("Lord Of The Rings", 1000,"Tolkien", 1953));
        books.add(new Book("Harry Potter", 600,"Rowling", 1999));
        books.add(new Book("Suç ve Ceza", 700,"Dostoyevski", 1866));

        for(Book b : books){
            System.out.println("Kitap adı : " + b.getBookName() +
                    "\t Sayfa sayısı : " + b.getPageNumber() +
                    "\t Yazar adı : " + b.getAuthor() +
                    "\t Yayın Tarihi : " + b.getReleaseDate());
        }

        System.out.println("\nSayfa sayısına göre sıralama");
        TreeSet<Book> books1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        books1.add(new Book("Lotr", 1000,"Tolkien", 1953));
        books1.add(new Book("Harry Potter", 600,"Rowling", 1999));
        books1.add(new Book("Suç ve Ceza", 700,"Dostoyevski", 1866));

        for(Book b : books1){
            System.out.println("Kitap adı : " + b.getBookName() +
                    "\t Sayfa sayısı : " + b.getPageNumber() +
                    "\t Yazar adı : " + b.getAuthor() +
                    "\t Yayın Tarihi : " + b.getReleaseDate());
        }

    }
}
