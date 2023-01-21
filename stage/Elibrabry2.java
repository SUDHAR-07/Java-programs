
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.HashMap;
// import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
// import java.util.*;

public class Elibrabry2 {

    static HashMap<String, String> books = new HashMap<>();
    static Scanner scan = new Scanner(System.in);
    static HashMap<String, String> users = new HashMap<>();
    static HashMap<String, String> librarian = new HashMap<>();
    static HashMap<String, String> borrowed = new HashMap<>();
    static int input;
    static String iter;

    // create new user
    public static void user() {

        System.out.println("Register your username");
        String temp = scan.nextLine();
        users.put(temp, null);
        System.out.println("enter your password");
        users.put(temp, scan.nextLine());
        System.out.println("account created successfully & enter your username and pasword details to continue");
    }

    // performing to display list of books
    public static void listBooks() {
        System.out.printf("%-20s%10s", "AuthorName", "BookName" + "\n");
        for (Map.Entry<String, String> get : books.entrySet()) {

            System.out.printf("%-20s%10s", get.getKey(), get.getValue() + "\n");

        }
        System.out.println();
    }

    // public static void updateBooks() {
    // System.out.println("AuthorName to update");
    // String a = scan.next();
    // for (Map.Entry<String, String> get : books.entrySet()) {
    // if(a.equals(get.getKey())){
    // System.out.println("Enter a book name to update");
    // books.put(get.getKey(),get.getValue() = scan.next());
    // }
    // }
    // System.out.println();
    // }
    // performing get book by reader
    public static void getBook(String name, String userr) {
        boolean count = true;
        for (Map.Entry<String, String> loop : books.entrySet()) {
            if (name.equalsIgnoreCase(loop.getValue())) {
                System.out.println("book borrowed successfully");
                borrowed.put(userr, name);
                books.put(loop.getKey(), "empty");
                iter = loop.getKey();
                count = false;
                break;
            }
        }
        if (count) {
            System.out.println("book not available :( ");
        }
        System.out.println();
    }

    // returning function to return book by reader
    public static void returnBook(String name, String userr) {
        for (Map.Entry<String, String> loop : books.entrySet()) {
            if (loop.getKey().equals(iter)) {
                System.out.println("book returned successfully");
                books.put(loop.getKey(), name);
                iter = "";
                break;
            }
        }
        borrowed.remove(userr, name);
        System.out.println();
    }

    // check userName & Password to verify
    public static boolean checKuser(String uName, String password, int input) {
        boolean count = true;
        if (input == 0) {
            for (Map.Entry<String, String> loop : users.entrySet())// verify for user
            {
                if (uName.equalsIgnoreCase(loop.getKey()) && password.equalsIgnoreCase(loop.getValue())) {
                    System.out.println("welcome back Reader");
                    count = false;
                    break;
                }
            }
            System.out.println();
        } else if (input == 1) {
            for (Map.Entry<String, String> loop : librarian.entrySet())// verify for librarian
            {

                if (uName.equalsIgnoreCase(loop.getKey()) && password.equalsIgnoreCase(loop.getValue())) {
                    System.out.println("welcome back Librarian");
                    count = false;
                }
            }
            System.out.println();
        }
        if (count) {
            System.out.println("Mismatch : username or password");
            return false;
        } else {
            return true;
        }
    }

    // access only by librarian to add book to library
    public static void addBooks() {
        System.out.println("Enter how many books want to enter");
        int count = scan.nextInt();

        for (int loop = 0; loop < count; loop++) {
            System.out.println("enter book author name & book name");
            books.put(scan.next(), scan.next());

        }

    }

    // performing book search to check available or not
    public static void searchBook(String name) {
        int check = 0;

        for (Map.Entry<String, String> loop : books.entrySet()) {

            if (loop.getValue().equalsIgnoreCase(name)) {
                System.out.println(loop.getValue() + " is available in the library");
                break;
            } else if (loop.getKey().equalsIgnoreCase(name)) {
                System.out.println("your requested authors books available in library");
                System.out.println(loop.getValue());
                check = 0;
            }

            else {
                check = 1;
            }
        }

        if (check == 1) {
            System.out.println(name + " type of book is not available in the library");
        }
        System.out.println();
    }

