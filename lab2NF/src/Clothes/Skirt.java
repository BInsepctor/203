package Clothes;

public class Skirt extends Clothes implements WomensСlothing{
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женская юбка: Размер - " + getSize() + ", Цвет - " + getColor() + ", Стоимость - " + getCost());
    }
}
