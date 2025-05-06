package net.legacy.end_reborn.tag;

import net.legacy.end_reborn.ERConstants;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import org.jetbrains.annotations.NotNull;

public class ERBiomeTags {
    public static final TagKey<Biome> HAS_FORGOTTEN_REMAINS = bind("has_forgotten_remains");
    public static final TagKey<Biome> HAS_BONUS_DEBRIS = bind("has_bonus_debris");
    public static final TagKey<Biome> HAS_END_ORES = bind("has_end_ores");
    public static final TagKey<Biome> HAS_PURPUR_CLUSTERS = bind("has_purpur_clusters");

    @NotNull
    private static TagKey<Biome> bind(@NotNull String path) {
        return TagKey.create(Registries.BIOME, ERConstants.id(path));
    }

}