    public static void owner() {
        librarian.put("librarian1", "welcome22");
        System.out.print("Enter Your Username  : \n");
        String name = scan.next(); // 1.2
        System.out.println("Enter Your Password : ");
        String pass = scan.next();
        int books = 0, input = 1;
        while (books != 4) {
            if (checKuser(name, pass, input) == true) {

                System.out.println("Enter 1 to add books");
                System.out.println("Enter 2 to get borrowed list ");
                System.out.println("Enter 3 to see books list ");
                System.out.println("Enter 4 to end process\n");

                boolean t = true;
                String inp;
                while (t) {
                    inp = scan.next();
                    try {
                        books = Integer.parseInt(inp);
                        t = false;
                        break;
                    } catch (Exception e) {
                        System.out.println("Enter a valid number");
                        break;
                    }
                }
                if (books == 1) {
                    addBooks(); // 4.1
                } else if (books == 2) {
                    System.out.print("Borrower list : ");
                    for (Map.Entry<String, String> details : borrowed.entrySet()) // 4.2
                    {
                        System.out.println(details.getKey() + " : " + details.getValue());
                    }
                } else if (books == 3) {
                    listBooks();
                }
            }
        }
        return;
    }

    public static void Reader() {
        String username = "";
        int option = 0, input = 0;
        System.out.println("For New user Enter 1" + "\nAlready an user Enter 2 \nFor exit Enter 3"); // 1.1
        System.out.println();
        String inp = scan.next();
        boolean t = true;
        while (t) {
            inp = scan.next();
            try {
                option = Integer.parseInt(inp);
                t = false;
                break;
            } catch (Exception e) {
                System.out.println("Enter a valid number");
                break;
            }
        }
        if (option == 1) {
            user();
        } else if (option == 2) {
            System.out.print("Enter your Username : ");
            String name = scan.next();
            System.out.print("Enter your Password : "); // 2.2
            String pass = scan.next();
            System.out.println();

            if (checKuser(name, pass, input) == true) {
                username = name;
                int optio = 0;
                System.out.println("To see books list enter 1");
                System.out.println("To get book enter 2");
                System.out.println("To search book enter 3");
                System.out.println("To return book  enter 4");
                System.out.println("To end process enter 5");
                while (optio != 5) {
                    System.out.println("Enter a option");
                    optio = scan.nextInt();
                    if (optio == 1) {
                        listBooks();
                        continue;
                    } else if (optio == 2) {
                        System.out.print("Enter Book Name:");
                        String names = scan.next(); // 3.2
                        getBook(names, username);
                        continue;
                    } else if (optio == 3) {
                        System.out.print("Enter Book Name or Author Name : ");
                        String bookName = scan.next(); // 3.3
                        searchBook(bookName);
                        continue;
                    } else if (optio == 4) {
                        System.out.print("Enter Book Name : ");
                        String nam = scan.next(); // 3.4
                        returnBook(nam, username);
                        continue;
                    }
                }
            }
        } else if (option == 3) {
            return;
        }
    }

    public static void main(String[] args) {

        System.out.printf("%60s", "WELCOME TO LIBRARY");
        System.out.println();

        books.put("J.k Rowling", "HarryPotter");
        books.put("stannlee", "Marvel");
        books.put("Major", "DC");

        users.put("Sugesh", "12345");
        users.put("Anbu", "12456");

        librarian.put("sudharsan", "7");
        librarian.put("Mohith", "10");
        boolean t = true;
        String inp;
        while(true) {
            System.out.println("If your'e Reader Enter 1" + "\nIf your'e Librarian Enter 2\nFor Exit Enter 3");
            while (t) {
                inp = scan.next();
                try {
                    input = Integer.parseInt(inp);
                    t = false;
                    break;
                } catch (Exception e) {
                    System.out.println("Enter a valid number");
                    break;
                }
            }
            if (input == 1) {
                Reader();
            } else if (input == 2) {
                owner();
            } else if (input == 3) {
                break;
            }
        } // for 1
    }// main

}// class