package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1+2 = 3
        System.out.println(" 1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;  // 3 - 1 = 2
        System.out.println(" 3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10
        System.out.println(" 2 * 10 = " + result);

        result = result / 2; // 20 / 2 = 10
        System.out.println("20 / 2 = " + result);

        result = result % 3;  // remainder of (10 % 3) = 1
        System.out.println("10 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 =2
        System.out.println(" 1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println(" 2 - 1 = " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);

        // result = result * 10
        result *= 10;  // 3 * 10 = 30
        System.out.println(" 3 * 10 = " + result);

        // result = result / 10
        result /= 5;  // 30 / 5 = 6
        System.out.println(" 30 / 5 = " + result);


        // result = result - 2
        result -= 2;  // 6 - 2 = 4
        System.out.println(" 6 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println(("It is not an alien!"));
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score! ");
        }

        // ADN operator
        int secondTopScore = 79;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than seccond top score and less than 100");
        }

        // OR operator
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either both of the condition are true");
        }

        int newValue = 50;
        if (newValue == 50);{
            System.out.println("This is an true");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not suppose to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("was car is true");
        }


        // Operator Challenge
        // Create double variable with 20.00 and 80.00
        double myFirstValue = 20.00;
        double mySecondValue = 80.00;
        // add both numbers together and multiply by 100
        double myValueTotal = ((myFirstValue + mySecondValue) * 100.00d);
        System.out.println("MyValuesTotal = " + myValueTotal);
        // use remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00
        //we use the module or remainder operator on ints in the course but we can also use it on a double
        double theRemainder = myValueTotal % 40.00d;
        System.out.println("theRemainder = "  + theRemainder);
        // Create boolean variable that assign the value true if the remainder in #4 is 0, or false if its not zero.
        boolean isNoRemainder = ( theRemainder == 0) ? true : false;
        System.out.println(" isNoRemainder = " + isNoRemainder );
        // write if-then statement that displays a message " Got some Remainder ". If the boolean in step 5 is not true
        //don't be surprise if you see output for this step where you might expect it not to show. Explaination given
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
