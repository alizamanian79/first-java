package EnumTrain;

public class Enumtest2 {

    enum Author{
        Wiliam_Shekspire;
    }

    private String title;
    private Author author;


    public Enumtest2(String title, Author author) {
        this.title = title;
        this.author = Author.Wiliam_Shekspire;

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Enumtest2 customer = new Enumtest2("jadid",Author.Wiliam_Shekspire);
        customer.getAuthor();
        System.out.println(customer.getAuthor());
    }



}

