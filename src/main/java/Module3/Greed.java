package Module3;

import java.util.Scanner;

public class Greed {

    //get input from user and transform it from String to String[]
    Scanner scanner = new Scanner(System.in);

    public String [] inputNumbers() {
        System.out.println("Write please 5 numbers from 1 to 6, with 1 space between each of them");
        String input = scanner.nextLine().strip();
       // scanner.close();
        return input.split(" ");
    }

    // check length of numbers Array
    public boolean quantityOfNumbersIsOk(String[] numbers) {
        if (numbers.length != 5) {
            System.out.println("There must be 5 numbers exactly. Please thy again.");
            return false;
        }
        return true;
    }

    //check all the digits are legal
    public boolean numbersRangeIsOk(String [] numbers) {
        boolean result = true;
        for (String number : numbers) {
            result = number.matches("[1-6]");
            if (!result) {
                System.out.println("Some number is out of range or extra space between them. Please thy again.");
                break;
            }
        }
        return result;
    }

    //Verification Summary
    public String [] verificationOk() {
        String [] numbers = inputNumbers();

        boolean result =  numbersRangeIsOk(numbers) && quantityOfNumbersIsOk(numbers);

        if (!result) verificationOk();

        scanner.close();
        return numbers;
    }

    //How many instances of each number is there
    public int[] quantityOfEach() {

        int [] quantityOfEach = new int[6] ;
        String [] numbers = verificationOk();

        for (int i = 1; i <= 6; i++) {
            int count = 0;
            for( String number: numbers) {
                if(Integer.parseInt(number) == i) {
                    count++;
                }
            }
            quantityOfEach[i -1] = count;
        }
        return quantityOfEach;
    }


    //final method
    public int pointsCount() {

        int [] quantityOfEach = quantityOfEach();
        int sum = 0;

        for(int i = 0; i < quantityOfEach.length; i++) {
            if (quantityOfEach[i] >= 3) {
                quantityOfEach[i] -= 3;
                if (i == 0) {
                    sum += 1000;
                } else {
                    sum += (i + 1) * 100;
                }
            }
        }

        if(quantityOfEach[0] > 0) sum += quantityOfEach[0] * 100;
        if(quantityOfEach[4] > 0) sum += quantityOfEach[4] * 50;

        return sum;
    }
}

class TestGreed {
    public static void main(String[] args) {
        Greed greed = new Greed();
        System.out.println(greed.pointsCount());
    }
}
