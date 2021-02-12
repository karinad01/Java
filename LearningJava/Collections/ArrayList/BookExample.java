package ArrayList;

import java.util.ArrayList;
import java.util.List;

class Book{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author,String publisher, int quantity){
        this.id = id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;

    }
}
public class BookExample {
    public static void main(String[] args) {
        //Creating a list of Books
        List<Book> list = new ArrayList<Book>();
        //Creating Books
        Book firstBook = new Book(101, "Let us C","Yashwant Kanetkar","BPB", 8);
        Book secondBook =new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book thirdBook =new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        list.add(firstBook);
        list.add(secondBook);
        list.add(thirdBook);
        //Traversing list
        for(Book b:list){
            System.out.println(b.id+" " +b.author+" "+b.publisher+" "+b.quantity+" ");
        }

    }

}
