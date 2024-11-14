public class Reader {
    private String name;
    private String number;
    private String faculty;
    private String birthday;
    private Phone phone;

    public Reader(){}
    public void takeBook(){}

    public void returnBook(){}

    public void takeBook(int count) {
        System.out.println(name + "взял" + count + "книги");
    }
    public void takeBook(String... books) {
        System.out.print(name + "взял книги: ");
        for(String book : books) {
            System.out.print(book + ", ");
        }
    }
    public void takeBook(Book... books) {
        System.out.print(name + "взял книги: ");
        for(Book book : books) {
            System.out.print(book.getName() + ", ");
        }
    }
    public void returnBook(int count) {
        System.out.println(name + "вернул" + count + "книги");
    }
    public void returnBook(String... books) {
        System.out.print(name + "вернул книги: ");
        for(String book : books) {
            System.out.print(book + ", ");
        }
    }
    public void returnBook(Book... books) {
        System.out.print(name + "вернул книги: ");
        for(Book book : books) {
            System.out.print(book.getName() + ", ");
        }
    }
}
