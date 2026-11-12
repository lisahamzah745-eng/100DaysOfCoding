import java.util.Scanner;

public class Day072 {
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n=i.nextInt();
        int hasil=0;
        while(n>=0){
            hasil +=n;
        System.out.print("Masukkan angka: ");
        n= i.nextInt();            
            
        }
        System.out.println("\nHasil penjumlahan = "+hasil);
      i.close();
    }
}
