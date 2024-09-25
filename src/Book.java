public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;

    public Book(String name, Author author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public Book(Author author, int yearOfPublication) {
        this("Нет названия", author, yearOfPublication);
    }
    public Book(String name, Author author) {
        this(name, author, 0);
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
