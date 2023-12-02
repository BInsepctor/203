package abstractFactory;

import abstractFactory.islandBridge.BridgeTeamFactory;

public class IslandBridgeOrderProject {
    public static void main(String[] args) {
        ConstructionTeamFactory constructionTeamFactory = new BridgeTeamFactory();
        Architect architect = constructionTeamFactory.getArchitect();
        Engineer engineer = constructionTeamFactory.getEngineer();
        Builder builder = constructionTeamFactory.getBuilder();

        System.out.println("Building bridge");
        architect.layout();
        engineer.calculationTechnicalStandards();
        builder.building();
    }
}
