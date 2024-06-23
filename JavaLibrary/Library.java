package JavaLibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private final ArrayList<Book> books;
    private final Scanner input;

    public Library() {
        books = new ArrayList<>();
        input = new Scanner(System.in);
    }

    public void addBook() {
        System.out.print("Enter books title: ");
        String title = input.nextLine();

        System.out.print("Enter books author: ");
        String author = input.nextLine();

        books.add(new Book(title, author));
        System.out.println("Book Added!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books left");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
