package Clothes;

public class Trousers extends Clothes implements MensСlothing,WomensСlothing{
    public Trousers(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские брюки: Размер - " + getSize() + ", Цвет - " + getColor() + ", Стоимость - " + getCost());
    }

    @Override
    public void dressWoman() {
        System.out.println("Женские брюки: Размер - " + getSize() + ", Цвет - " + getColor() + ", Стоимость - " + getCost());
    }
}
