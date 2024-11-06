package OOP.Library;

public class Book {
    String title ;
    String author;
    String price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public String information (){
        String result = "Book Name : " + this.title + "Author : "+ this.author + "Price : "+ this.price;
        System.out.println(result);
        return result;
    }

}
