import java.util.Scanner;

public class Day075 {
    public static void main(String [] args){
        Scanner i= new Scanner(System.in);
        System.out.print("data 1: ");
        String data1= i.nextLine();
        System.out.print("data 2: ");
        String data2= i.nextLine();
        System.out.print("data 3: ");
        String data3= i.nextLine();
        
        System.out.println("\n--Mengecek kesamaan data1 : data2--");
        System.out.println("data1 : data2 = "+data1.equals(data2));
        System.out.println("data1 : data2 = "+data1.equalsIgnoreCase(data2));
        System.out.println("\n--Mengecek data1 apakah ada konteks sama dengan data2--");
        System.out.println("data1 => data2 = "+data1.contains(data2));
        System.out.println("\n--Mengecek string kosong--");
        System.out.println("data 1: "+data1.isEmpty());
        System.out.println("data 2: "+data2.isEmpty());
        System.out.println("data 3: "+data3.isEmpty());
        i.close();
    }
}
