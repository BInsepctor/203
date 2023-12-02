package abstractFactory.pizzeria;

import abstractFactory.Engineer;

public class pizzaEngineer implements Engineer {
    @Override
    public void calculationTechnicalStandards() {
        System.out.println("Расчет и соблюдение тех. норм в пиццерии");
    }
}
