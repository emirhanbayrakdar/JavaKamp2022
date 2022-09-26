public class Main {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 24;
        // en küçüğü bulan algoritma
        int enKucuk = sayi1;
        if (enKucuk > sayi2) {
            enKucuk = sayi2;

        }
        if (enKucuk > sayi3) {
            enKucuk = sayi3;
        }
        System.out.println("En küçük : " + enKucuk);
    }
}