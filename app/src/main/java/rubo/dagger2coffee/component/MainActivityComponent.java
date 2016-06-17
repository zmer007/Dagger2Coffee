package rubo.dagger2coffee.component;

import javax.inject.Singleton;

import dagger.Component;
import rubo.dagger2coffee.MainActivity;
import rubo.dagger2coffee.module.DripCoffeeModule;
import rubo.dagger2coffee.module.PumpModule;

@Singleton
@Component(modules = {DripCoffeeModule.class, PumpModule.class})
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
