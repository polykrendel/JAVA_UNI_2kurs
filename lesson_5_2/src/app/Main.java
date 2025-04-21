package app;
import kek.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int razm,num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размер массива, затем номер желаемого числа: ");
        razm=scanner.nextInt();
        num=scanner.nextInt();
        FibArr mas=new FibArr(razm);
        System.out.println("Число номер " + num + " это " + mas.get_number(num));
    }
}