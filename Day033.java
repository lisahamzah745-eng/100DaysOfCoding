import java.util.Scanner;
   public class Day033 {
        public static void main (String[] args){
            Scanner i = new Scanner (System.in);
            System.out.print("Baterai hp : ");
            int baterai = i.nextInt();
        
            if (20>=baterai) {
                 System.out.println("Cas hp sekarang!!");
            } else if (80>=baterai){
                 System.out.println("Baterai hp aman :)");
            } else {
                 System.out.println("Baterai aman banget :)");
            }
        }
   }
