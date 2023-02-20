package Entity;
import Constant.BookTypeConstant;

import java.util.Scanner;
public class Book {
    private int id;
    private String name;
    private String author;
    private String bookType;
    private int yearPublish;
    private int AUTO_ID = 0;

    public Book(){
        if (AUTO_ID == 0){
            AUTO_ID = 9999;
        }
        AUTO_ID++;
        this.id = AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public void infoInput(){
        System.out.print("Enter entity.Book Name: ");
        this.name =new Scanner(System.in).next();
        System.out.print("Enter Author: ");
        this.author =new Scanner(System.in).next();
        System.out.print("Enter Publish Year: ");
        this.yearPublish =new Scanner(System.in).nextInt();
        System.out.println("###");
        System.out.println("Type of entity.Book:");
        System.out.println("1, Science");
        System.out.println("2, Literature & Art");
        System.out.println("3, Electronics & Telecommunication");
        System.out.println("4, Technology");
        System.out.println("###");
        int bookTypeTemp;
        System.out.print("Enter book type: ");
        do {
            bookTypeTemp = new Scanner(System.in).nextInt();
            if (bookTypeTemp <= 4 && bookTypeTemp >= 1) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (bookTypeTemp) {
            case 1:
                this.bookType = BookTypeConstant.SCIENCE;
                break;
            case 2:
                this.bookType = BookTypeConstant.LITERATURE_ART;
                break;
            case 3:
                this.bookType = BookTypeConstant.ELECTRONICS_TELECOMMUNICATION;
                break;
            case 4:
                this.bookType = BookTypeConstant.TECHNOLOGY;
                break;
        }

    }

    @Override
    public String toString() {
        return "entity.Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookType='" + bookType + '\'' +
                ", yearPublish=" + yearPublish +
                '}';
    }

}
