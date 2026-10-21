import java.util.Scanner;

public class Day050 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = i.nextInt();
        String bilangan = (angka%2==0)?"Genap":"Ganjil";
        System.out.println(angka+ " adalah bilangan "+bilangan);
        i.close();
    }
}
