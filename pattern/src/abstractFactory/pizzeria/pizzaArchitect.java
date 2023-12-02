package abstractFactory.pizzeria;

import abstractFactory.Architect;

public class pizzaArchitect implements Architect {
    @Override
    public void layout() {
        System.out.println("Проектировка помещения типа: пиццерия");
    }
}
