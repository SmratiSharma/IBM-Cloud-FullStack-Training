package org.ibm.oops;

public class User implements Persistable {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void save() {
        System.out.println("Saving user to database: " + DB_NAME);
        // Implement actual save logic here
    }

    @Override
    public void load() {
        System.out.println("Loading user from database: " + DB_NAME);
        // Implement actual load logic here
    }

    @Override
    public void delete() {
        System.out.println("Deleting user from database: " + DB_NAME);
        // Implement actual delete logic here
    }

}
