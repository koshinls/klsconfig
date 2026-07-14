package com.koshin.klsconfig.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.blay09.mods.kuma.api.InputBinding;
import net.blay09.mods.kuma.api.Kuma;
import net.blay09.mods.kuma.api.ManagedKeyMapping;
import com.koshin.klsconfig.KlsConfig;

import static com.koshin.klsconfig.KlsConfig.id;

public class ModKeyMappings {

    public static ManagedKeyMapping yourKey;

    public static void initialize() {
        yourKey = Kuma.createKeyMapping(id("your_key"))
                .withDefault(InputBinding.key(InputConstants.KEY_B))
                .handleScreenInput(event -> {
                    KlsConfig.logger.info("B was pressed - " + KlsConfig.MOD_ID);
                    return true;
                })
                .build();
    }
}
