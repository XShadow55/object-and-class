// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Book {
    private String nameAuthor;
    private String nameBook;
    private int year;


    public Book(String name,String nameAuthor){
        this.nameBook = name;
        this.nameAuthor = nameAuthor;

    }

    public String getNameBook() {
        return this.nameBook;
    }
    public String getNameAuthor() {
        return this.nameAuthor;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
