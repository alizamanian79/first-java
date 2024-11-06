package OOP.Library;

public class Library {

    public static void main(String[] args) {
    Book book1 = new Book();
    book1.title="William Shakespeare";
    book1.author="Shakespeare";
    book1.price= ("250000");


    Member member1 = new Member();
    member1.setName("Ali");
    member1.setLastName("Zamanian");
    member1.setNationalCode("32323232");


//    book1.information();
    member1.information();
    }
}
