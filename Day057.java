import java.util.Scanner;

public class Day057 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = i.nextInt();
        System.out.println("\nMenampilkan angka ganjil 1-"+n);
        for(int j=1;j<=n;j+=2){
            System.out.println(j);
        }
        System.out.println("\nMenampilkan angka genap 1-"+n);
        for(int j=2;j<=n;j+=2){
            System.out.println(j);
        }
        i.close();
    }
}
