package net.rebel459.end_reborn.registry;

import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.rebel459.end_reborn.tag.ERItemTags;

import java.util.List;

public class ERToolMaterials {
    public static final ToolMaterial REMNANT = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3008, 9.0F, 4.0F, 15, ERItemTags.REMNANT_TOOL_MATERIALS);
    public static final ToolMaterial FEATHERZEAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 12.0F, 3.0F, 15, ERItemTags.FEATHERZEAL_TOOL_MATERIALS);

    public static List<Item> getFeatherzealTools() {
        return List.of(ERItems.FEATHERZEAL_SWORD.get(), ERItems.FEATHERZEAL_SPEAR.get(), ERItems.FEATHERZEAL_AXE.get(), ERItems.FEATHERZEAL_PICKAXE.get(), ERItems.FEATHERZEAL_SHOVEL.get(), ERItems.FEATHERZEAL_HOE.get());
    }

    public static double getFeatherzealAttackSpeedBonus(Item item) {
        if (item == ERItems.FEATHERZEAL_HOE.get()) return 0D;
        return 0.2D;
    }
}