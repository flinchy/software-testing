package com.chicodecrafty;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalog {

    private Map<String, Integer> bookInventory = new HashMap<>();

    public void addBook(String bookTitle, int quantity) {
        bookInventory.put(bookTitle, quantity);
    }

    public boolean borrowBook(String bookTitle) {
        if (bookInventory.containsKey(bookTitle) && bookInventory.get(bookTitle) > 0) {
            int currentQuantity = bookInventory.get(bookTitle);
            bookInventory.put(bookTitle, currentQuantity - 1);
            return true;
        }
        return false;
    }

    public void returnBook(String bookTitle) {
        bookInventory.computeIfPresent(bookTitle, (title, quantity) -> quantity + 1);
    }

    public int getAvailableQuantity(String bookTitle) {
        return bookInventory.getOrDefault(bookTitle, 0);
    }
}
