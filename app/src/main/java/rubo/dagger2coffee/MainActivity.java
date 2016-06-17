package rubo.dagger2coffee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import javax.inject.Inject;

import rubo.dagger2coffee.component.DaggerMainActivityComponent;
import rubo.dagger2coffee.model.CoffeeMaker;
import rubo.dagger2coffee.module.DripCoffeeModule;
import rubo.dagger2coffee.module.PumpModule;

public class MainActivity extends AppCompatActivity {

    @Inject
    CoffeeMaker mCoffeeMaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder()
                .dripCoffeeModule(new DripCoffeeModule())
                .pumpModule(new PumpModule())
                .build().inject(this);
    }

    public void brew(View view) {
        mCoffeeMaker.brew();
    }
}
