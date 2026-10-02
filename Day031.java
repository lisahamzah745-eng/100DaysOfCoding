import java.util.Scanner;

public class Day031 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        System.out.println(a==b&&a!=b);
        System.out.println(a>b||a<b);
        System.out.println(!(a==b));
    }
}
