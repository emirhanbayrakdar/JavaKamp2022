public class Main {
    public static void main(String[] args) {
        //220-284   220 --> 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 ve 110
        int x = 220;
        int xTotal= 0;
        int y = 284;
        int yTotal = 0;

        for (int i=1;i < x; i++){
            if (x % i ==0){
                xTotal= xTotal + i;
            }
        }

        for (int i=1;i < y; i++){
            if (y % i ==0){
                yTotal= yTotal + i;
            }
        }

        if (xTotal==y && x==yTotal){
            System.out.println("Bu sayılar arkadaş sayıdır.");
        }
        else{
            System.out.println("Bu sayılar arkadaş sayı değildir.");
        }


    }
}