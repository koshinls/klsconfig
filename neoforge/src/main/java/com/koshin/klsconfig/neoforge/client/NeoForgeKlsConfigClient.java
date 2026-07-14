package com.koshin.klsconfig.neoforge.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.neoforge.NeoForgeLoadContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import com.koshin.klsconfig.KlsConfig;
import com.koshin.klsconfig.client.KlsConfigClient;

@Mod(value = KlsConfig.MOD_ID, dist = Dist.CLIENT)
public class NeoForgeKlsConfigClient {

    public NeoForgeKlsConfigClient(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);
        BalmClient.initializeMod(KlsConfig.MOD_ID, context, KlsConfigClient::initialize);
    }
}
