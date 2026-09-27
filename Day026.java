import java.util.Scanner;

public class Day026 {
    public static void main(String[] args){
    Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.print(a +" \n"+b);
    }
}
