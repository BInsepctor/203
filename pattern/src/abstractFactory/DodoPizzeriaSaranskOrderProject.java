package abstractFactory;

import abstractFactory.pizzeria.PizzeriasTeamFactory;

public class DodoPizzeriaSaranskOrderProject {
    public static void main(String[] args) {
        ConstructionTeamFactory constructionTeamFactory = new PizzeriasTeamFactory();
        Architect architect = constructionTeamFactory.getArchitect();
        Engineer engineer = constructionTeamFactory.getEngineer();
        Builder builder = constructionTeamFactory.getBuilder();

        System.out.println("Building pizzeria Dodo");
        architect.layout();
        engineer.calculationTechnicalStandards();
        builder.building();
    }
}
