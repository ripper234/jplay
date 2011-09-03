package org.jplay.guice;

import com.google.inject.Inject;

import java.util.Map;

public class StringUser {
    private final Map<String, String> map;

    @Inject
    public StringUser(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "" + map.toString();
    }
}
