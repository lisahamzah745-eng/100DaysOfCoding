import java.util.Scanner;

public class Day087{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int s = i.nextInt();
        int [] l = new int[s];
        System.out.println("\n== Mengisi Elemen Array ==");
        for(int j = 0; j < l.length; j++){
            System.out.print("nilai ke-" + (j+1) + " : ");
            l[j] = i.nextInt();
        }
        System.out.println("\n== Array Asli ==");
        for(int j = 0; j < l.length; j++){
            System.out.print(l[j] + " ");
        }
      
        System.out.println("\n== Mengganti Nilai Array ==");
        System.out.print("Masukkan indeks yang mau diganti: ");
        int indeks = i.nextInt();
        System.out.print("Masukkan nilai baru: ");
        int ganti = i.nextInt();
        l[indeks] = ganti;
        System.out.println("\n== Array Setelah Diganti ==");
        for(int j = 0; j < l.length; j++){
            System.out.print(l[j] + " ");
        }
    i.close();
    }
}
