import java.util.Scanner;

public class Day081{
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int s = i.nextInt();
        String [] l = new String[s];
        i.nextLine();
        System.out.println("\n== Mengisi Elemen Array ==");
        for(int j=0;j<l.length;j++){
            System.out.print("indeks "+j+ ": ");
            l[j]= i.nextLine();
        }
        System.out.print("\nMenampilkan: ");
        for(int j=0;j<l.length;j++){
            System.out.print("["+j+"] \""+l[j]+"\", ");
        }
    i.close();
    }
}
