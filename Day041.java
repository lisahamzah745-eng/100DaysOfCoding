import java.util.Scanner;

public class Day041 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan temperatur (°C) : ");
        int suhu = i.nextInt();
        if (suhu<18){
            System.out.println(suhu + "°C Suhu Ruangan Dingin");
        }else if(suhu<=25){
            System.out.println(suhu + "°C Suhu Ruangan Sejuk");
        }else {
            System.out.println(suhu + "°C Suhu Ruangan Panas");
        }
    }
}
