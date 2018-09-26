import java.util.*;

class ColdNumber{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t=1;
        int a = s.nextInt();
        if (a%2==0){
            t = (int)(a/2);
        }
        if (a%2!=0){
            t = (int)(a/2)+1;
        }
        if (a%t==0){
            System.out.println("Cold Number");
        }
        else{
            System.out.println("Not Cold Number");
        }
    }
}