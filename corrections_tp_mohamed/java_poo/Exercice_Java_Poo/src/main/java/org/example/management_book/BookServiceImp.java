package org.example.management_book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BookServiceImp implements BookService {
    @Override
    public List<Book> filterBooksByAuthor(Author author, Book[] books) {
        List<Book> newList = new ArrayList<Book>();
        for (Book b: books) {
            for (Author a: b.getAuthors()) {

                if(author.getId() == a.getId())
                {
                    newList.add(b);
                }
                else if((author.firstName.equals(a.firstName)) && (author.lastName.equals(a.lastName)))
                {
                    newList.add(b);
                }
            }
        }
        return newList;
    }

    @Override
    public List<Book> filterBooksByPublisher(Publisher publisher, Book[] books) {
        List<Book> newList = new ArrayList<Book>();
        for (Book b: books) {
            if((b.publisher.getPublisherName().equals(publisher.getPublisherName())) || b.publisher.getId() == publisher.getId())
            {
                newList.add(b);
            }
        }
        return newList;
    }

    public List<Book> filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        List<Book> newList = new ArrayList<Book>();
        for (Book b: books) {
            if(b.publishingYear >= yearFromInclusively)
            {
                newList.add(b);
            }
        }
        return newList;
    }
}
