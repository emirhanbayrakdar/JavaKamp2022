public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2,1.3,4.3,5.6,7.3};
        double max = myList[0];
        double total = 0;
        for (double liste: myList){
            System.out.println(liste);
            if (max<liste);
            max = liste;

            total = total + liste;

        }
        System.out.println("En büyük sayı : "+ max);
        System.out.println("Toplam : "+ total);
    }
}