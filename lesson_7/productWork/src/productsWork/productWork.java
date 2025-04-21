package productsWork;

import products.*;
import java.util.Scanner;

public class productWork {
    private final AnimeFigurki animeFigurki;
    private final BrainCells brainCells;
    private final Pampers pampers;
    Scanner scanner=new Scanner(System.in);

    public productWork(){
        System.out.println("Введите исходное количество товаров(в порядке аниме фигурки, мозговые клетки," +
                " памперсы).");
        this.animeFigurki=new AnimeFigurki(scanner.nextInt());
        this.brainCells=new BrainCells(scanner.nextInt());
        this.pampers=new Pampers(scanner.nextInt());
    }

    public void getOst(){
        System.out.println("Количество товаров разных видов:");
        System.out.println(this.animeFigurki.getName()+": "+this.animeFigurki.getNum());
        System.out.println(this.brainCells.getName()+": "+this.brainCells.getNum());
        System.out.println(this.pampers.getName()+": "+this.pampers.getNum());
    }

    public void add(){
        System.out.println("Введите сколько товаров вы хотите добавить к каждому типу.");
        animeFigurki.setNum(scanner.nextInt() + animeFigurki.getNum());
        brainCells.setNum(scanner.nextInt() + brainCells.getNum());
        pampers.setNum(scanner.nextInt() + pampers.getNum());
    }

    public void take(){
        System.out.println("Введите сколько товаров вы хотите убрать у каждого типа.");
        animeFigurki.setNum(-scanner.nextInt() + animeFigurki.getNum());
        brainCells.setNum(-scanner.nextInt() + brainCells.getNum());
        pampers.setNum(-scanner.nextInt() + pampers.getNum());
    }
}