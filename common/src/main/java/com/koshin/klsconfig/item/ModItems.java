package com.koshin.klsconfig.item;

import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.item.DeferredItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import com.koshin.klsconfig.KlsConfig;

import static com.koshin.klsconfig.KlsConfig.id;

public class ModItems {
    public static DeferredItem creativeWrench;

    public static void initialize(BalmItemRegistrar items) {
        creativeWrench = items.register("creative_wrench", Item::new).asDeferredItem();
    }

    public static void initialize(BalmCreativeModeTabRegistrar creativeModeTabs) {
        creativeModeTabs.register(KlsConfig.MOD_ID, builder ->
                builder.title(Component.translatable(id(KlsConfig.MOD_ID).toLanguageKey("itemGroup")))
                        .icon(() -> ModItems.creativeWrench.createStack())
                        .displayItems((displayParameters, output) -> {
                            output.accept(ModItems.creativeWrench);
                        })
        );
    }

}
