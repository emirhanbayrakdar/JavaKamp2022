public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String ortaMetin = "İlginizi çekebilir.";
        String altMetin = "Vade süresi.";
        System.out.println(ortaMetin);

        //integer tam sayı
        int vade = 12;


        double dolarDun = 18.22;
        double dolarBugun = 18.15;

        boolean dolarDustuMu = false;
        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "downn.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        //array
        String[] krediler = {"Hızlı Krediler, Maaşını Halkbanktan,Mutlu Emekli"};
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);

        }

    }
}