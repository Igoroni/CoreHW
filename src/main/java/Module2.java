import java.util.Scanner;

public class Module2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We need some info about you).");
        System.out.println("Enter please your  name");
        String name = scanner.nextLine();
        System.out.println("Where do you live now?(City name)");
        String city = scanner.nextLine();
        System.out.println("Your age?");
        int age = scanner.nextInt();
        System.out.println("Your hobby?");
        String hobby  = scanner.nextLine();

        

    }
}
