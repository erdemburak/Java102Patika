package booklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("LORD OF THE RINGS", 1335, "JRR Tolkien", 1954));
        bookList.add(new Book("Incognito", 350, "David Eagleman", 2011));
        bookList.add(new Book("Harry Potter", 1000, "Rowling", 1997));
        bookList.add(new Book("Suç ve Ceza", 705, "Dostoyevski", 1866));
        bookList.add(new Book("Şeker Portakalı", 183, "Vasconcelos", 1968));
        bookList.add(new Book("Dönüşüm", 80, "Kafka", 1915));
        bookList.add(new Book("Sefiller", 400, "Victor Hugo", 1862));
        bookList.add(new Book("Savaş ve Barış", 2200, "Tolstoy", 1869));
        bookList.add(new Book("Üç Silahşörler", 64, "Alexandre Dumas", 1844));
        bookList.add(new Book("Karamazov Kardeşler", 840, "Dostoyevski", 1880));

        Map<String,String> booksAuthors = new HashMap<>();

        bookList.stream().forEach(book -> booksAuthors.put(book.getBookName(),book.getAuthorName()));

        for(String str:booksAuthors.keySet()){
            System.out.println("Book : " + str + " -\t Yazar : " + booksAuthors.get(str));
        }

        System.out.println("\nSayfa sayısı 100 altında olanların yeni liste ile ekrana yazılması\n");

        List<Book> newList = new ArrayList<>();

        bookList.stream().filter(i -> i.getPageNumber() > 500).forEach(book -> newList.add(book));

        newList.stream().forEach(newBook -> System.out.println(newBook.getBookName()));



    }
}
