package Module3;

import java.util.Scanner;

public class Greed {

    //get input from user and transform it from String to String[]
    public String [] inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write please 5 numbers from 1 to 6, with 1 space between each of them");
        String input = scanner.nextLine().strip();
        scanner.close();
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

    // check there only one digit in every cell
    public boolean verifyOneDigit(String [] numbers) {
        for(String number: numbers) {
            if (number.length() != 1) {
                System.out.println("Some number has more than one digit.Please thy again.");
                return false;
            }
        }
        return true;
    }

    //check all the digits are legal
    public boolean numbersRangeIsOk(String [] numbers) {
        boolean result = true;
        for (String number : numbers) {
            result = number.matches("[1-6]");
            if (!result) {
                result = false;
                System.out.println("Some number is out of range. Please thy again.");
                break;
            }
        }
        return result;
    }

    //Verification Summary
    public String [] verificationOk() {
        String [] numbers = inputNumbers();

        boolean result =  numbersRangeIsOk(numbers) && verifyOneDigit(numbers) && quantityOfNumbersIsOk(numbers);

        if (!result) verificationOk();

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

class Test {
    public static void main(String[] args) {
        Greed greed = new Greed();
        System.out.println(greed.pointsCount());
    }
}
