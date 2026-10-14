import java.util.Scanner;

public class Day043{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("=== Program Kelipatan 3,5,3 dan 5 ===");
        System.out.print("Masukkan angka: ");
        int angka = i.nextInt();
        
        String kelipatan = "";
        boolean bagi3 = (angka%3==0);
        boolean bagi5 = (angka%5==0);
        if (bagi3&&bagi5){
            kelipatan = "kelipatan 3 dan 5";
        }else if(bagi3){
            kelipatan = "kelipatan 3 ";
        }else if(bagi5){
            kelipatan = "kelipatan 5";
        }else {
            kelipatan = "bukan kelipatan 3 maupun 5";
        }
        System.out.println(angka+ " adalah bilangan " +kelipatan);
    }
}
