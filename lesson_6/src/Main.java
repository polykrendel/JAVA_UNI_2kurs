import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fio;
        Scanner scanner=new Scanner(System.in);
        fio = scanner.nextLine();
        try{
            checkFIO.validateName(fio);
            System.out.println("ФИО введено правильно!");
        }
        catch (invalidNameException e) {
            System.out.println(e.getMessage());
        }
    }
}