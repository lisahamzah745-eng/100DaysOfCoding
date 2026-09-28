import java.util.Scanner;

public class Day027 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int nilai1 = i.nextInt();
        int nilai2 = i.nextInt();
        
        System.out.println("Nilai +1 = " + ++nilai1);
        System.out.println("Nilai -1 = " + --nilai2);
        
        System.out.println("Nilai1 = " + nilai1++);
        System.out.println("Nilai2 = " + nilai2--);
    }
    
}
