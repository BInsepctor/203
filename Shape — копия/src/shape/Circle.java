package shape;

public class Circle extends Shape{
    private Point point;
    private  double radius;
    private static final double Pi = 3.1415926536;
    public Point getPoint(){return point;}

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius(){return radius;}
    public void setRadius(double radius){
        if (validate(radius) == true){
            this.radius = radius;
        }
    }
    private boolean validate(double radius){
        try {
            if (radius > 0) {
                return true;
            } else {
                throw new NullPointerException("не удалось создать фигуру, т.к. радиус не может быть меньше нуля");
            }
        }
        catch (Exception e){
            throw new NullPointerException("мимо");
        }

    }
    public Circle(){}
    public Circle(Point point, double radius){
        validate(radius);
        this.point = point;
        this.radius = radius;

    }
    public void draw(){
        validate(radius);
        System.out.println("Фигура круг");
        System.out.println("Центр круга: " + "(x = " + point.getX() + "; y = " + point.getY() + ")");
        System.out.println("Радиус круга: " + radius);
        System.out.println("Площадь круга: " + getSquare());
        System.out.println("Периметр круга: " + getFlat());
        System.out.println("Цвет круга: " + getColor());

    }
    public double getSquare(){
        return Pi * radius * radius;
    }
    public double getFlat(){
        return 2 * Pi * radius;
    }

    public void move(double moveX, double moveY){
        double newX = point.getX() + moveX;
        double newY = point.getY() + moveY;
        point.setX(newX);
        point.setY(newY);
    }
}
