public class Main {
    public static void main(String[] args) {
        int number = 5;
        int bolen = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                bolen = bolen + i;
            }
        }
        if (bolen == number) {
            System.out.println("Bu sayı mükemmel bir sayıdır.");
        } else {
            System.out.printf("Bu sayı mükemmel bir sayı değildir.");

        }
    }
}