package iterator;

import java.util.Iterator;

public class IteratorExecutor {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Gatsby"));
        bookShelf.appendBook(new Book("BabyPig"));

        Iterator<Book> it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = it.next();
            System.out.println("book.getName() = " + book.getName());
        }
        System.out.println("==================");

        for(Book book : bookShelf){
            System.out.println("book.getName() = " + book.getName());
        }
    }
}
