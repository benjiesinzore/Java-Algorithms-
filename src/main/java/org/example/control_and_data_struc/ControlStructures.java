package org.example.control_and_data_struc;

public class ControlStructures {

    public static void main(String[] args) {
        new ControlStructures().if_();
    }


    /**
     * The if statement executes a block of code if its condition evaluates to true.
     * */
    public void if_() {
        int age = 18;

        if (age >= 18) {
            System.out.println("You are an adult.");
        }
    }


    /**
     * The if-else statement provides an alternative block of code if the condition is false.
     * */
    public void if_else() {int age = 16;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }

    }


    /**
     * The else if ladder allows multiple conditions to be checked in sequence.
     * */
    public void else_if() {int age = 16;

        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

    }


    /**
     * The switch statement allows a variable to be tested for equality against a list of values.
     * */
    public void switch_() {int age = 16;

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }


    /**
     * The for loop is used to iterate over a range of values.
     * */
    public void for_() {
        int age = 16;
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }
    }


    /**
     * The for-each loop is used to iterate over a range of values.
     * */
    public void for_each() {

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i : numbers) {
            System.out.println("i: " + i);
        }
    }


    /**
     * The while loop repeats a block of code as long as its condition remains true.
     * */
    public void while_() {

        int i = 0;

        while (i < 5) {
            System.out.println("i: " + i);
            i++;
        }

    }


    /**
     * The do-while loop is similar to the while loop but guarantees that the block of code is executed at least once.
     * */
    public void do_while() {

        int i = 0;

        do {
            System.out.println("i: " + i);
            i++;
        } while (i < 5);

    }


    /**
     * The break statement exits the nearest enclosing loop or switch statement.
     * */
    public void break_() {

        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break; // exits the loop when j is 5
            }
            System.out.println("j: " + j);
        }

    }


    /**
     * The continue statement skips the current iteration of the loop and proceeds with the next iteration.
     * */
    public void continue_() {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // skips the rest of the loop for even i
            }
            System.out.println("i: " + i);
        }

    }


    /**
     * The return statement exits from the current method and optionally returns a value.
     * */
    public int return_() {

        int retVal = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            retVal++;
        }
        return retVal;
    }

}
