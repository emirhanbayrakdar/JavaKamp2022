public class Main {
    public static void main(String[] args) {
        // For             i+=2 i'yi 2şer 2şer arttırır.
        for (int i =2; i<=10; i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti.");

        // While    while döngüsü için önceden bir değişken tanımlamamız gerekir. For da gerekmez çünkü sadece belirlenen for bloğunda kullanılır.
        int i = 1;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti.");
    }
}