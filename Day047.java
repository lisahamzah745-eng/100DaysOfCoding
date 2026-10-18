import java.util.Scanner;
public class Day047{
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        System.out.println("=== Program Menentukan Hari === ");
        System.out.print("Masukkan Hari ke berapa: ");
        int hari = i.nextInt();
        switch (hari){
            case 1:
                 System.out.println("Hari ke-1: Senin");
                 break;
            case 2:
                 System.out.println("Hari ke-2: Selasa");
                 break;
            case 3:
                 System.out.println("Hari ke-3: Rabu");
                 break;
            case 4:
                 System.out.println("Hari ke-4: Kamis");
                 break;
            case 5:
                 System.out.println("Hari ke-5: Jumat");
                 break;
            case 6:
                 System.out.println("Hari ke-6: Sabtu");
                 break;
            case 7:
                 System.out.println("Hari ke-7: Minggu");
                 break;
            default:
                 System.out.println("Hari yang kamu pilih tidak valid");
        }
      i.close();
    }
}
