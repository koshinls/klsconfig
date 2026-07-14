package com.koshin.klsconfig;

import net.blay09.mods.balm.api.Balm;
import net.minecraft.resources.ResourceLocation;
import net.blay09.mods.balm.core.BalmRegistrars;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.koshin.klsconfig.block.ModBlocks;
import com.koshin.klsconfig.item.ModItems;

public class KlsConfig {

    public static final Logger logger = LoggerFactory.getLogger(KlsConfig.class);

    public static final String MOD_ID = "klsconfig";

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static KlsConfigConfig config() {
        return Balm.getConfig().getActiveConfig(KlsConfigConfig.class);
    }

    public static void initialize(BalmRegistrars registrars) {
        Balm.getConfig().registerConfig(KlsConfigConfig.class);

        registrars.blocks(ModBlocks::initialize);
        registrars.items(ModItems::initialize);
        registrars.creativeModeTabs(ModItems::initialize);
    }

}
