package net.rebel459.end_reborn;

import net.rebel459.end_reborn.client.ERModelLayers;
import net.rebel459.end_reborn.config.ERConfig;
import net.rebel459.end_reborn.registry.EREquipmentAssets;
import net.rebel459.unified.platform.UnifiedHelpers;
import net.rebel459.unified.platform.UnifiedPlatform;
import net.rebel459.unified.platform.client.UnifiedClientHelpers;
import net.rebel459.unified.util.PackType;

public final class EndRebornClient {

    public static void initRegistries() {
        ERModelLayers.init();
    }

    public static void init() {
        UnifiedClientHelpers.LEGACY_BABY_ARMOR.add(EREquipmentAssets.REMNANT);
        UnifiedClientHelpers.LEGACY_BABY_ARMOR.add(EREquipmentAssets.FEATHERZEAL);
        if (UnifiedPlatform.isModLoaded("enderscape") && ERConfig.get().enderscape_integration) {
            UnifiedHelpers.PACKS.add(EndReborn.id("enderscape_integration"), PackType.REQUIRED_RESOURCES);
        }
    }
}