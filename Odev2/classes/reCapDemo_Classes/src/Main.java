public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int toplam = dortIslem.Topla(3,4);
        System.out.println("Toplam = " + toplam);

        int bolum = dortIslem.Bol(12,4);
        System.out.println("Bölüm = " + bolum);

        int carpım = dortIslem.Carp(4500,50);
        System.out.println("Çarpım = " + carpım);

        int fark = dortIslem.Cıkar(5,2);
        System.out.println("Fark = " + fark);
    }
}