package com.karengine.kar.item;

import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.item.DeferredItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import com.karengine.kar.KarEngine;

import static com.karengine.kar.KarEngine.id;

public class ModItems {
    public static DeferredItem yourItem;

    public static void initialize(BalmItemRegistrar items) {
        yourItem = items.register("your_item", Item::new).asDeferredItem();
    }

    public static void initialize(BalmCreativeModeTabRegistrar creativeModeTabs) {
        creativeModeTabs.register(KarEngine.MOD_ID, builder ->
                builder.title(Component.translatable(id(KarEngine.MOD_ID).toLanguageKey("itemGroup")))
                        .icon(() -> ModItems.yourItem.createStack())
                        .displayItems((displayParameters, output) -> {
                            output.accept(ModItems.yourItem);
                        })
        );
    }

}
