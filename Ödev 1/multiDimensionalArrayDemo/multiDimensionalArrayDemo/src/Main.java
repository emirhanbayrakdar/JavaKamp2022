public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şırnak";
        sehirler[2][2] = "Gaziantep";

        for (int i = 0; i <=2 ; i++) {
            for (int j = 0; j <=2 ; j++) {
                System.out.println(sehirler[i][j]);

            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        // fb,gs,bjk oyuncuları

        String[][] oyuncular = new String[3][3];
        oyuncular[0][0] = "Arda Güler";
        oyuncular[0][1] = "Emre Mor";
        oyuncular[0][2] = "Joshua King";
        oyuncular[1][0] = "Mauro İcardi";
        oyuncular[1][1] = "Lucas Torreira";
        oyuncular[1][2] = "Fernando Muslera";
        oyuncular[2][0] = "Arthur Massaki";
        oyuncular[2][1] = "Rachid Gazzal";
        oyuncular[2][2] = "Cenk Tosun";

        for (int i = 0; i <=2 ; i++) {
            System.out.println("~~~~~~~~~~");
            for (int j = 0; j <=2 ; j++) {
                System.out.println(oyuncular[i][j]);

            }

        }




    }
}