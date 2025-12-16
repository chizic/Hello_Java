import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*
         * Write a code that receives someone's name and year of birth
         * and print the following message on the screen:
         *  "Hello 'peter', you are 'X' years old"
         * */
        //Scanner scanner = new Scanner(System.in);
        var baseYear = LocalDate.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.next();
        System.out.println("Date of birth? (YYYY): ");
        int birthYear = scanner.nextInt();
        var age = baseYear - birthYear;


        //System.out.println("You are "+ name +" and you are "+ age +" years old");
        System.out.printf("Hello %s you are %s years old.\n\n", name, age);


        /*
        * Write a code that receives the side length of a square,
        * calculate the area and display it on the screen.
        *   Formula: area = side x side
        * */
        var sc = new Scanner(System.in);
        System.out.println("What's the side length of the square?");
        int sideLength = sc.nextInt();
        int areaSquare = sideLength * sideLength;
        System.out.printf("Ok, if the side length is %s, then the area of the square is:" +
                " %s X %s = %s\n", sideLength, sideLength, sideLength, areaSquare);


        /*
        * Write a code that receives the base and height of a rectangle,
        * calculates its area and displays it on the screen.
        *   Formula: area = base x height
        * */

        System.out.println("\nWhat's the base of the rectangle?");
        var base = sc.nextInt();
        System.out.println("What's the height of the rectangle?");
        var height = sc.nextInt();
        var areaRectangle = base * height;

        System.out.printf("The area of the rectangle is: %s X %s = %s\n\n", base, height, areaRectangle);


        /*
        * Write a code that receives the name and age of two people and print
        * the difference between their ages.
        * */

        System.out.println("Please type age number 1:");
        var age1 = sc.nextInt();
        System.out.println("Please type age number 2:");
        var age2 = sc.nextInt();
        var difference = (age1 > age2)? age1 - age2 : age2 - age1;
        System.out.printf("The difference between ages is %s years apart\n ", difference);

        
    
    }
}
