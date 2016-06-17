package rubo.dagger2coffee.module;

import dagger.Module;
import dagger.Provides;
import rubo.dagger2coffee.model.ElectricHeater;
import rubo.dagger2coffee.model.Heater;

import javax.inject.Singleton;

@Module
public class DripCoffeeModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
