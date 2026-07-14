package com.koshin.klsconfig.neoforge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.neoforge.NeoForgeLoadContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import com.koshin.klsconfig.KlsConfig;

@Mod(KlsConfig.MOD_ID)
public class NeoForgeKlsConfig {

    public NeoForgeKlsConfig(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);
        Balm.initializeMod(KlsConfig.MOD_ID, context, KlsConfig::initialize);
    }
}
