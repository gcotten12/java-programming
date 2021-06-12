package day52_inheritance.discordusers;

public class B22Discord {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Garrett");
        user1.setRole("Student");
        System.out.println(user1);

        Admin admin = new Admin();
        admin.setId(4321);
        admin.setName("Zach");
        admin.setRole("Admin");
        System.out.println(admin);
    }
}
