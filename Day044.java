import java.util.Scanner;

public class Day044 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan nama: " );
        String nama = i.nextLine();
        System.out.print("Masukkan nilai: " );
        int nilai = i.nextInt();
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
        if (nilai<=100&&nilai>=85){
            System.out.println("Predikat nilai : A");
        }else if(nilai<=84&&nilai>=75){
            System.out.println("Predikat nilai : B");
        }else if(nilai<=74&&nilai>=65){
            System.out.println("Predikat nilai : C");
        }else if(nilai<=64&&nilai>=50){
            System.out.println("Predikat nilai : D");
        }else if(nilai<=49&&nilai>=0){
            System.out.println("Predikat nilai : E");
        }else{
             System.out.println("nilai tidak valid");
        }
        if(nilai>100){
            System.out.println("Status = -"); 
        }else if (nilai>=60){
            System.out.println("Status = Lulus"); 
        }else{
            System.out.println("Status = Tidak Lulus");
        }
        i.close();   
    }
}
