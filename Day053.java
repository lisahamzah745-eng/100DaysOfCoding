import java.util.Scanner;

public class Day053 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        do{
            System.out.println(a--);
        }while(a>=0);
        i.close();
    }
}
