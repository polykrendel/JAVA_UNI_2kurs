import java.util.Scanner;

public class Java_task_1_1 {
    private static final double ROUBLES_PER_YUAN = 11.91;
    private static double convertYuanToRubles(int yuan) {
        return yuan * ROUBLES_PER_YUAN;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите сумму в юанях: ");
        int yuan=scanner.nextInt();
        System.out.println(yuan + " юаней = " + Math.round(convertYuanToRubles(yuan)) + " рублей");
    }
}