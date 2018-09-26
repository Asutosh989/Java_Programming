import java.util.*;

class HcfLcm {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int h = hcf(a,b);
        System.out.println(h);
        System.out.println((a*b)/h);
    }

    public static int hcf(int a, int b) {
        while (a!=b) {
            if (a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        return a;
    }
}