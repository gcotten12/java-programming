package day59_polymorphism_exceptions;

public class InputField implements WebElement {
    @Override
    public void sendKeys(String txt) {
        System.out.println("typing into input field - " + txt);
    }

    @Override
    public void click() {
        System.out.println("");
    }

    @Override
    public String getText() {
        System.out.println("getting text of input field");
        return "java";
    }

    public String getValue() {
        System.out.println("getting value in the input field");
        return "selenium";
    }

}
