import java.util.Scanner;
public class Day039 {
    public static void main (String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("====== Kalkulator Seadanya =======");
        System.out.println("Hanya untuk operator(+,-,/,*,%) ");
        System.out.print("Masukkan angka pertama : ");
        int a = i.nextInt();
        System.out.print("Masukkan operatornya : ");
        char operasi = i.next().charAt(0);
        System.out.print("Masukkan angka kedua : ");
        int b = i.nextInt();
        if(operasi=='+'){
            System.out.print("Hasil penjumlahannya = " +(a+b));
        }else if(operasi=='-'){
            System.out.print("Hasil pengurangannya = " +(a-b));
        }else if(operasi=='/'){
            if(b!=0){
                System.out.print("Hasil pembagiannya = " +(a/b));  
            }else{
                System.out.print("= Tidak Terdefinisi" );
            }
        }else if(operasi=='*'){
            System.out.print("Hasil perkaliannya = " +(a*b));
        }else if(operasi=='%'){
            System.out.print("Hasil modulusnya = " +(a%b));
        }else{
            System.out.print(" = operator tidak valid" );
        }
    }
}
