package net.rebel459.end_reborn;

import net.minecraft.resources.Identifier;
import net.rebel459.end_reborn.config.ERConfig;
import net.rebel459.end_reborn.registry.*;
import net.rebel459.end_reborn.sound.ERSounds;
import net.rebel459.end_reborn.worldgen.ERFeatures;
import net.rebel459.unified.platform.UnifiedHelpers;
import net.rebel459.unified.platform.UnifiedPlatform;
import net.rebel459.unified.util.PackType;

/**
 * by Rebel459
 */
public class EndReborn {

    public static final String MOD_ID = "end_reborn";
    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    public static boolean isCombatRebornloaded = UnifiedPlatform.isModLoaded("combat_reborn");

	public static void initRegistries() {
		ERItems.init();
		ERBlocks.init();
		ERFeatures.init();
		ERLootTables.init();
		ERSounds.init();
		EREntityTypes.init();
		ERAttributes.init();
		ERRegistryAliases.init();
	}

	public static void init() {
		ERDataComponents.init();
		ERBlocks.registerBlockProperties();
		ERCreativeInventorySorting.init();
		ERLootTables.init();
		if (UnifiedPlatform.isModLoaded("trailiertales") && ERConfig.get().trailier_tales_integration) {
			UnifiedHelpers.PACKS.add(id("trailier_tales_integration"), PackType.REQUIRED_DATA);
		}
		if (UnifiedPlatform.isModLoaded("enderscape") && ERConfig.get().enderscape_integration) {
			UnifiedHelpers.PACKS.add(id("enderscape_integration"), PackType.REQUIRED_DATA);
		}
	}
}