import java.util.*;

class MultiplesOfThreeOrFive {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int i,sum=0;
    int a = s.nextInt();
    for (i=1;i<a;i++){
      if (i%3==0 || i%5==0){
        sum+=i;

      }

    }
    System.out.print(sum);
  }
}
