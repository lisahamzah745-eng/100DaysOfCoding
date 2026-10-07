import java.util.Scanner;

public class Day036 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = i.nextInt();
        if(angka%2==0){
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan Ganjil");
        }
     i.close();   
    }
}
