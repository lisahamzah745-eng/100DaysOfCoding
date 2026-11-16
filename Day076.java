import java.util.Scanner;

public class Day076 {
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        System.out.println("Tulis sesuatu di bawah ini");
        System.out.print("Teks 1: ");
        String teks1 = i.nextLine();
        System.out.print("Teks 2: ");
        String teks2 = i.nextLine();
        
        System.out.println("\nMemotong 4 karakter teks1 ");
        System.out.println("Hasilnya: "+teks1.substring(4));
        System.out.println("\nMengganti teks 1 menjadi teks2 dan sebaliknya ");
        System.out.println("Teks 1: "+teks1.replace(teks1,teks2));
        System.out.println("Teks 2: "+teks2.replace(teks2,teks1));
        System.out.println("\nMenghapus spasi awal dan akhir");
        System.out.println("Teks 1: "+teks1.trim());
        System.out.println("Teks 2: "+teks2.trim());
      i.close();
    }
}
