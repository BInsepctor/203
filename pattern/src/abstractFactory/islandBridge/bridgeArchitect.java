package abstractFactory.islandBridge;

import abstractFactory.Architect;

public class bridgeArchitect implements Architect {
    @Override
    public void layout() {
        System.out.println("Проектировка моста между остравами");
    }
}
