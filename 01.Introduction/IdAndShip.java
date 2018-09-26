import java.util.*;

class IdAndShip {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int i;
        char a;
        for (i=1; i<=t; i++){
            a = s.next().charAt(0);
            switch(a){
                case 'B':
                case 'b': System.out.println("Battleship");break;

                case 'C':
                case 'c': System.out.println("Cruiser"); break;

                case 'D':
                case 'd': System.out.println("Destroyer"); break;

                case 'F':
                case 'f': System.out.println("Frigate"); break;

                default: System.out.println("Enter Valid Choice");
            }
        }
    }
}