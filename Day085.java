import java.util.Scanner;

public class Day085{
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int s = i.nextInt();
        int [] l = new int[s];
        System.out.println("\n== Mengisi Elemen Array ==");
        for(int j=0;j<l.length;j++){
            System.out.print("indeks "+j+ ": ");
            l[j]= i.nextInt();
        }
        System.out.println("\n== Menentukan nilai minimal array ==");
        int min= l[0];
        for(int j=0;j<l.length;j++){
            if(l[j]<min){
                min = l[j];
            }
        }
        System.out.println("Hasil: "+min);
    i.close();
    }
}
