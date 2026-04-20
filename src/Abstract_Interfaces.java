import java.util.Scanner;


abstract class Animal1{               // L1 -----Abstract class&Methods
    abstract void makeSound();
}
class Dog1 extends Animal1{
    @Override
    void makeSound(){
        System.out.println("Barking");
    }
}class Cat1 extends Animal1{
    @Override
    void makeSound(){
        System.out.println("meowing");
    }
}

/*abstract class Notification{             // L2 -----------
    abstract void send(String message);
}
class EmailNotification extends Notification{
    @Override
    void send(String message){
        System.out.println("Sending Email : "+ message);
    }
}
class SmsNotification extends Notification{
    @Override
    void send(String message){
        System.out.println("Sending SMS : "+ message);
    }
}*/

abstract class Vehicle1{            // L3 ------------
    abstract void start();
}
class Bike extends Vehicle1 {
    @Override
    void start(){
        System.out.println(" Bike Starts");
    }
}
class Car extends Vehicle1 {
    @Override
    void start(){
        System.out.println(" Car Starts");
    }
}

//#########################################################################
public class Abstract_Interfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal1 a = new Dog1();        // L1 -----Abstract class&Methods
        Animal1 b = new Cat1();
        a.makeSound();
        b.makeSound();

        /*Notification n;               // L2 ------------
        System.out.println("Enter Message to send :");
        String input = sc.nextLine();
        System.out.println("Choose Notification Typer : ");
        System.out.println("Email");
        System.out.println("sms : ");
        int choice = sc.nextInt();
        if (choice == 1){
            n = new EmailNotification();
        }else {
            n = new SmsNotification();
        }
        n.send(input);*/

        Vehicle1 v;                     // L3 --------------
        System.out.println("Which Vehicle You Wanna Start : ");
        System.out.println("1: Car");
        System.out.println("2: Bike");
        int choice = sc.nextInt();
        if (choice == 1){
            v = new Car();
        }else {
            v = new Bike();
        }
        v.start();

    }
}
