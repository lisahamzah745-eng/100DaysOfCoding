import java.util.Scanner;

public class Day084{
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
        System.out.println("\n== Menentukan nilai max array ==");
        int max= l[0];
        for(int j=0;j<l.length;j++){
            if(l[j]>max){
                max = l[j];
            }
        }
        System.out.println("Hasil: "+max);
    i.close();
    }
}
