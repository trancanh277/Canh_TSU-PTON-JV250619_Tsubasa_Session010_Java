package baitap02;

import java.util.ArrayList;
import java.util.HashMap;

public class BookManager {
    private HashMap<String, Book> books;

    public BookManager() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getName(), book);
    }

    public Book findBook(String name) throws Exception {
        if (!books.containsKey(name)) {
            throw new Exception("Sách không tồn tại!");
        }
        return books.get(name);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Chưa có sách nào trong danh sách.");
        } else {
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }
}

