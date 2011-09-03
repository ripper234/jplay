package org.jplay.guice;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

public class SubModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder.newMapBinder(binder(), String.class, String.class)
            .addBinding("Kane").toInstance("Abel");
    }
}
