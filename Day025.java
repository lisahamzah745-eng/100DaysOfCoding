import java.util.Scanner;

public class Day025 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Menghitung luas lingkaran");
        System.out.print("jari-jari lingkaran (r)= ");
        int r = i.nextInt();
        double phi = 3.14;
        
        double Luas = phi * r * r;
        System.out.printf("Luas lingkaran = %.2f",Luas);
    }
}
