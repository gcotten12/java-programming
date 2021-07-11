package day61_exception_collections;

public class ElementaryStudentTests {
    public static void main(String[] args) {
        try {
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Bob");
            el1.setAge(1);
        } catch(Exception e) {
            e.printStackTrace(); // will allow us to run the code so it doesn't fail
        }
        System.out.println("Execution Complete");
    }
}
