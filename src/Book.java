public class Book {
    private String name;
    private String authorName;
    private String authorSurname;
    private String authorLastname;

    public Book(String name, String authorName, String authorSurname, String authorLastname) {
        this.name = name;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.authorLastname = authorLastname;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" %s.%s. %s", name, authorName.charAt(0), authorLastname.charAt(0), authorSurname);
    }
}
