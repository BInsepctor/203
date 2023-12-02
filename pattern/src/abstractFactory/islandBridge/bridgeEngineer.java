package abstractFactory.islandBridge;

import abstractFactory.Engineer;

public class bridgeEngineer implements Engineer {
    @Override
    public void calculationTechnicalStandards() {
        System.out.println("Расчет и соблюдение тех. норм моста между остравами");
    }
}
