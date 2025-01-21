package net.legacy.end_reborn;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class ERItemTags {
    public static final TagKey<Item> REMNANT_TOOL_MATERIALS = bind("remnant_tool_materials");
    public static final TagKey<Item> REPAIRS_REMNANT_ARMOR = bind("repairs_remnant_armor");

    @NotNull
    private static TagKey<Item> bind(@NotNull String path) {
        return TagKey.create(Registries.ITEM, ERConstants.id(path));
    }

}