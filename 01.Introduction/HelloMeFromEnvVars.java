import java.util.*;

public class HelloMeFromEnvVars {
  public static void main(String args[]){
    System.out.println("Hello " + System.getenv("MY_NAME"));
  }
}
