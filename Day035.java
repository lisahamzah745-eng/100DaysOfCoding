import java.util.Scanner;

public class Day035 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Sekarang Jam : ");
        double jam = i.nextDouble();
        if(jam<=08.00){
            if(jam<04.00){
                System.out.println("Tidur maki dulu, besok pi lagi ;)");
            }else{
                System.out.println("Good Morning ;)");
            }
        }else{
            System.out.println("Jangan lupa commit hari ini !!");
        }
    }
}
