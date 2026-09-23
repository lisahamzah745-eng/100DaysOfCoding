public class Day022 {
    public static void main(String[] args){
        boolean nilai1 = true;
        boolean nilai2 = false;
        System.out.println("Nilai sebelum ditukar");
        System.out.println("Nilai 1 : " +nilai1);
        System.out.println("Nilai 2 : " +nilai2);
        
        boolean a = nilai1;
        nilai1 = nilai2;
        nilai2 = a;
        
        System.out.println("Nilai setelah ditukar");
        System.out.println("nilai 1 : " + nilai1 );
        System.out.println("nilai 2 : " + nilai2);
        
    }
}
