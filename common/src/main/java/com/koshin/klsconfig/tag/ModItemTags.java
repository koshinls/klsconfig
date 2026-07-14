package com.koshin.klsconfig.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.koshin.klsconfig.KlsConfig.id;

public class ModItemTags {
    public static final TagKey<Item> YOUR_TAG = TagKey.create(Registries.ITEM, id("your_tag"));
}
