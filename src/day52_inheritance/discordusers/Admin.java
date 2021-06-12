package day52_inheritance.discordusers;

public class Admin extends User{

    public Admin() {
        super();
        System.out.println("Admin class constructor");
    }

    public String toString() {
        return "Admin{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }

}
