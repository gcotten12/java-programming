package day59_polymorphism_exceptions;

public class Link implements WebElement {
    public static final String TAG = "a";

    @Override
    public void sendKeys(String txt) {
        System.out.println("not supported");
    }

    @Override
    public void click() {
        System.out.println("clicking the link");
    }

    @Override
    public String getText() {
        return "Oracle Jave";
    }

    public void getLinkHref() {
        System.out.println("https://www.java.com");
    }

}
