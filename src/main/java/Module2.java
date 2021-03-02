import java.util.Scanner;

public class Module2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("We need some info about you).");
        System.out.println("Enter please your  name");
        String name = scanner.nextLine();
        System.out.println("Where do you live now?(City name)");
        String city = scanner.nextLine();
        System.out.println("Your age?");
        int age = scannerInt.nextInt();
        System.out.println("Your hobby?");
        String hobby = scanner.nextLine();


        String answersBorder = "*";
        String delimiter = " ";
        int numberOfRepeats = 20;
        //first version
        System.out.println(answersBorder.repeat(numberOfRepeats));
        System.out.println("Name:     " + name);
        System.out.println("City:     " + city);
        System.out.println("Age:      " + age);
        System.out.println("Hobby:    " + hobby);

        //second version
        System.out.println(answersBorder.repeat(numberOfRepeats));
        System.out.println("The human being with name " + name + " lives in " + city+ " city.");
        System.out.println("This human being is " + age + " years old and likes to do " + hobby);

        //third version
        System.out.println(answersBorder.repeat(numberOfRepeats));
        System.out.println(name + "- name");
        System.out.println(city + " - city");
        System.out.println(age + " - age");
        System.out.println(hobby + " - hobby");
        System.out.println(answersBorder.repeat(numberOfRepeats));
    }
}
