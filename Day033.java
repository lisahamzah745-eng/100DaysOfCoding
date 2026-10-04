import java.util.Scanner;

public class Day033 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Baterai hp: ");
        int baterai = i.nextInt();
        if (baterai<= 20) {
            System.out.println("cas hp sekarang!!");
        } else {
            System.out.println("Baterai hp masih aman :)");
        }
    }
}
