import java.util.Scanner;

public class Day074 {
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        System.out.print("Tulis Sesuatu di sini: ");
        String s = i.nextLine();
        System.out.println("\n-- Jumlah huruf/karakter -- \n "+s.length());
        System.out.println("\n-- Menampilkan Huruf Kapital -- \n "+s.toUpperCase());
        System.out.println("\n-- Menampilkan Huruf Kecil -- \n "+s.toLowerCase());
    i.close();
    }
}
