package com.koshin.klsconfig.api;

import java.lang.reflect.InvocationTargetException;

public class KlsConfigAPI {

    public static final String MOD_ID = "klsconfig";

    private static final InternalMethods __internalMethods;

    static {
        try {
            __internalMethods = (InternalMethods) Class.forName("com.koshin.klsconfig.InternalMethodsImpl").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
