package com.library.service;
import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        if (bookRepository != null) {
            System.out.println("Book Title: " + bookRepository.getBookTitle());
            System.out.println("Book Author: " + bookRepository.getBookAuthor());
        } else {
            System.out.println("No book repository configured.");
        }
    }
}
