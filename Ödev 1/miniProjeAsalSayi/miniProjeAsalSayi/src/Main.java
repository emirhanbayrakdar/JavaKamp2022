public class Main {
    public static void main(String[] args) {
       int number = 1;
         //25 % 2 --> % operatörü 25in 2ye bölünmesinden kalanı bulmayı sağlar.

        boolean asalMi = true;
        for (int i=2; i<number; i++){
            if (number % i == 0){
                asalMi = false;
            }
        }
        if (number==1){
            System.out.println("Sayı asal değildir.");
            return;
        }
        if (number<1){
            System.out.println("Geçersiz sayı.");
        }
       // if (asalMi)  = if(asalMi==true)
        if (asalMi){
            System.out.println("Sayı asaldır.");
        }
        else {
            System.out.println("Sayı asal değildir.");
        }
    }
}