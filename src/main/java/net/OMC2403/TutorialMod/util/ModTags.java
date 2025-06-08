package net.OMC2403.TutorialMod.util;

import net.OMC2403.TutorialMod.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Blocks
    {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");

        public static TagKey<Block> tag(String name)
        {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static TagKey<Item> tag(String name)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, name));
        }
    }
}