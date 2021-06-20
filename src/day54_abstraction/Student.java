package day54_abstraction;

public abstract class Student {
    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }
    public abstract void attendClass();
}

// this class is considered concrete class
class OnlineStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Online student is attending the class using Zoom");
    }
}

class StudentObjects {

    public static void main(String[] args) {
        OnlineStudent student = new OnlineStudent();
        student.attendClass();
        student.code("Java");
    }
}
