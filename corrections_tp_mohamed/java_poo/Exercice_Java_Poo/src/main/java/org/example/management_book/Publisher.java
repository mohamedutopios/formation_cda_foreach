package org.example.management_book;

public class Publisher {
    private int id;
    private static int count=0;

    private String publisherName;

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    public Publisher(int id, String publisherName) {
        this.id = id;
        this.publisherName = publisherName;
    }

    public int getId() {
        return id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return " publisherName ";
    }
}
