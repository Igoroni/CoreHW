package Module3;

import java.util.Scanner;

public class Feelings {
    // get input
    public String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write please random sequence of alphabetic characters");
        String result = scanner.nextLine();
        scanner.close();
        return result;
    }

    //calculate feelings
    public String feelingsCount() {

        String [] feelings = {"angar", "awe", "joy", "lovo", "grief"};
        int count = 0;
        String input = input();

        x: for (String  feeling: feelings) {

            String [] feelingByLetters = feeling.split("");
            String tmp = input;

            for (String letter: feelingByLetters) {
                if(!tmp.contains(letter)) continue x;
                tmp = tmp.replaceFirst(letter, "");
            }
            count++;
        }
        return count + " feelings";
    }
}

class TestFeelings {
    public static void main(String[] args) {
        Feelings feelings = new Feelings();
        System.out.println(feelings.feelingsCount());
    }
}
