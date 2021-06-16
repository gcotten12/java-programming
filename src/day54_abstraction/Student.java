package day54_abstraction;

public abstract class Student {
    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }
    public abstract void attendClass();
}

class OnlineStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Student will attend online");
    }
}

class StudentObjects {

    public static void main(String[] args) {
        OnlineStudent student = new OnlineStudent();
        student.attendClass();
        student.code("Java");
    }
}
