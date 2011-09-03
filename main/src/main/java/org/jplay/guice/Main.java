package org.jplay.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MainModule());

        StringUser instance = injector.getInstance(StringUser.class);
        System.out.println(instance);
    }
}
