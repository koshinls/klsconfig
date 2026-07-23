package com.karengine.kar.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.blay09.mods.kuma.api.InputBinding;
import net.blay09.mods.kuma.api.Kuma;
import net.blay09.mods.kuma.api.ManagedKeyMapping;
import com.karengine.kar.KarEngine;

import static com.karengine.kar.KarEngine.id;

public class ModKeyMappings {

    public static ManagedKeyMapping yourKey;

    public static void initialize() {
        yourKey = Kuma.createKeyMapping(id("your_key"))
                .withDefault(InputBinding.key(InputConstants.KEY_B))
                .handleScreenInput(event -> {
                    KarEngine.logger.info("B was pressed - " + KarEngine.MOD_ID);
                    return true;
                })
                .build();
    }
}
