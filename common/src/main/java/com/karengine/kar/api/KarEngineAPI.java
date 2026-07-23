package com.karengine.kar.api;

import java.lang.reflect.InvocationTargetException;

public class KarEngineAPI {

    public static final String MOD_ID = "kar";

    private static final InternalMethods __internalMethods;

    static {
        try {
            __internalMethods = (InternalMethods) Class.forName("com.karengine.kar.InternalMethodsImpl").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
