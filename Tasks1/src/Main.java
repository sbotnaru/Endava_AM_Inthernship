import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    /*Task 1
     * Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the intege*/
    public static int sumOfDigits(int number) {

        int sum = 0;

        while (number != 0) {

            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    /*Task 2
     * Write a Java program that accepts two integers from the user and then prints the sum,
     * the difference, the product, the average, the distance (the difference between integer),
     * the maximum (the larger of the two integers), the minimum (smaller of the two integers)*/
    public static void operations() {
        int number1, number2;

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Input 1st integer:");
        number1 = Integer.parseInt(myObj.nextLine());
        System.out.println();
        System.out.print("Input 2nd integer:");
        number2 = Integer.parseInt(myObj.nextLine());
        System.out.println();
        System.out.println("Sum of two integers:" + (number1 + number2) + "" +
                "\nDifference of two integers:" + (number1 - number2) + "" +
                "\nProduct of two integers:" + (number1 * number2) + "" +
                "\nAverage of two integers:" + ((number1 + number2) / 2) + "" +
                "\nDistance of two integers" + (number1 - number2) + "" +
                "\nMax integer:" + (number1 > number2 ? number1 : number2) + "" +
                "\nMin integer:" + (number1 < number2 ? number1 : number2));
    }

    /*Task 3
     * Write a Java program to reverse a strin*/
    public static String reverseString(String str) {
        String temp = "";
        int size = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            temp += str.charAt(size--);
        }
        str = temp;
        return str;
    }

    public static String reverseStringRecursive(String string) {
        if (string.isEmpty()) {
            return string;
        } else {
            System.out.println("String to be passed in Recursive Function: "+string.substring(1));
            return reverseStringRecursive(string.substring(1)) + string.charAt(0);
        }
    }

    /*Task 4
     * Write a program / method that checks if a word is palindrom*/
    public static boolean checkPalindrome(String str) {
        int size = str.length() - 1;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(size--)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /*Task 5
     * Write a Java program to count the letters, spaces, numbers and other characters of an input string.*/
    public static void countLettersSpacesIntegers(String str) {

        int countLetters = 0;
        int countSpaces = 0;
        int countNumbers = 0;
        int countOthers = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.codePointAt(i) >= 65) && (str.codePointAt(i) <= 90) || (str.codePointAt(i) >= 97) && (str.codePointAt(i) <= 122)) {
                countLetters++;
            } else if (str.codePointAt(i) == 32) {
                countSpaces++;
            } else if ((str.codePointAt(i) >= 48) && (str.codePointAt(i) <= 57)) {
                countNumbers++;
            } else {
                countOthers++;
            }
        }
        System.out.println("The string is : " + str + "" +
                "\nletters: " + countLetters + "" +
                "\nspces: " + countSpaces + "" +
                "\nnumbers: " + countNumbers + "" +
                "\nothers: " + countOthers);
    }

    /*Task 6
     * Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both*/
    public static void checkIfNumberDivideBy3And5() {
        List<Integer> dividedBy3 = new ArrayList<>();
        List<Integer> dividedBy5 = new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                dividedBy3.add(i);
            } else if (i % 5 == 0) {
                dividedBy5.add(i);
            }
        }

        System.out.println("Divided by 3:" + dividedBy3 + "" +
                "\nDivided by 5:" + dividedBy5);
    }

    /*Task 7
     Write a Java method that takes as parameter array of different objects (string, char, int, long,
     Person – need to create Person class with fields Name, Age, Gender), method must concatenate all strings and characters,
     sum all numbers, make separate array with persons only*/
    public static String concatenateAllParameters(Object[] array) {

        String concatenateStrings = "";
        Integer sum = 0;
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if ((array[i] instanceof String) || (array[i] instanceof Character)) {

                concatenateStrings += array[i] + " ";
            } else if (array[i] instanceof Integer) {
                sum += (int) array[i];
            } else if (array[i] instanceof Person) {
                people.add((Person) array[i]);
            }
        }
        return concatenateStrings + "\nSum: " + sum + "\nPeople: " + people;
    }

    public static void main(String[] args) {
        Object[] array = {"Today", new Person("Alex", 23, "Male"), "is", 23, 652, 'a', new Person("Ion", 34, "Male"), "Big", "Day"};


    }

}

