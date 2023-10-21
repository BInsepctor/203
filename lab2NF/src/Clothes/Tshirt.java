package Clothes;

public class Tshirt extends Clothes implements MensСlothing,WomensСlothing{
    public Tshirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: Размер - " + getSize() + ", Цвет - " + getColor() + ", Стоимость - " + getCost());
    }

    @Override
    public void dressWoman() {
        System.out.println("Женская футболка: Размер - " + getSize() + ", Цвет - " + getColor() + ", Стоимость - " + getCost());
    }
}
