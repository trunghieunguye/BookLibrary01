package Entity;
import Constant.ReaderTypeConstant;

import java.util.Scanner;
public class Reader extends Person {
    private int id;
    private String readerType;
    private int AUTO_ID = 0;

    public Reader() {
        if (AUTO_ID == 0) {
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

    public String getReaderType() {
        return readerType;
    }

    public void setReaderType(String readerType) {
        this.readerType = readerType;
    }

    @Override
    public String toString() {
        return "entity.Reader{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id=" + id +
                ", readerType=" + readerType +
                '}';
    }

    @Override
    public void infoInput() {
        super.infoInput();
        System.out.println("###");
        System.out.println("Type of entity.Reader:");
        System.out.println("1, Student");
        System.out.println("2, Postgraduate Student");
        System.out.println("3, Lecturer");
        System.out.println("###");
        int readerTypeTemp;
        System.out.print("Enter reader type: ");
        do {
            readerTypeTemp = new Scanner(System.in).nextInt();
            if (readerTypeTemp <= 3 && readerTypeTemp >= 1) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (readerTypeTemp) {
            case 1:
                this.readerType = ReaderTypeConstant.STUDENT;
                break;
            case 2:
                this.readerType = ReaderTypeConstant.POSTGRADUATE_STUDENT;
                break;
            case 3:
                this.readerType = ReaderTypeConstant.LECTURER;
                break;
        }
    }

}
