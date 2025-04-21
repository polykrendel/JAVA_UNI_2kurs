import java.util.HashMap;
// Интерфейс Shape
interface Shape {
    void draw();
}
// Конкретный класс Circle
class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", " +
                "x : " + x + ", y :" + y + ", radius :" + radius + "]");
    }
}
// Фабрика для создания и управления объектами
class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();
    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
// Тестирование Flyweight
public class FlyweightPatternDemo {
    private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
            System.out.print('\n');
        }
    }
    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}