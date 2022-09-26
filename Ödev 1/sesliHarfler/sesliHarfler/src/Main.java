public class Main {
    public static void main(String[] args) {
        char harf = 'E';
        switch (harf){
            case 'A':
            case 'O':
            case 'I':
            case 'U':
                System.out.println("Kalın sesli harftir.");
                break;

            default:
                System.out.println("İnce sesli harftir.");
        }
    }
}
