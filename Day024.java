import java.util.Scanner;

public class Day024 {
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        System.out.println("Menghitung luas persegi panjang");
        System.out.print("Panjang persegi = ");
        int panjang = i.nextInt();
        System.out.print("Lebar persegi = ");
        int lebar = i.nextInt();
        
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang = " + luas);
        i.close();
    }
}
