package day48_constructors_static;

public class Customer {
    private String name;
    private int id;

    // constructor
    public Customer() {
        System.out.println("No arg constructor");
        name = "new customer";
        id = -1;
    }

    public Customer(String name, int id) {
        this.name = name; // setname(name)
        this.id = id; // setId(id)
    }

    // getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // toString method
    @Override
    public String toString() {
        return "Customer information\n" +
                "name: " + name + "\n" +
                "id#: " + id;
    }
}
