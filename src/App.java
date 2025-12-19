import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
            Pick a number between 1 and 4 to select a program to run:
            1 - Greet user and calculate age;
            2 - Calculate area of a square;
            3 - Calculate area of a rectangle;
            4 - Calculate age difference between two people.
            """);

        var option = scanner.nextInt();
        switch (option){
            case 1 ->{
                // Greet user and calculate age
                var baseYear = LocalDate.now().getYear();
        
                System.out.println("What's your name?");
                String name = scanner.next();
                System.out.println("Date of birth? (YYYY): ");
                int birthYear = scanner.nextInt();
                var age = baseYear - birthYear;


                //System.out.println("You are "+ name +" and you are "+ age +" years old");
                System.out.printf("Hello %s you are %s years old.\n\n", name, age);

            }
            case 2 -> {
                // Calculate area of a square
                System.out.println("What's the side length of the square?");
                int sideLength = scanner.nextInt();
                int areaSquare = sideLength * sideLength;
                System.out.printf("Ok, if the side length is %s, then the area of the square is: %s X %s = %s\n\n", sideLength, sideLength, sideLength, areaSquare);
            }
            case 3 -> {
                // Calculate area of a rectangle
                System.out.println("What's the base of the rectangle?");
                var base = scanner.nextInt();
                System.out.println("What's the height of the rectangle?");
                var height = scanner.nextInt();
                var areaRectangle = base * height;

                System.out.printf("The area of the rectangle is: %s X %s = %s\n\n", base, height, areaRectangle);
            }
            case 4 -> {
                // Calculate age difference between two people
                System.out.println("Please type age number 1:");
                var age1 = scanner.nextInt();
                System.out.println("Please type age number 2:");
                var age2 = scanner.nextInt();
                var difference = (age1 > age2) ? age1 - age2 : age2 - age1;
                System.out.printf("The difference between ages is %s years apart\n ", difference);
            }
        }

        
        System.out.println("Thanks for trying out my first program!");
        
    
    }
}
