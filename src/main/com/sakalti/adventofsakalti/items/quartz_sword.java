package com.sakalti.adventofsakalti.items;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.ResourceLocation;

public class quartzsword extends SwordItem {
    public quartzsword(ToolMaterial material) {
        super(material, 12, -2.4F, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1));
        setRegistryName(new ResourceLocation("adventofsakalti", "quartz_sword"));
    }
}
