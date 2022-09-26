public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
       /* System.out.println("Eleman sayısı : " + mesaj.length());

        // .charAt(4) komutu yazıdaki 4. elemanı getirir.(0,1,2,3,4 şeklinde 0'dan başlanarak.)
        System.out.println("5. eleman : " + mesaj.charAt(4));

        //.concat komutu önceden tanımlanmış olan 'mesaj' stringi ile birlikte çalışır.
        System.out.println(mesaj.concat(" 35 derece."));
       //tekrar mesaj stringi çağırıldığında .concat çalışmamış olur çünkü öncekine tanımlandı.
        System.out.println(mesaj);

        // 'mesaj' stringi B ile başlıyor mu?  true or false. Case Sensitive vardır, büyük küçük harf önemlidir.
        System.out.println(mesaj.startsWith("B"));

        // 'mesaj' stringi . ile bitiyor mu?  true or false
        System.out.println(mesaj.endsWith("."));

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);  // 0'dan başla 5'e kadar gel 5. char'ı alma, karakterler'e ata, karakterlerin 0. indexinden itibaren aktar.
        System.out.println(karakterler);

        // a karakteri 'mesaj'ın içinde kaçıncı sırada? 0'dan saymaya başlar boşluklar da bir char'dır.*** Sadece 'a' yı aramak yerine bir metin de aranabilir.
        System.out.println(mesaj.indexOf("a"));

        System.out.println(mesaj.lastIndexOf("e")); */


       // **  mesaj.replace  aşağıdaki kod 'mesaj' ın içindeki boşluklar yerine - gelmesini sağlar. Ama sonraki satırda mesaj sout ile yazıldığında eski halini yazar.
        //   System.out.println(mesaj.replace(' ','-'));

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);

        // substring  2. ve 5. indexi al.   System.out.println(mesaj.substring(2)); bu şekilde yazılırsa 2.index dahil sonrasını yazdırır. : gün hava çok güzel.
        System.out.println(mesaj.substring(2,5));

        // boşlukları çıkartarak yazdırır.
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        // tüm kelimeleri küçük harf yapar.
        System.out.println(mesaj.toLowerCase());

        System.out.println(mesaj.toUpperCase());

        String mesaj1 = "      Yarın güneşli bir gün.     ";
        System.out.println(mesaj1.trim());  //mesaj1 in başındaki ve sonundaki boşlukları atabiliriz bu fonksiyon ile.

    }
}