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

    @Override
    public String toString() {
        return "Название: " + this.name + ". Автор: " + author.toString() + ". Дата публикации: " + this.yearOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Book that = (Book) other;
        return name.equals(that.name) &&
                author.equals(that.author) &&
                yearOfPublication == that.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author, yearOfPublication);
    }
}
