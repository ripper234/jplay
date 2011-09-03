package org.jplay.guice.mapbinder;

import com.google.inject.Guice;

public class Main {
    public static void main(String[] args) {
        System.out.println(Guice.createInjector(new MainModule()).getInstance(StringUser.class));
        System.out.println(Guice.createInjector(new MainModule(), new SubModule()).getInstance(StringUser.class));
    }
}
