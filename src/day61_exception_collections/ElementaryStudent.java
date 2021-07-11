package day61_exception_collections;

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent() {}

    public ElementaryStudent(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty"); // regular people will not understand what null is
        }
        // if name is all numbers, or starts with number
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 5 || age > 12) {
            throw new IllegalArgumentException("Age must be between 5 & 12 years old");
        }
        this.age = age;
    }
}
