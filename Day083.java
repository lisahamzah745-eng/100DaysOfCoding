import java.util.Scanner;

public class Day083{
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int s = i.nextInt();
        int [] l = new int[s];
        i.nextLine();
        System.out.println("\n== Mengisi Elemen Array ==");
        for(int j=0;j<l.length;j++){
            System.out.print("indeks "+j+ ": ");
            l[j]= i.nextInt();
        }
        System.out.println("\n== Menjumlahkan Elemen Array ==");
        int jumlah= 0;
        for(int j=0;j<l.length;j++){
            jumlah += l[j];
        }
        System.out.println("Hasil: "+jumlah);
    i.close();
    }
}
