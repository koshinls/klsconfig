package com.karengine.kar;

import net.blay09.mods.balm.api.Balm;
import net.minecraft.resources.ResourceLocation;
import net.blay09.mods.balm.core.BalmRegistrars;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.karengine.kar.block.ModBlocks;
import com.karengine.kar.item.ModItems;

public class KarEngine {

    public static final Logger logger = LoggerFactory.getLogger(KarEngine.class);

    public static final String MOD_ID = "kar";

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static KarEngineConfig config() {
        return Balm.getConfig().getActiveConfig(KarEngineConfig.class);
    }

    public static void initialize(BalmRegistrars registrars) {
        logger.info("Initializing KAR Engine v0.1.0");
        Balm.getConfig().registerConfig(KarEngineConfig.class);

        registrars.blocks(ModBlocks::initialize);
        registrars.items(ModItems::initialize);
        registrars.creativeModeTabs(ModItems::initialize);
    }

}
