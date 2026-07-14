package com.koshin.klsconfig.fabric.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ClientModInitializer;
import com.koshin.klsconfig.KlsConfig;
import com.koshin.klsconfig.client.KlsConfigClient;

public class FabricKlsConfigClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(KlsConfig.MOD_ID, EmptyLoadContext.INSTANCE, KlsConfigClient::initialize);
    }
}
