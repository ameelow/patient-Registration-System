import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author;
    }
}

public class LibrarySystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter Book ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Enter Title: ");
                String title = input.nextLine();

                System.out.print("Enter Author: ");
                String author = input.nextLine();

                books.add(new Book(id, title, author));
                System.out.println("Book added successfully!");

            } else if (choice == 2) {
                System.out.println("\n--- Book List ---");
                for (Book b : books) {
                    System.out.println(b);
                }

            } else if (choice == 3) {
                System.out.println("Exiting system...");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        input.close();
    }
}
