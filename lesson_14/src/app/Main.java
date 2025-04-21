package app;
import observer.*;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        User user1 = new User("Chad");
        User user2 = new User("Gigachad");
        User user3 = new User("Megachad");

        subject.addObserver(user1);
        subject.addObserver(user2);
        subject.addObserver(user3);

        System.out.println("Первое изменение состояния:");
        subject.setState("Активно");

        System.out.println("\nВторое изменение состояния:");
        subject.setState("Неактивно");

        System.out.println("\nТретье изменение состояния:");
        subject.setState("Неопределено");
    }
}