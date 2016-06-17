package rubo.dagger2coffee.model;

import javax.inject.Inject;

public class CoffeeMaker {
    @Inject
    Heater heater;
    @Inject
    Pump pump;

    @Inject
    public CoffeeMaker() {
    }

    public void brew() {
        heater.on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}
