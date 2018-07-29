import java.util.*;

class SumOfNumbers {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int i,sum=0;
    int a = s.nextInt();
    for (i=1;i<=a;i++){
      sum+=i;
    }
    System.out.println(sum);

  }
}
