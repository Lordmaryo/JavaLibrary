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
                System.out.println("======================");
                System.out.println(book);
                System.out.println("======================");
            }
        }
    }

    public void borrowBook() {
        System.out.print("Enter title of books you would like to borrow: ");
        String title = input.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()) {
                book.borrowBook();
                System.out.println("Book borrowed successfully");
                return;
            }
        }

        System.out.println("Book selected Unavailable");
    }

    public void returnBook() {
        System.out.print("Enter title of book you would like to return: ");
        String title = input.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isBorrowed()) {
                book.returnBook();
                System.out.println("Book returned successfully");
                return;
            }
        }

        System.out.println("Book selected Unavailable");
    }
}
