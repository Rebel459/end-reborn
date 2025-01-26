package net.legacy.end_reborn;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import org.jetbrains.annotations.NotNull;

public class ERBiomeTags {
    public static final TagKey<Biome> HAS_END_ORES = bind("has_end_ores");

    @NotNull
    private static TagKey<Biome> bind(@NotNull String path) {
        return TagKey.create(Registries.BIOME, ERConstants.id(path));
    }

}