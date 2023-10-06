package org.example.management_book;



import java.util.List;

public interface BookService {



    public List<Book> filterBooksByAuthor(Author author, Book[] books);
    public List<Book> filterBooksByPublisher(Publisher publisher, Book[] books);

    public List<Book> filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books);


}
