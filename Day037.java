import java.util.Scanner;
public class Day037{
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int angka = i.nextInt();
        if(angka>0){
            System.out.println("Bilangan Positif");
        }else if(angka==0){
            System.out.println("Angka 0");
        }else {
            System.out.println("Bilangan Negatif");
        }
     i.close();   
    }
}
