package com.koshin.klsconfig.forge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.forge.ForgeLoadContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import com.koshin.klsconfig.KlsConfig;
import com.koshin.klsconfig.client.KlsConfigClient;

@Mod(KlsConfig.MOD_ID)
public class ForgeKlsConfig {

    public ForgeKlsConfig(FMLJavaModLoadingContext context) {
        final var loadContext = new ForgeLoadContext(context.getModEventBus());
        Balm.initializeMod(KlsConfig.MOD_ID, loadContext, KlsConfig::initialize);
        if (FMLEnvironment.dist.isClient()) {
            BalmClient.initializeMod(KlsConfig.MOD_ID, loadContext, KlsConfigClient::initialize);
        }
    }

}
