package technology.josealmaraz.reactexample;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Usuario on 14/11/2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MainActivity target);
}
