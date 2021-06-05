package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 35;
        t1.talk();
        t1.teach("Java Inheritance");

        Student s1 = new Student();
        s1.name = "Garrett";
        s1.age = 18;
        s1.school = "Cybertek";
        s1.study("Java");

        EBook e1 = new EBook();
            e1.title = "Smite";
            e1.author = "Garrett Cotten";
            e1.pages = 50;
            e1.size = 120;
            e1.price = 20.99;
            e1.getEBook();




    }
}
