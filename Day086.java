import java.util.Scanner;

public class Day086{
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int s = i.nextInt();
        int [] l = new int[s];
        System.out.println("\n== Mengisi Nilai Elemen Array ==");
        for(int j=0;j<l.length;j++){
            System.out.print("nilai ke-"+(j+1)+" : ");
            l[j]= i.nextInt();
        }
        System.out.println("\n== Mencari Elemen Array ==");
        System.out.print("Masukkan elemen array: ");
        int cari = i.nextInt();
        boolean cek = false;
        for(int j=0;j<l.length;j++){
            if(cari==l[j]){
                System.out.println("Elemen ditemukan di index "+j);
                cek = true;
                break;
            }
        }
        if(!cek){
            System.out.println("Elemen tidak ditemukan");
        }
    i.close();
    }
}
