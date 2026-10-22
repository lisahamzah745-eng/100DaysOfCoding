import java.util.Scanner;
public class Day051 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int b= i.nextInt();
        System.out.println("==Menampilkan angka 1-"+b+"==");
        for (int a = 1; a <=b;a++) {
            System.out.println(a);
        }
      i.close();
    }
}
