package org.example.poo.statique;

public class User {

    private static int count;
    private int id;
    private String name;


    {
        ++count;
    }

    public User() {
        this.id = count;
    }

    public User(String name) {
        this.id = count;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }


    public static void setCount(int count) {
        User.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User :" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
