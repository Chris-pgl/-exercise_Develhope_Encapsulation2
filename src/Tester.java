import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Person person1 = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        person1.setName(scanner.nextLine());

        System.out.println("Please enter your Surname: ");
        person1.setName(scanner.nextLine());

        System.out.println("Please enter your height: ");
        person1.setHeight(scanner.nextDouble());

        System.out.println("Please enter you age: ");
        person1.setAge(scanner.nextInt());


        System.out.printf("Your Name is: %s %n ",person1.getName());
        System.out.printf("Your Surname is: %s %n ",person1.getSurname());
        System.out.printf("Your height is: %f %n ",person1.getHeight());
        System.out.printf("Your age is: %d ",person1.getAge());
    }
}
