public class Main {

    public static void main(String[] args) {
        Author nameAuthor = new Author("Боб","Ватсон");
        Book name = new Book("Война и мир ", nameAuthor.getFirstName);
        System.out.println(name.getNameBook());
        System.out.println(name.getNameAuthor());
        name.setYear(1333);
        System.out.println(name.getYear());
        Author nameAuthor1 = new Author("Вован","Витчер");
        Book name1 = new Book("Смерть в луже ", nameAuthor1.getFirstName);
        System.out.println(name1.getNameBook());
        System.out.println(name1.getNameAuthor());
        name1.setYear(2023);
        System.out.println(name1.getYear());



        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

    }
}
