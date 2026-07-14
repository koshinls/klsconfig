package com.koshin.klsconfig.fabric;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ModInitializer;
import com.koshin.klsconfig.KlsConfig;

public class FabricKlsConfig implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initializeMod(KlsConfig.MOD_ID, EmptyLoadContext.INSTANCE, KlsConfig::initialize);
    }
}
