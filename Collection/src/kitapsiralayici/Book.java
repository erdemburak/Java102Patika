package kitapsiralayici;

public class Book implements Comparable<Book> {
    private String bookName;
    private Integer pageNumber;
    private String author;
    private Integer releaseDate;

    public Book(String bookName, Integer pageNumber, String author, Integer releaseDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return getBookName().compareTo(o.getBookName());
    }
}
