import java.util.Scanner;

class BasicCalculatorArgv {
    public static void main(String args[]) {
        if(args.length != 3) {
            System.out.println("Invalid input");
            return;
        }

        try {

            double a = Double.parseDouble(args[0]);

            char op = args[1].charAt(0);

            double b = Double.parseDouble(args[2]);

            switch(op) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '%':
                    System.out.println(a % b);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } catch(NumberFormatException ex) {
            System.out.println("Invalid input");
        }
    }
}
