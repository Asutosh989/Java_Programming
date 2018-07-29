import java.util.Scanner;

public class BasicCalculator{
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   if(!sc.hasNextDouble()){
      System.out.println("Invalid input");
      return;
    }

    double a = sc.nextDouble();

    if(!sc.hasNext()){
      System.out.println("Invalid input");
      return;
    }

    char o = sc.next().trim().charAt(0);


    if(!sc.hasNextDouble()){
      System.out.println("Invalid input");
      return;
    }

    double b = sc.nextDouble();

    switch(o){
      case '+':
        System.out.println(a+b);
        break;
      case '-':
        System.out.println(a-b);
        break;
      case '*':
        System.out.println(a*b);
        break;
      case '/':
        System.out.println(a/b);
        break;
      case '%':
        System.out.println(a%b);
        break;
      default:
        System.out.println("Invalid input");
    }
  }
}
