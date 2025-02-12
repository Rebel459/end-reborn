package net.legacy.end_reborn;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class ERItemTags {
    public static final TagKey<Item> REMNIUM_TOOL_MATERIALS = bind("remnium_tool_materials");
    public static final TagKey<Item> REPAIRS_REMNIUM_ARMOR = bind("repairs_remnium_armor");
    public static final TagKey<Item> GRAVITY_IMMUNE = bind("gravity_immune");
    public static final TagKey<Item> VOID_IMMUNE = bind("void_immune");
    public static final TagKey<Item> CHORUS_BLOCKS = bind("chorus_blocks");

    @NotNull
    private static TagKey<Item> bind(@NotNull String path) {
        return TagKey.create(Registries.ITEM, ERConstants.id(path));
    }

}