package JavaLibrary;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library, management system.");
        Library library = new Library();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a new book");
            System.out.println("2. View all books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    library.borrowBook();
                    break;
                case 4:
                    library.returnBook();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}