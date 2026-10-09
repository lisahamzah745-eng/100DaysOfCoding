import java.util.Scanner;

public class Day038{
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        System.out.println("=== Menu Makanan & Minuman ===");
        System.out.println("1. Menu Makanan");
        System.out.println("2. Menu Minuman");
        System.out.print("Pilih Menu apa (1/2) : ");
        int menu = i.nextInt();
        if (menu==1){
            System.out.println("======= Menu Makanan =======");
            System.out.println("1. Nasi Goreng\t\t Rp 15.000 ");
            System.out.println("2. Mie Jebeww\t\t Rp 13.000");
            System.out.println("3. Mie Bakso\t\t Rp 15.000");
            System.out.println("4. Nasi + Ayam Bakar\t Rp 17.000 ");
            System.out.println("5. Nasi + Ayam geprek \t Rp 13.000");
        }else if (menu==2){
            System.out.println("======= Menu Minuman =======");
            System.out.println("1. Es Teh\t\t Rp 5.000");
            System.out.println("2. Jus Jeruk\t\t Rp 12.000");
            System.out.println("3. Jus Alpukat\t\t Rp 12.000");
            System.out.println("4. Es Milo\t\t Rp 10.000");
            System.out.println("5. Le Mineral\t\t Rp 5.000");
        }else{
            System.out.println("Menu belum tersedia !! ");
        }
     i.close();    
    }
}
