package shape;
import color.Color;

public abstract class Shape {
    private Color color = Color.TRANSPARENT;
    private double square = 0;
    private double flat = 0;
    public Color getColor() {
        return color;
    }
    public void setColor(Color color){this.color = color;}
    public double getSquare(){return square;}
    public double getFlat(){return flat;}
    public void move(double moveX,double moveY){
    }
    public void draw() {
    }
}

