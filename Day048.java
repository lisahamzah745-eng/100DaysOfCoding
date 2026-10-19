import java.util.Scanner;

public class Day048 {
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        int a = i.nextInt();
        char operasi = i.next().charAt(0);
        int b = i.nextInt();
        System.out.println("===Kalkulator Sederhana===");
        switch (operasi){
            case '+':
                 System.out.println("Hasil dari "+a+"+"+b+ " adalah "+ (a+b));
                 break;
            case '-':
                 System.out.println("Hasil dari "+a+"-"+b+ " adalah "+ (a-b));
                 break;
            case '*':
                 System.out.println("Hasil dari "+a+"×"+b+ " adalah "+ (a*b));
                 break;
            case '/':
                 System.out.println("Hasil dari "+a+"÷"+b+ " adalah "+ (a/b));
                 break;
            case '%':
                 System.out.println("Hasil dari "+a+"%"+b+ " adalah "+ (a%b));
                 break;
            default:
                 System.out.println("Operator tidak valid");
        }   
        i.close();
    }
}
