import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        while (true){


            System.out.println("----------Hello, World!----------\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
            Pick a number between 1 and 4 to select a program to run:
            1 - Greet user and calculate age;
            2 - Calculate area of a square;
            3 - Calculate area of a rectangle;
            4 - Calculate age difference between two people.
            5 - Generate times-table for a given number.
            6 - Calculate IMC.
            7 - List odd or even numbers between two numbers.
            8 - Input divisors of a given number.
            0 - Exit program.
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
            case 5 -> {
                // Generate times-table
                System.out.println("Please type a number to generate the times-table");
                var num = scanner.nextInt();
                for (int i =1;i<11;i++){int result = num*i;
                     System.out.printf("%s X %s = %s\n",num,i,result);
                    }
            }
            case 6 ->{
                //Calculate IMC(IMC = weight/(height * height))
                System.out.println("type weight (using coma in decimal form, eg. 75,2).");
                var weight = scanner.nextDouble();
                System.out.println("type height (using coma in decimal form eg 1,65).");
                var height = scanner.nextDouble();
                var imc =weight/(height*height);

                if (imc<=18.5){System.out.println("Underweight");}
                else if (imc>=18.6&&imc<=24.9){System.out.println("Ideal weight");}
                else if (imc>=25.0&&imc<=29.9){System.out.println("slightly over weight");}
                else if (imc>=30.0&&imc<=34.9){System.out.println("Obesity 1");}
                else if (imc>=35.0&&imc<=39.9){System.out.println("Obesity 2");}
                else if (imc>=40){System.out.println("Obesity 3");}
                else {System.out.println("invalid IMC");}
            }
            case 7 -> {
                System.out.println("Type a number:");
                int n1 = scanner.nextInt();
                System.out.println("Type a bigger number:");
                int n2 = scanner.nextInt();
                System.out.println("Type 1 for even numbers, 2 for odd numbers:");
                int tipo = scanner.nextInt();

                int parity = (tipo == 1) ? 0 : 1; // 0 = even, 1 = odd
                if (n2 % 2 != parity) n2--; // align to requested parity

                for (int x = n2; x >= n1; x -= 2) {
                    System.out.println(x);
                }
            }
            case 8 ->{
                System.out.println("Type the initial number:");
                var initialNumber = scanner.nextInt();
                var currentNumber = initialNumber;
                while (currentNumber % initialNumber == 0 || currentNumber < initialNumber) {
                    System.out.println("Type a divisor of the initial number or a less number to continue:");
                    currentNumber = scanner.nextInt();
                }
            }
            case 0 -> {
                // Exit program
                System.out.println("Exiting program...\nThanks for trying out my first program in Java!\n");
                return;
            }
            default -> System.out.println("Invalid option, please select a valid number.");
        }
        System.out.println("Thanks for trying out my first program!\n");
        
    
        }
}
}