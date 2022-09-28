public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(53, 7);
        System.out.println(sayi);
        int toplam= topla2(3,4,12,20,15);
        System.out.println(toplam);
    }

    public static void ekle() {

    }

    public static void sil() {

    }

    public static void guncelle() {

    }
    /// public static int topla2(int... sayilar)  3 noktanın anlamı dizi oluşturuyor.
    public static int topla2(int... sayilar){
    int toplam = 0;
    for(int sayi:sayilar){
        toplam+=sayi;   // toplam = toplam + sayi  ile aynı kullanım yöntemi.

    }
    return toplam;

    }

    public static String sehirVer() {
        return "Ankara";
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

}
