package rubo.dagger2coffee.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import rubo.dagger2coffee.model.Pump;
import rubo.dagger2coffee.model.Thermosiphon;

@Module
public class PumpModule {
    @Provides
    @Singleton
    Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
