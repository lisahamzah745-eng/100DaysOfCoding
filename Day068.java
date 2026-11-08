import java.util.Scanner;

public class Day068 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        for (int a=1; a <=n; a++) {
            for (int b=n; b>a; b--) {
                System.out.print(" ");
            }
            for (int c= 1; c<=a; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        i.close();
    }
}
