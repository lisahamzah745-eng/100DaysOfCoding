import java.util.Scanner;

public class Day023 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Menghitung luas persegi");
        System.out.print("Panjang sisi = " );
        int Sisi = i.nextInt();
        int luas = Sisi *Sisi;
        System.out.println("Luas persegi = " +luas);
    }
}
