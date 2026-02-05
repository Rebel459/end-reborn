package net.legacy.end_reborn.tag;

import net.legacy.end_reborn.EndReborn;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class ERItemTags {
    public static final TagKey<Item> REMNANT_TOOL_MATERIALS = bind("remnium_tool_materials");
    public static final TagKey<Item> FEATHERZEAL_TOOL_MATERIALS = bind("featherzeal_tool_materials");
    public static final TagKey<Item> REPAIRS_REMNANT_ARMOR = bind("repairs_remnium_armor");
    public static final TagKey<Item> REPAIRS_FEATHERZEAL_ARMOR = bind("repairs_featherzeal_armor");
    public static final TagKey<Item> VOID_IMMUNE = bind("void_immune");
    public static final TagKey<Item> CHORUS_BLOCKS = bind("chorus_blocks");
    public static final TagKey<Item> REMNANT_UPGRADE_STONES = bind("remnant_upgrade_stones");

    @NotNull
    private static TagKey<Item> bind(@NotNull String path) {
        return TagKey.create(Registries.ITEM, EndReborn.id(path));
    }

}