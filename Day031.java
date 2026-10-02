import java.util.Scanner;

public class Day031 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        boolean a = i.nextBoolean();
        boolean b = i.nextBoolean();
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!(a));
    }
}
