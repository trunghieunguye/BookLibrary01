package Entity;
import java.util.Scanner;
public class Person {
    protected String fullName;
    protected String address;
    protected String phoneNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "entity.Person{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void infoInput(){
        System.out.print("Enter Full Name: ");
        this.fullName =new Scanner(System.in).next();
        System.out.print("Enter Address: ");
        this.address =new Scanner(System.in).next();
        System.out.print("Enter Phone Number: ");
        this.phoneNumber =new Scanner(System.in).next();
    }
}
