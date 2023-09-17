import color.Color;
import service.ShapesService;
import service.impl.ShapeServiceImpl;
import shape.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(10,10);
        point.move(-1,-1);
        point.draw();
        System.out.println();
        Point p = new Point(100,100);
        p.draw();
        System.out.println();
        Circle circle = new Circle(new Point(5,5),2);
        circle.move(-2,-2);
        circle.setColor(Color.WHITE);
        circle.draw();
        System.out.println();
        Circle circle1 = new Circle(new Point(2,5),4);
        circle1.setColor(Color.YELLOW);
        circle1.draw();
        System.out.println();
        Rectangle rectangle = new Rectangle(new Point(1,1), new Point(3,3));
        rectangle.move(1,1);
        rectangle.setColor(Color.RED);
        rectangle.draw();
        System.out.println();
        Rectangle rectangle1 = new Rectangle(new Point(1,1), new Point(5,2));
        rectangle1.draw();
        System.out.println();
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(4, 0));
        triangle.setColor(Color.RED);
        triangle.draw();
        System.out.println();
        Triangle triangle1 = new Triangle(new Point(-2, 3), new Point(4, 3), new Point(2, 5));
        triangle1.setColor(Color.BLUE);
        triangle1.draw();
        System.out.println();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(circle);
        shapes.add(circle1);
        shapes.add(rectangle1);
        shapes.add(p);
        shapes.add(triangle1);
        ShapesService service = new ShapeServiceImpl();
        double totalSquares = service.getSquares(shapes);
        double maxPerimeter = service.getMaxPerimeters(shapes);
        Set<Color> uniqueColors = service.getColors(shapes);
        System.out.println("Сумма всех площадей фигур: " + totalSquares);
        System.out.println("Максимальный периметр: " + maxPerimeter);
        System.out.println("Уникальные цвета фигур: " + uniqueColors);
    }
}