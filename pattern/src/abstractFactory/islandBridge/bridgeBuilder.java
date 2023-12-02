package abstractFactory.islandBridge;

import abstractFactory.Builder;

public class bridgeBuilder implements Builder {
    @Override
    public void building() {
        System.out.println("Постройка моста между остравами");
    }
}
