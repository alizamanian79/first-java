package TestPack;

public class Book {
    private String title;
    private int pages,total;
    static private int maxPage=800;




    public Book(String title, int pages, int total) {
        this.title = title;

        if (pages<maxPage){
            this.pages = pages;
        }

        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    void introduce (){
        System.out.println(this.title);
        System.out.println(this.pages);
        System.out.println(this.total);


    }

    public static void main(String[] args) {
        Book b1 = new Book("Jack",9585,5);
        b1.introduce();
    }

}
