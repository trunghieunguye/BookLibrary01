
import Entity.Book;
import Entity.Reader;

import java.util.Scanner;

public class Main {
    public static Reader[] readers = new Reader[90000];
    public static Book[] books = new Book[90000];

    public static void main(String[] args) {
        while (true) {
            functionMenu();
            int functionChoice = functionChoice();
            functionExecute(functionChoice);
        }
    }

    public static void functionMenu() {
        System.out.println("------------LIBRARY MAIN PAGE-------------");
        System.out.println("     ~~~PLEASE CHOOSE A FUNCTION~~~       ");
        System.out.println("1, Nhập danh sách đầu sách mới. In ra danh sách các đầu sách đã có.");
        System.out.println("2, Nhập danh sách bạn đọc mới. In ra danh sách bạn đọc đã có.");
        System.out.println("3, Lập bảng QL mượn sách cho từng bạn đọc bằng cách nhập các đầu sách mà bạn đọc mượn, và in danh sách ra màn hình (chú ý: cùng một loại bạn đọc với một đầu sách thì không thể xuất hiện 2 lần trong bảng này).");
        System.out.println("4, Sắp xếp danh sách Quản lý mượn sách: Theo tên bạn đọc, Theo Số lượng cuốn sách được mượn (giảm dần)");
        System.out.println("5, Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc.");
        System.out.println("6, Thoát chương trình");
        System.out.println("------------------------------------------");
    }

    public static int functionChoice() {
        int functionChoice;
        System.out.print("Execute function: ");
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice <= 6 && functionChoice >= 1) {
                break;
            }
            System.out.print("Invalid input, please try again: ");
        } while (true);
        return functionChoice;
    }

    public static void functionExecute(int functionChoice) {
        switch (functionChoice) {
            case 1:
                addBooks();
                displayBooksInfo();
                break;
            case 2:
                addReaders();
                displayReadersInfo();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.exit(0);
        }
    }

    public static void addBooks() {
        System.out.print("Enter number of new books: ");
        int numb = new Scanner(System.in).nextInt();
        for (int i = 0; i < numb; i++) {
            Book book = new Book();
            for (int j = 0; j < books.length; j++) {
                if (books[j] == null) {
                    books[j] = book;
                    break;
                }
            }
        }
    }

    public static void displayBooksInfo() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println((i + 1) + ", " + books[i]);
            }
        }
    }

    public static void addReaders() {
        System.out.print("Enter number of new readers: ");
        int numb = new Scanner(System.in).nextInt();
        for (int i = 0; i < numb; i++) {
            Reader reader = new Reader();
            reader.infoInput();
            for (int j = 0; j < readers.length; j++) {
                if (readers[j] == null) {
                    readers[j] = reader;
                    break;
                }
            }
        }
    }

    public static void displayReadersInfo() {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] != null) {
                System.out.println((i + 1) + ", " + readers[i]);
            }
        }
    }
}
