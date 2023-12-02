package abstractFactory.pizzeria;

import abstractFactory.Builder;

public class pizzaBuilder implements Builder {
    @Override
    public void building() {
        System.out.println("Постройка помещения типа: пиццерия");
    }
}
