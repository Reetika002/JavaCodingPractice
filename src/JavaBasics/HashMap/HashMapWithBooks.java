package JavaBasics.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithBooks {

    public static void main(String[] args) {

        //creating map of books
        HashMap<Integer, Book>  map = new HashMap<Integer, Book>();
        //creating books

        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        //Adding books to map

        map.put(1, b1);
        map.put(2, b1);
        map.put(3, b1);

        //Traversing map

        for (Map.Entry<Integer,Book> m : map.entrySet())
        {
            int key = m.getKey();
            Book b = m.getValue();
            System.out.println(key +" "+"details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);

        }
    }
}
class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}