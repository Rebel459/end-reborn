package net.legacy.end_reborn;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class ERBlockTags {
    public static final TagKey<Block> CHORUS_BLOCKS = bind("chorus_blocks");

    @NotNull
    private static TagKey<Block> bind(@NotNull String path) {
        return TagKey.create(Registries.BLOCK, ERConstants.id(path));
    }

}