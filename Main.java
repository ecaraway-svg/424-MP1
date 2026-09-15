import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator mycalc = new Calculator();
        
        mycalc.setname("Group 22");

        while (true) {

            System.out.println("Welcome to the Calculator designed by " + mycalc.getname() + ".");
            System.out.println("Enter A to Add, S to Subtract, M to Multiply, and Q to quit.");

            String inp = scan.nextLine();

            // check if user quits
            if (inp.equals("Q") | inp.equals("q")) {
                System.out.println("Quitting\n");
                break;
            }


            if (!inp.equalsIgnoreCase("A") & !inp.equalsIgnoreCase("S") & !inp.equalsIgnoreCase("M")) {
                System.out.println("Bad menu choice, try again\n");
                continue;
            }

            // Making sure input is valid, if so go from there
            try {
                System.out.println("Enter argument 1");
                String inputone = scan.nextLine();
                Float numone = Float.valueOf(inputone);

                System.out.println("Enter argument 2");
                String inputtwo = scan.nextLine();
                Float numbtwo = Float.valueOf(inputtwo);

                if (inp.equalsIgnoreCase("A")) {
                    Float ans = mycalc.addition(numone, numbtwo);
                    System.out.println("The sum of " + numone + " and " + numbtwo + " is " + ans);
                } else if (inp.equalsIgnoreCase("S")) {
                    Float ans = mycalc.subtraction(numone, numbtwo);
                    System.out.println("The difference of " + numone + " and " + numbtwo + " is " + ans);
                } else if (inp.equalsIgnoreCase("M")) {
                    Float ans = mycalc.multiplication(numone, numbtwo);
                    System.out.println("The product of " + numone + " and " + numbtwo + " is " + ans);
                }
            } catch (NumberFormatException e) {
                System.out.println("Bad number input, back to menu\n");
            }
        }
    }
}

class Calculator {

    private String name;

    public Float addition(Float A, Float B) {
        return A + B;
    }

    public Float subtraction(Float A, Float B) {
        return A - B;
    }

    public Float multiplication(Float A, Float B) {
        return A * B;
    }

    public void setname(String N) {
        name = N;
    }

    public String getname() {
        return name;
    }
}