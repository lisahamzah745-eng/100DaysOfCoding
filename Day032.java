import java.util.Scanner;

public class Day032 {
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        System.out.println((!(a<=b)||a!=b)&&(++a>b));
        
    }
}
