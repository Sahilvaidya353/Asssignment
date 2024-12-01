package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import DaoInterface.AuthorDaoImp;
import Entity.Author;
import Entity.Book;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthorDaoImp authorDAO = new AuthorDaoImp();

        while (true) {
            System.out.println("\n1. Add Author");
            System.out.println("2. Retrieve Author by ID");
            System.out.println("3. Update Author");
            System.out.println("4. Delete Author");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 : {
                    Author author = new Author();
                    System.out.print("Enter author name: ");
                    author.setName(scanner.next());
                    System.out.print("Enter author DOB (yyyy-mm-dd): ");
                    author.setDob(LocalDate.parse(scanner.next()));
                    System.out.print("Enter author country: ");
                    author.setCountry(scanner.next());

                    System.out.print("Enter number of books: ");
                    int bookCount = scanner.nextInt();
                    ArrayList<Book> books = new ArrayList<>();
                    for (int i = 0; i < bookCount; i++) {
                        Book book = new Book();
                        System.out.print("Enter book title: ");
                        book.setTitle(scanner.next());
                        System.out.print("Enter publication year: ");
                        book.setPublicationYear(scanner.nextInt());
                        System.out.print("Enter book price: ");
                        book.setPrice(scanner.nextDouble());
                        books.add(book);
                    }
                    author.setBooks(books);
                    authorDAO.addAuthor(author);
                }
                case 2 : {
                    System.out.print("Enter author ID: ");
                    int id = scanner.nextInt();
                    Author author = authorDAO.getAuthorById(id);
                    System.out.println("Author Details: " + author);
                    System.out.println("Books: " + author.getBooks());
                }
                case 3 : {
                    System.out.print("Enter author ID to update: ");
                    int id = scanner.nextInt();
                    Author author = authorDAO.getAuthorById(id);
                    if (author != null) {
                        System.out.print("Enter new name: ");
                        author.setName(scanner.next());
                        System.out.print("Enter new DOB (yyyy-mm-dd): ");
                        author.setDob(LocalDate.parse(scanner.next()));
                        System.out.print("Enter new country: ");
                        author.setCountry(scanner.next());
                        authorDAO.updateAuthor(author);
                    } else {
                        System.out.println("Author not found!");
                    }
                }
                case 4 : {
                    System.out.print("Enter author ID to delete: ");
                    int id = scanner.nextInt();
                    authorDAO.deleteAuthor(id);
                }
                case 5 : {System.exit(0);}
                default : { System.out.println("Invalid choice!");}
            }
        }
    }
}
