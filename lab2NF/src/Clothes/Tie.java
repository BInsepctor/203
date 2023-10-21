package Clothes;

public class Tie extends Clothes implements MensСlothing{
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressMan() {
        System.out.println("Мужской галстук: Размер - " + getSize() + ", Цвет - " + getColor() + ", Стоимость - " + getCost());
    }
}

