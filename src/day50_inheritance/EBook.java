package day50_inheritance;

public class EBook extends Book{
    int size;
    int pages;

    public void getEBook() {
        System.out.println("Reading: " + title);
        System.out.println("Written by: " + author);
        System.out.println("It has " + pages + " pages amd is " + size + " kbs");
        System.out.println("It costs " + price);

    }
}
