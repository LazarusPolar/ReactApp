package technology.josealmaraz.reactexample;

import android.app.Application;

/**
 * Created by Usuario on 14/11/2017.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return component;
    }
}
