package abstractFactory.islandBridge;

import abstractFactory.Architect;
import abstractFactory.Builder;
import abstractFactory.ConstructionTeamFactory;
import abstractFactory.Engineer;

public class BridgeTeamFactory implements ConstructionTeamFactory {
    @Override
    public Architect getArchitect() {
        return new bridgeArchitect();
    }

    @Override
    public Engineer getEngineer() {
        return new bridgeEngineer();
    }

    @Override
    public Builder getBuilder() {
        return new bridgeBuilder();
    }
}
