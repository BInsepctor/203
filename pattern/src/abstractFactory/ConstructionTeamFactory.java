package abstractFactory;

public interface ConstructionTeamFactory {
    Architect getArchitect();
    Engineer getEngineer();
    Builder getBuilder();
}
