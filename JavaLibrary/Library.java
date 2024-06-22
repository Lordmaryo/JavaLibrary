package JavaLibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> book;
    private Scanner input;

    public Library() {
        book = new ArrayList<>();
        input = new Scanner(System.in);
    }

    public void addBook() {
        System.out.print("Enter book title: ");
        String title = input.nextLine();

        System.out.print("Enter book author: ");
        String author = input.nextLine();

        book.add(new Book(title, author));
        System.out.println("Book Added!");
    }
}
