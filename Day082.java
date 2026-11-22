import java.util.Scanner;

public class Day082 {
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        String a = i.nextLine();
        char[] hasil = new char[a.length()];
        for(int j = 0;j<a.length();j++){
            char karakter = a.charAt(j);
            if (karakter >= '0' && karakter <= '8') {
                hasil[j] = (char) (karakter + 1);
            } else if (karakter == '9') {
                hasil[j] = '0';
            } else {
                hasil[j] = karakter;
            }
        }
        for(int j=0;j<hasil.length;j++){
            System.out.print(hasil[j]);
        }
    }
}
