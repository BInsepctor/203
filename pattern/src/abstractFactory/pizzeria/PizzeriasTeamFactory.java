package abstractFactory.pizzeria;

import abstractFactory.Architect;
import abstractFactory.Builder;
import abstractFactory.ConstructionTeamFactory;
import abstractFactory.Engineer;

public class PizzeriasTeamFactory implements ConstructionTeamFactory {
    @Override
    public Architect getArchitect() {
        return new pizzaArchitect();
    }

    @Override
    public Engineer getEngineer() {
        return new pizzaEngineer();
    }

    @Override
    public Builder getBuilder() {
        return new pizzaBuilder();
    }
}
