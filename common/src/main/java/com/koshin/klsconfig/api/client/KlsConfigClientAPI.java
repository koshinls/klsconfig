package com.koshin.klsconfig.api.client;

import java.lang.reflect.InvocationTargetException;

public class KlsConfigClientAPI {

    private static final InternalClientMethods __internalMethods;

    static {
        try {
            __internalMethods = (InternalClientMethods) Class.forName("com.koshin.klsconfig.client.InternalClientMethodsImpl").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
