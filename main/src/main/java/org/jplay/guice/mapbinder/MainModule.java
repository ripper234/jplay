package org.jplay.guice.mapbinder;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

public class MainModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder.newMapBinder(binder(), String.class, String.class)
            .addBinding("Adam").toInstance("Eve");
    }
}
