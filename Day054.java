import java.util.Scanner;

public class Day054 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int x= i.nextInt();
        int y= i.nextInt();
        int z= i.nextInt();
        if(y>x){
            x +=1;
            if(z>x){
                x +=2;
            }
        }else if(y<x){
            x -=1;
           if(z<x){
               x -=2;
           }
        }
        System.out.println(x);
    }
}
