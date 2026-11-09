import java.util.Scanner;

public class Day069{
    public static void main(String[] args){
        Scanner i= new Scanner (System.in);
        System.out.print("Masukkan panjang persegi: ");
        int p = i.nextInt();
        System.out.print("Masukkan lebar persegi: ");
        int l = i.nextInt();
        System.out.println(); 
        for(int a= 1; a<=p;a++){
            for(int b= 1; b<=l;b++){
                System.out.print("* ");
             }
            System.out.println(); 
        }
        i.close();
    }
}
