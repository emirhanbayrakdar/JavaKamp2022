import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        System.out.println("---------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("---------------");

        //******
        for (String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }
        System.out.println("---------------");


        String[] takimlar = new String[4];
        takimlar[0] = "Fenerbahçe";
        takimlar[1] = "Galatasaray";
        takimlar[2] = "Beşiktaş";
        takimlar[3] = "Trabzonspor";

        for (String takim : takimlar){
            System.out.println(takim);
        }

        System.out.println("---------------");

        for (int i = 0; i < takimlar.length ; i++) {
            System.out.println(takimlar[i]);
        }
        System.out.println("---------------");


    }
}