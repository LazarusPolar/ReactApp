package technology.josealmaraz.reactexample;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Usuario on 14/11/2017.
 */

@Module
public class ApplicationModule {
    private Application appplication;

    public ApplicationModule(Application appplication) {
        this.appplication = appplication;
    }

    @Provides
    @Singleton
    public Context providesContext(){
        return appplication;
    }
}
