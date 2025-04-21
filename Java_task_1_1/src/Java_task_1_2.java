import java.util.Scanner;

public class Java_task_1_2 {
    private static final double ROUBLES_PER_YUAN = 11.91;

    private static double convertYuanToRubles(int yuan) {
        return yuan * ROUBLES_PER_YUAN;
    }

    private static String chooseValueEnding(int value) {
        int remainderTen=value%10;
        if (value >= 10 && value <= 20 || remainderTen>=5 || remainderTen == 0) {
            return "ей";
        } else if (remainderTen == 1 ){
            return "ь";
        }
        return "я";
    }

    private static String chooseCountryEnding(int value){
        if (value == 1){
            return "й";
        }
        return "х";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в юанях: ");
        int yuan = scanner.nextInt();
        long rubles = Math.round(convertYuanToRubles(yuan));
        System.out.println(yuan + " китайски" + chooseCountryEnding(yuan) + " юан" + chooseValueEnding(yuan) + " = "
                + rubles + " российски" + chooseCountryEnding((int) rubles) +" рубл" + chooseValueEnding((int) rubles));
    }
}